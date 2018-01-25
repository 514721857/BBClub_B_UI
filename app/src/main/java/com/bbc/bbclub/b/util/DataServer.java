package com.bbc.bbclub.b.util;
import com.bbc.bbclub.b.Adapter.BaseHeaderAdapter;
import com.bbc.bbclub.b.Bean.AccountMonth;
import com.bbc.bbclub.b.Bean.AccountSection;
import com.bbc.bbclub.b.Bean.MySection;
import com.bbc.bbclub.b.Bean.PersonItem;
import com.bbc.bbclub.b.Bean.PinnedHeaderEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class DataServer {

    private static final String HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK = "https://avatars1.githubusercontent.com/u/7698209?v=3&s=460";
    private static final String CYM_CHAD = "CymChad";

    private DataServer() {
    }

    public static List<PersonItem> getSampleData(int lenth) {
        List<PersonItem> list = new ArrayList<>();
        for (int i = 0; i < lenth; i++) {
            PersonItem status = new PersonItem();
            status.setUserName("广州比比部落" + i);
            status.setCreatedAt("04/05/" + i);
            status.setRetweet(i % 2 == 0);
            status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
            status.setText("2017-08-12  18:20");
            list.add(status);
        }
        return list;
    }

    public static List<PersonItem> getFlightData(int lenth) {
        List<PersonItem> list = new ArrayList<>();
        for (int i = 0; i < lenth; i++) {
            PersonItem status = new PersonItem();
            status.setUserName("陈赫" );
            status.setCreatedAt("22");
            status.setUserAvatar("13794678782");
            status.setText("10");
            list.add(status);
        }
        return list;
    }

    public static List<PersonItem> addData(List list, int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            PersonItem status = new PersonItem();
            status.setUserName("Chad" + i);
            status.setCreatedAt("04/05/" + i);
            status.setRetweet(i % 2 == 0);
            status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
            status.setText("Powerful and flexible RecyclerAdapter https://github.com/CymChad/BaseRecyclerViewAdapterHelper");
            list.add(status);
        }

        return list;
    }


    public static List<MySection> getSampleData() {
        List<MySection> list = new ArrayList<>();
        list.add(new MySection(true, "2017", true));
        list.add(new MySection(new AccountSection("12月", "55次")));
        list.add(new MySection(new AccountSection("11月", "55次")));
        list.add(new MySection(new AccountSection("10月", "55次")));
        list.add(new MySection(new AccountSection("9月", "55次")));
        list.add(new MySection(new AccountSection("8月", "55次")));
        list.add(new MySection(new AccountSection("7月", "55次")));
        list.add(new MySection(new AccountSection("6月", "55次")));
        list.add(new MySection(new AccountSection("5月", "55次")));
        list.add(new MySection(new AccountSection("4月", "55次")));
        list.add(new MySection(new AccountSection("3月", "55次")));
        list.add(new MySection(new AccountSection("2月", "55次")));
        list.add(new MySection(new AccountSection("1月", "55次")));
        list.add(new MySection(true, "2016", false));
        list.add(new MySection(new AccountSection("12月", "55次")));
        list.add(new MySection(new AccountSection("11月", "55次")));
        list.add(new MySection(new AccountSection("10月", "55次")));
        list.add(new MySection(new AccountSection("9月", "55次")));
        list.add(new MySection(new AccountSection("8月", "55次")));
        list.add(new MySection(new AccountSection("7月", "55次")));
        list.add(new MySection(new AccountSection("6月", "55次")));
        list.add(new MySection(new AccountSection("5月", "55次")));
        list.add(new MySection(new AccountSection("4月", "55次")));
        list.add(new MySection(new AccountSection("3月", "55次")));
        list.add(new MySection(new AccountSection("2月", "55次")));
        list.add(new MySection(new AccountSection("1月", "55次")));
        list.add(new MySection(true, "2015", false));
        list.add(new MySection(new AccountSection("12月", "55次")));
        list.add(new MySection(new AccountSection("11月", "55次")));
        return list;
    }
    public static  List<PinnedHeaderEntity<AccountMonth>> getSampleDatas() {

        List<PinnedHeaderEntity<AccountMonth>> data = new ArrayList<>();

        data.add(new PinnedHeaderEntity<AccountMonth>(null, BaseHeaderAdapter.TYPE_HEADER, "8.22"));

        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.22"));



        data.add(new PinnedHeaderEntity<AccountMonth>(null, BaseHeaderAdapter.TYPE_HEADER, "8.21"));

        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("MC Hot Dog","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.21"));

        data.add(new PinnedHeaderEntity<AccountMonth>(null, BaseHeaderAdapter.TYPE_HEADER, "8.20"));

        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));
        data.add(new PinnedHeaderEntity<AccountMonth>(new AccountMonth("潘玮柏","12:13"), BaseHeaderAdapter.TYPE_DATA, "8.20"));

        return data;

    }






    public static List<String> getStrData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String str = HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK;
            if (i % 2 == 0) {
                str = CYM_CHAD;
            }
            list.add(str);
        }
        return list;
    }

//    public static List<MultipleItem> getMultipleChildView() {
//        List<MultipleItem> list = new ArrayList<>();
//        for (int i = 0; i <= 4; i++) {
//            list.add(new ClickEntity(ClickEntity.CLICK_ITEM_VIEW, MultipleItem.TEXT_SPAN_SIZE, CYM_CHAD));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.BIG_IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
//        }
//
//        return list;
//    }


}
