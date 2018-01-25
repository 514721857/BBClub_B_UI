package com.bbc.bbclub.b.Scan;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ScanSuccessActivity extends Activity {

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.image_right)
    ImageView image_right;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_success);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.sign_record);

    }
    @OnClick({R.id.top_view_back,R.id.image_right})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.image_right:
                Intent intent=new Intent(ScanSuccessActivity.this,PersonInfoActivity.class);
                ScanSuccessActivity.this.startActivity(intent);
                break;


        }
    }
}
