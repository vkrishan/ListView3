package com.example.vkrishan.listview3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by vkrishan on 7/6/17.
 */

public class CustomAdapter extends BaseAdapter {

    String[] rowTitle;
    int[] rowId;
    Context mContext;

    // Constructor
    public CustomAdapter(MainActivity mainActivity, String[] rowTitle, int[] rowId){

        this.rowTitle = rowTitle;
        this.rowId = rowId;
        mContext = mainActivity;

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);

    }

    public int getCount(){
        return rowTitle.length;
    }

    public Object getItem(int position){
        return rowTitle[position];
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent){



    }





}
