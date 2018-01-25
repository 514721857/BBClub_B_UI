package com.bbc.bbclub.b.video;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.Account.FailAccountActivity;
import com.bbc.bbclub.b.Account.ShenHeActivity;
import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class UploadVideoActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("上传视频");
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
