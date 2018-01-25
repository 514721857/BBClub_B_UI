package com.bbc.bbclub.b.Scan;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.shop.UpdateAdressActivity;
import com.bbc.bbclub.b.shop.UpdateShopActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ScanActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText(R.string.scan_title);
    }
    @OnClick({R.id.top_view_back,R.id.top_view_title})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.top_view_title:
                Intent intent=new Intent(ScanActivity.this,ScanSuccessActivity.class);
                ScanActivity.this.startActivity(intent);
                break;
        }
    }
}
