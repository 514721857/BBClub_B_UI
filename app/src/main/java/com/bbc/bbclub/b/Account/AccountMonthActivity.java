package com.bbc.bbclub.b.Account;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.Adapter.AccountHeadClick;
import com.bbc.bbclub.b.Adapter.AccountMonthAdapter;
import com.bbc.bbclub.b.Adapter.BaseHeaderAdapter;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.Scan.ScanActivity;
import com.bbc.bbclub.b.Scan.ScanSuccessActivity;
import com.bbc.bbclub.b.util.DataServer;
import com.oushangfeng.pinnedsectionitemdecoration.PinnedHeaderItemDecoration;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class AccountMonthActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.account_month_list)
    RecyclerView mRecyclerView;

    @InjectView(R.id.account_btn)
    TextView account_btn;


    private AccountMonthAdapter accountMonthAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_month);
        ButterKnife.inject(this);
        initView();
    }
    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("8月");
        accountMonthAdapter = new AccountMonthAdapter(DataServer.getSampleDatas());
        mRecyclerView.addItemDecoration(new PinnedHeaderItemDecoration.Builder(BaseHeaderAdapter.TYPE_HEADER).setDividerId(R.drawable.divider).enableDivider(false)
                .setHeaderClickListener(new AccountHeadClick()).create());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(accountMonthAdapter);
    }
    @OnClick({R.id.top_view_back,R.id.account_btn})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.account_btn:
                Toast.makeText(AccountMonthActivity.this,"结算",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
