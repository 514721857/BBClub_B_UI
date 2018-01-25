package com.bbc.bbclub.b.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.Scan.ScanActivity;
import com.bbc.bbclub.b.shop.ShopInfoActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class VerifyFragment extends Fragment {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.image_right)
    ImageView image_right;

    @InjectView(R.id.verify_scan_image)
    ImageView verify_scan_image;





    public VerifyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_verify, container, false);
        ButterKnife.inject(this,view);
        initView();
        return view;
    }

    private void initView() {
        top_view_back.setVisibility(View.GONE);
        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.main_person);
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("比比部落");
    }

    @OnClick({R.id.image_right,R.id.verify_scan_image})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.image_right:
                Intent intent=new Intent(getActivity(),ShopInfoActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.verify_scan_image:
                Intent intent1=new Intent(getActivity(),ScanActivity.class);
                getActivity().startActivity(intent1);
                break;

        }
    }


}
