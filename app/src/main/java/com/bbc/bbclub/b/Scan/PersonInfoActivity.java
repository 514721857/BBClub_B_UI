package com.bbc.bbclub.b.Scan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.Adapter.PersonAdapter;
import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class PersonInfoActivity extends Activity {

    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.person_rv_list)
    RecyclerView person_rv_list;

    PersonAdapter personAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText(R.string.scan_person_info);
        person_rv_list.setLayoutManager(new LinearLayoutManager(this));
        personAdapter = new PersonAdapter();
        person_rv_list.setAdapter(personAdapter);
    }
    @OnClick({R.id.top_view_back,R.id.top_view_title})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
