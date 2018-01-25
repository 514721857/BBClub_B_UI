package com.bbc.bbclub.b.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.Account.FailAccountActivity;
import com.bbc.bbclub.b.Account.ShenHeActivity;
import com.bbc.bbclub.b.Adapter.RecordAdapter;
import com.bbc.bbclub.b.Adapter.VideoAdapter;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.video.EditVideoActivity;
import com.bbc.bbclub.b.video.UploadVideoActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.image_right)
    ImageView image_right;


    @InjectView(R.id.video_rv_list)
    RecyclerView video_rv_list;

    VideoAdapter videoAdapter;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        ButterKnife.inject(this,view);
        initView();
        return view;
    }
    private void initView() {
        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.add);
        top_view_back.setImageResource(R.mipmap.del);
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText(getString(R.string.my_video));
        video_rv_list.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        videoAdapter = new VideoAdapter();
        video_rv_list.setAdapter(videoAdapter);
    }
    @OnClick({R.id.top_view_back, R.id.image_right})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                Intent intent1 = new Intent(getActivity(), EditVideoActivity.class);
                getActivity().startActivity(intent1);
                break;
            case R.id.image_right:
                Intent intent = new Intent(getActivity(), UploadVideoActivity.class);
                getActivity().startActivity(intent);
                break;
        }
    }
}
