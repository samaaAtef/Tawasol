package com.example.sm.tablayoutdemo;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Video extends Fragment implements CameraBridgeViewBase.CvCameraViewListener {
    int count = 0;
    private CameraBridgeViewBase mOpenCvCameraView;
    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(getActivity()) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case LoaderCallbackInterface.SUCCESS: {
                    //للكاميرا الاماميه
                  //  mOpenCvCameraView.setCameraIndex(1);
                    mOpenCvCameraView.enableView();
                }
                break;
                default: {
                    super.onManagerConnected(status);
                }
                break;
            }
        }
    };
    TextView txtresponse,txtpredict;
    ImageView btn;
    @Override
    public void onResume() {
        super.onResume();
      //  OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_2_4_6, getActivity(), mLoaderCallback);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_video, container, false);
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        btn = (ImageView) view.findViewById(R.id.btncapture);
        mOpenCvCameraView = (CameraBridgeViewBase) view.findViewById(R.id.HelloOpenCvView2);
        txtresponse = (TextView) view.findViewById(R.id.txtpredictletter);
        txtpredict = (TextView) view.findViewById(R.id.txtpredict2);
        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        mOpenCvCameraView.setCvCameraViewListener(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOpenCvCameraView.disableView();
            }
        });
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }

    public void onDestroy() {
        super.onDestroy();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }

    Mat mRgba;

    public void onCameraViewStarted(int width, int height) {
        mRgba = new Mat(height, width, CvType.CV_8UC4);
    }


    public void onCameraViewStopped() {

    }

    @Override
    public Mat onCameraFrame(Mat inputFrame) {
        count++;
        if (count %10  == 0) {
            inputFrame.copyTo(mRgba);
            try {
                saveFrames();
                upload();
            } catch (IOException e) {
            }
        }
        return mRgba;


    }

    public String Server_add = "https://968e327b.ngrok.io";

    public void upload() {

        Bitmap image = Bitmap.createBitmap(mOpenCvCameraView.getWidth() / 4, mOpenCvCameraView.getHeight() / 4, Bitmap.Config.ARGB_8888);
        new UploadImage(image).execute();
    }

    public String r;

    private class UploadImage extends AsyncTask<Void, Void, Void> {
        Bitmap image;

        public UploadImage(Bitmap image) {
            this.image = image;
        }

        String encoded;

        @Override

        protected Void doInBackground(Void... params) {

            try {
                image = Bitmap.createBitmap(mRgba.cols(), mRgba.rows(), Bitmap.Config.ARGB_8888);
                Utils.matToBitmap(mRgba, image);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            image.compress(Bitmap.CompressFormat.JPEG, 40, bytes);

            encoded = com.example.sm.tablayoutdemo.Base64.encodeBytes(bytes.toByteArray());
            ArrayList<NameValuePair> datasent = new ArrayList<>();
            datasent.add(new BasicNameValuePair("image", encoded));
            HttpParams httpParams = getHttpRequestParams();
            HttpClient client = new DefaultHttpClient(httpParams);
            HttpPost post = new HttpPost(Server_add);
            try {
                post.setEntity((new UrlEncodedFormEntity(datasent)));
                HttpResponse response = client.execute(post);
                r = EntityUtils.toString(response.getEntity());

            } catch (UnsupportedEncodingException e) {

            } catch (IOException e) {

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            txtresponse.setText(r);
        }
    }

    private HttpParams getHttpRequestParams() {
        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 1000 * 30);
        HttpConnectionParams.setSoTimeout(httpParams, 1000 * 30);
        return httpParams;
    }

    int i = 1;
    int k2 = 0;

    public void saveFrames() throws IOException {
        String folder = Environment.getExternalStorageDirectory() + "/videos/frames/";
        File saveFolder = new File(folder);
        if (!saveFolder.exists()) {
            saveFolder.mkdirs();
        }
        Bitmap b = Bitmap.createBitmap(mOpenCvCameraView.getWidth() / 4, mOpenCvCameraView.getHeight() / 4, Bitmap.Config.ARGB_8888);
        try {
            b = Bitmap.createBitmap(mRgba.cols(), mRgba.rows(), Bitmap.Config.ARGB_8888);
            Utils.matToBitmap(mRgba, b);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            b.compress(Bitmap.CompressFormat.JPEG, 40, bytes);
            File f = new File(saveFolder, ("frame" + i + ".jpg"));
            f.createNewFile();
            FileOutputStream fo = new FileOutputStream(f);
            fo.write(bytes.toByteArray());
            fo.flush();
            fo.close();
            i++;
        }
    }
}