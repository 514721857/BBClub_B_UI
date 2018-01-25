package com.bbc.bbclub.b.shop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class UpdateShopActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.update_shop_rel_address)
    View update_shop_rel_address;

    @InjectView(R.id.update_shop_rel_shenfen)
    View update_shop_rel_shenfen;

    @InjectView(R.id.update_shop_rel_card)
    View update_shop_rel_card;

    @InjectView(R.id.update_shop_rel_zhizhao)
    View update_shop_rel_zhizhao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_shop_activity);

        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("修改信息");
    }
    @OnClick({R.id.top_view_back, R.id.image_right,R.id.update_shop_rel_address,R.id.update_shop_rel_shenfen,R.id.update_shop_rel_card,R.id.update_shop_rel_zhizhao})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.image_right:

                break;
            case R.id.update_shop_rel_address:
                Intent intent=new Intent(UpdateShopActivity.this,UpdateAdressActivity.class);
                UpdateShopActivity.this.startActivity(intent);
                Toast.makeText(UpdateShopActivity.this,"修改地址",Toast.LENGTH_LONG).show();
                break;
            case R.id.update_shop_rel_shenfen:
                Intent intent1=new Intent(UpdateShopActivity.this,CorporateActivity.class);
                UpdateShopActivity.this.startActivity(intent1);
                Toast.makeText(UpdateShopActivity.this,"法人身份",Toast.LENGTH_LONG).show();
                break;
            case R.id.update_shop_rel_card:
                Intent intent2=new Intent(UpdateShopActivity.this,BankCardActivity.class);
                UpdateShopActivity.this.startActivity(intent2);
                Toast.makeText(UpdateShopActivity.this,"银行公账号",Toast.LENGTH_LONG).show();
                break;
            case R.id.update_shop_rel_zhizhao:
                Intent intent3=new Intent(UpdateShopActivity.this,LicenseActivity.class);
                UpdateShopActivity.this.startActivity(intent3);
                Toast.makeText(UpdateShopActivity.this,"营业执照",Toast.LENGTH_LONG).show();
                break;

        }
    }

}
