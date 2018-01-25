package com.bbc.bbclub.b.Adapter;

import com.bbc.bbclub.b.Bean.PersonItem;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.util.CommonViewHolder;
import com.bbc.bbclub.b.util.DataServer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Administrator on 2017/8/24.
 */


public class VideoAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> {
    public VideoAdapter() {
        super(R.layout.item_video_view, DataServer.getSampleData(10));
    }


    @Override
    protected void convert(CommonViewHolder baseViewHolder, PersonItem personItem) {
       /* baseViewHolder.setText(R.id.tv, personItem.getUserName());
        baseViewHolder.setText(R.id.tv1, personItem.getText());
        baseViewHolder.setImageResource(R.id.img, R.mipmap.ic_launcher_round);*/

    }
}