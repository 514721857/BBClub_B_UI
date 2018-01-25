package com.bbc.bbclub.b.shop;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class CorporateActivity extends Activity {
    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText(getString(R.string.shop_upload_person));
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
