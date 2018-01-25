package com.bbc.bbclub.b.fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.Account.AccountMonthActivity;
import com.bbc.bbclub.b.Adapter.AccountAdapter;
import com.bbc.bbclub.b.Adapter.FlightAdapter;
import com.bbc.bbclub.b.Bean.MySection;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.Scan.ScanActivity;
import com.bbc.bbclub.b.Scan.ScanSuccessActivity;
import com.bbc.bbclub.b.util.DataServer;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.account_rv_list)
    RecyclerView account_rv_list;

    AccountAdapter accountAdapter;
    private List<MySection> mData;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        ButterKnife.inject(this,view);
        initView();
        return view;
    }
    private void initView() {
        top_view_back.setVisibility(View.GONE);
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("比比部落");
        account_rv_list.setLayoutManager(new GridLayoutManager(getActivity(),3));
//        super(R.layout.item_account_view, R.layout.item_account_head_view, data);
        mData=DataServer.getSampleData();
        accountAdapter = new AccountAdapter(R.layout.item_account_view, R.layout.item_account_head_view,mData);
        account_rv_list.setAdapter(accountAdapter);
        accountAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                MySection mySection = mData.get(position);
                if (mySection.isHeader){
                    Toast.makeText(getActivity(), mySection.header, Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent=new Intent(getActivity(),AccountMonthActivity.class);
                    getActivity().startActivity(intent);
                }
            }
        });
    }
}
