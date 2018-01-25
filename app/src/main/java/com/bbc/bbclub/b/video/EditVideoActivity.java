package com.bbc.bbclub.b.video;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.Adapter.VideoAdapter;
import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 *
 */
public class EditVideoActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.top_view_right_text)
    TextView top_view_right_text;


    @InjectView(R.id.video_edit_list)
    RecyclerView video_rv_list;

    VideoAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_video);
        ButterKnife.inject(this);
        initView();
    }


    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("删除视频");
        top_view_right_text.setVisibility(View.VISIBLE);
        top_view_right_text.setText("全选");
        video_rv_list.setLayoutManager(new GridLayoutManager(this, 2));
        videoAdapter = new VideoAdapter();
        video_rv_list.setAdapter(videoAdapter);

    }
    @OnClick({R.id.top_view_back})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
