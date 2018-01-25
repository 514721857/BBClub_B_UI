package com.bbc.bbclub.b.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.Adapter.FlightAdapter;
import com.bbc.bbclub.b.Adapter.RecordAdapter;
import com.bbc.bbclub.b.Adapter.VideoAdapter;
import com.bbc.bbclub.b.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FlightFragment extends Fragment {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.flight_rv_list)
    RecyclerView flight_rv_list;

    FlightAdapter flightdAdapter;

    public FlightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flight, container, false);
        ButterKnife.inject(this,view);
        initView();
        return view;
    }
    private void initView() {

        top_view_back.setVisibility(View.GONE);
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("比比部落");
        flight_rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        flightdAdapter = new FlightAdapter(getActivity());
        flight_rv_list.setAdapter(flightdAdapter);
    }
}
