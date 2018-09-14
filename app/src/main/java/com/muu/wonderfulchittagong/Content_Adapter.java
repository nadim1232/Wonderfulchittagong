package com.muu.wonderfulchittagong;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Content_Adapter extends ArrayAdapter<String> {


    Activity context;
    String[] contentID;
    String[] typeID;
    Integer[] imageID;

    public Content_Adapter(@NonNull Activity context, String[] contentID, String[] typeID, Integer[] imageID) {
        super(context, R.layout.content_view, contentID);
        this.contentID=contentID;
        this.typeID=typeID;
        this.imageID=imageID;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View content_view=inflater.inflate(R.layout.content_view,null,true);

        TextView content=content_view.findViewById(R.id.contentID);
        TextView type=content_view.findViewById(R.id.typeID);
        ImageView photo=content_view.findViewById(R.id.photoID);

        content.setText(contentID[position]);
        type.setText(typeID[position]);
        photo.setImageResource(imageID[position]);


        return content_view;
    }
}

