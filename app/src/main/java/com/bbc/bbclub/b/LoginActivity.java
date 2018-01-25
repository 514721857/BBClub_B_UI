package com.bbc.bbclub.b;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bbc.bbclub.b.Scan.ScanActivity;
import com.bbc.bbclub.b.Scan.ScanSuccessActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends Activity {
    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.inject(this);
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
