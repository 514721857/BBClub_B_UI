package com.bbc.bbclub.b.Adapter;

import android.content.Context;
import android.widget.TextView;

import com.bbc.bbclub.b.Bean.PersonItem;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.util.CommonViewHolder;
import com.bbc.bbclub.b.util.DataServer;
import com.bbc.bbclub.b.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Administrator on 2017/8/24.
 */


public class FlightAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> {
    Context contexts;
    public FlightAdapter(Context context) {
        super(R.layout.item_flight_view, DataServer.getFlightData(5));
        contexts=context;
    }


    @Override
    protected void convert(CommonViewHolder baseViewHolder, PersonItem personItem) {
        TextView name= baseViewHolder.getView(R.id.flight_name);
        Utils.addForeColorSpan(name,personItem.getUserName(),contexts);

        TextView age= baseViewHolder.getView(R.id.flight_age);
        Utils.addForeColorSpan(age,personItem.getCreatedAt(),contexts);

        TextView sign= baseViewHolder.getView(R.id.flight_sign_time);
        Utils.addForeColorSpan(sign,personItem.getText(),contexts);

        TextView phonetext= baseViewHolder.getView(R.id.flight_phone);
        Utils.addForeColorSpan(phonetext,personItem.getUserAvatar(),contexts);

    }
}