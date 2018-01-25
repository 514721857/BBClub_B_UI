package com.bbc.bbclub.b.Adapter;

import android.view.View;

import com.bbc.bbclub.b.Bean.AccountSection;
import com.bbc.bbclub.b.Bean.MySection;
import com.bbc.bbclub.b.Bean.PersonItem;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.util.CommonViewHolder;
import com.bbc.bbclub.b.util.DataServer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */


public class AccountAdapter extends BaseSectionQuickAdapter<MySection,CommonViewHolder> {
    private List<MySection> mData;
    public AccountAdapter(int layoutResId, int sectionHeadResId, List data) {
        super(layoutResId, sectionHeadResId, data);
    }
/*    public AccountAdapter( List<MySection> data) {

        super(R.layout.item_account_view, R.layout.item_account_head_view, data);


    }*/

    @Override
    protected void convertHead(CommonViewHolder baseViewHolder, MySection mySection) {
        baseViewHolder.setText(R.id.account_titles, mySection.header);
        baseViewHolder.setOnClickListener(R.id.account_titles, new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void convert(CommonViewHolder baseViewHolder, MySection mySection) {
        AccountSection account = (AccountSection) mySection.t;
        baseViewHolder.setText(R.id.account_title, account.getMonth());
        baseViewHolder.setText(R.id.times_title, account.getTimes());

    }
}