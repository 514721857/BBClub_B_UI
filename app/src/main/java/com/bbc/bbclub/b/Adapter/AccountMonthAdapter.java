package com.bbc.bbclub.b.Adapter;

import com.bbc.bbclub.b.Bean.AccountMonth;
import com.bbc.bbclub.b.Bean.PinnedHeaderEntity;
import com.bbc.bbclub.b.R;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */

public class AccountMonthAdapter extends BaseHeaderAdapter<PinnedHeaderEntity<AccountMonth>> {
    public AccountMonthAdapter(List<PinnedHeaderEntity<AccountMonth>> data) {
        super(data);
    }

    @Override
    protected void addItemTypes() {
        addItemType(BaseHeaderAdapter.TYPE_HEADER, R.layout.item_account_month_head_view);
        addItemType(BaseHeaderAdapter.TYPE_DATA, R.layout.item_account_month_view);
    }

    @Override
    protected void convert(BaseViewHolder helper, PinnedHeaderEntity<AccountMonth> item) {
        switch (helper.getItemViewType()) {
            case BaseHeaderAdapter.TYPE_HEADER:
                helper.setText(R.id.account_month_titles, item.getPinnedHeaderName());
                break;
            case BaseHeaderAdapter.TYPE_DATA:
                AccountMonth month=(AccountMonth) item.getData();
                helper.setText(R.id.account_title,month.getName());
                helper.setText(R.id.times_title,month.getDo_time());
                break;
        }
    }
}
