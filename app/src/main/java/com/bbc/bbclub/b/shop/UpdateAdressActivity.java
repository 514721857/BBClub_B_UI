package com.bbc.bbclub.b.shop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.util.AddressPickTask;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.addapp.pickers.entity.City;
import cn.addapp.pickers.entity.County;
import cn.addapp.pickers.entity.Province;

public class UpdateAdressActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.text_city_select)
    TextView text_city_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_adress);
        ButterKnife.inject(this);

        initView();
    }
    private void initView() {

        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText(getString(R.string.shop_update_address));


    }
    @OnClick({R.id.top_view_back,R.id.text_city_select})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.text_city_select:
                AddressPickTask task = new AddressPickTask(this);
                task.setHideProvince(false);
                task.setHideCounty(false);
                task.setCallback(new AddressPickTask.Callback() {
                    @Override
                    public void onAddressInitFailed() {
                        Toast.makeText(UpdateAdressActivity.this,"数据初始化失败",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onAddressPicked(Province province, City city, County county) {
                        if (county == null) {
                            text_city_select.setText(province.getAreaName() + city.getAreaName());
                        } else {
                            text_city_select.setText(province.getAreaName() + city.getAreaName() + county.getAreaName());

                        }
                    }
                });
                task.execute("广东", "广州", "荔湾");
                break;
        }
    }


}
