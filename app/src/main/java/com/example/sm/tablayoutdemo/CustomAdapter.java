package com.example.sm.tablayoutdemo;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    public CustomAdapter()
    {super();}

//تعديل***************************************
    private List<String> name=null;


            List<String> filterdname=null;
    ItemFilter mfilter=new ItemFilter();


    //******************************************
    private Context context;
    private LayoutInflater layoutInflater;
    private  Typeface typeface;



    public CustomAdapter(Context context,Typeface typeface ,List<String> name) {

        this.layoutInflater=LayoutInflater.from(context);

        this.name=name;
        this.typeface=typeface;

        this.filterdname=name;
    }

    @Override
    public int getCount() {
        //**************************************تعديل
        return name.size();

    }




    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.listcontent, null,false);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.textview);
            holder.textView.setHeight(100);
            holder.textView.setTextSize(17);
           holder.textView.setTypeface(typeface);
            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();
        }
        if(position<filterdname.size())
        {
        holder.textView.setText(filterdname.get(position));

        }
        return convertView;
    }

    static class ViewHolder
    {TextView textView;}

    public Filter getFilter() {
        return mfilter;
    }

    private class ItemFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            String filterString = charSequence.toString();
            FilterResults results=new FilterResults();
            if(charSequence != null && charSequence.length()>0) {
                final List<String> list = name;
                int count = list.size();
                final ArrayList<String> nlist = new ArrayList<String>(count);
                String filterableString;
                for (int i = 0; i < count; i++) {
                    filterableString = list.get(i);
                    if (filterableString.contains(filterString)) {
                        nlist.add(filterableString);
                    }

                }
                results.values=nlist;
                results.count=nlist.size();
            }

            else
            {
                results.count=filterdname.size();
                results.values=filterdname;
            }
            return results;
        }
        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            filterdname=(ArrayList<String>)filterResults.values;
            notifyDataSetChanged();
        }
    }
}