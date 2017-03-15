package com.example.terz99.gridview;

import android.content.Context;
import android.support.annotation.IntegerRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.ArrayList;

/**
 * Created by terz99 on 3/15/17.
 */

class ImageAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> photoIds;

    public ImageAdapter(Context context) {
        this.context = context;

        photoIds = new ArrayList<Integer>();

        photoIds.add(R.drawable.sample_0);
        photoIds.add(R.drawable.sample_1);
        photoIds.add(R.drawable.sample_2);
        photoIds.add(R.drawable.sample_3);
        photoIds.add(R.drawable.sample_4);
        photoIds.add(R.drawable.sample_5);
        photoIds.add(R.drawable.sample_6);
        photoIds.add(R.drawable.sample_7);
        photoIds.add(R.drawable.sample_0);
        photoIds.add(R.drawable.sample_1);
        photoIds.add(R.drawable.sample_2);
        photoIds.add(R.drawable.sample_3);
        photoIds.add(R.drawable.sample_4);
        photoIds.add(R.drawable.sample_5);
        photoIds.add(R.drawable.sample_6);
        photoIds.add(R.drawable.sample_7);
        photoIds.add(R.drawable.sample_0);
        photoIds.add(R.drawable.sample_1);
        photoIds.add(R.drawable.sample_2);
        photoIds.add(R.drawable.sample_3);
        photoIds.add(R.drawable.sample_4);
        photoIds.add(R.drawable.sample_5);
        photoIds.add(R.drawable.sample_6);
        photoIds.add(R.drawable.sample_7);
        photoIds.add(R.drawable.sample_0);
        photoIds.add(R.drawable.sample_1);
        photoIds.add(R.drawable.sample_2);
        photoIds.add(R.drawable.sample_3);
        photoIds.add(R.drawable.sample_4);
        photoIds.add(R.drawable.sample_5);
        photoIds.add(R.drawable.sample_6);
        photoIds.add(R.drawable.sample_7);
        photoIds.add(R.drawable.sample_0);
        photoIds.add(R.drawable.sample_1);
        photoIds.add(R.drawable.sample_2);
        photoIds.add(R.drawable.sample_3);
        photoIds.add(R.drawable.sample_4);
        photoIds.add(R.drawable.sample_5);
        photoIds.add(R.drawable.sample_6);
        photoIds.add(R.drawable.sample_7);
    }

    @Override
    public int getCount() {
        return photoIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if(convertView == null){

            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(photoIds.get(position));
        return imageView;
    }
}
