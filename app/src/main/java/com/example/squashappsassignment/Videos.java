package com.example.squashappsassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Videos extends Fragment {

    List<VideoData> videoData=new ArrayList<>();
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.videos_likes, container, false);
        GridView gridview=root.findViewById(R.id.gridview);

        for (int i=0;i<6;i++){
            videoData.add(new VideoData(R.drawable.lotus_temple,"121K"));
        videoData.add(new VideoData(R.drawable.charminar,"4560K"));
        videoData.add(new VideoData(R.drawable.esha,"264K"));
        videoData.add(new VideoData(R.drawable.india_gate,"160K"));
        videoData.add(new VideoData(R.drawable.kanyakumari,"460K"));

        videoData.add(new VideoData(R.drawable.taj_mahal,"190K"));
        videoData.add(new VideoData(R.drawable.ooty,"770K"));}

        gridview.setAdapter(new VideosGridviewAdapter(getContext(), videoData));

        return root;
    }
}
