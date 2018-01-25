package com.bbc.bbclub.b.shop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.LoginActivity;
import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ShopInfoActivity extends Activity  {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.image_right)
    ImageView image_right;

    @InjectView(R.id.btn_login_out)
    Button btn_login_out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_info);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {

        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.edit);
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("店铺信息");

    }
    @OnClick({R.id.top_view_back, R.id.image_right,R.id.btn_login_out})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
               finish();
                break;
            case R.id.image_right:
                Intent intent=new Intent(ShopInfoActivity.this,UpdateShopActivity.class);
                ShopInfoActivity.this.startActivity(intent);
                break;
            case R.id.btn_login_out:
                Intent intent1=new Intent(ShopInfoActivity.this,LoginActivity.class);
                ShopInfoActivity.this.startActivity(intent1);
                break;

        }
    }
}
