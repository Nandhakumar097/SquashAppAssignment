package com.example.squashappsassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class VideosGridviewAdapter extends BaseAdapter {
    List<VideoData> videoData;
    Context mContext;

    public VideosGridviewAdapter(Context context, List<VideoData> videoData) {
        mContext=context;
        this.videoData=videoData;
    }

    @Override
    public int getCount() {
        return videoData.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView=inflater.inflate(R.layout.video_grid, null);
        ImageView imageView=gridView.findViewById(R.id.image);
        TextView text=gridView.findViewById(R.id.text);
        VideoData videoData=this.videoData.get(i);
        imageView.setImageResource(videoData.getImage());
        text.setText(videoData.getText());
        return gridView;
    }
}
