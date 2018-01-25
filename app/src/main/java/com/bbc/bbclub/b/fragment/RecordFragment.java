package com.bbc.bbclub.b.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.appeaser.sublimepickerlibrary.datepicker.SelectedDate;
import com.appeaser.sublimepickerlibrary.helpers.SublimeOptions;
import com.appeaser.sublimepickerlibrary.recurrencepicker.SublimeRecurrencePicker;
import com.bbc.bbclub.b.Adapter.RecordAdapter;
import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.util.SublimePickerFragment;

import java.util.Calendar;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecordFragment extends Fragment {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.recycle_rv_list)
    RecyclerView recycle_rv_list;

    RecordAdapter recordAdapter;


    public RecordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, container, false);
        ButterKnife.inject(this,view);
        initView();
        return view;


    }
    private void initView() {
        top_view_title.setText("2017-8-14");
        recycle_rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        recordAdapter = new RecordAdapter();
        recycle_rv_list.setAdapter(recordAdapter);
    }
    @OnClick({R.id.top_view_title})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_title:
                openTimeSelect();
                break;

        }
    }

    private void openTimeSelect() {
        // DialogFragment to host SublimePicker
        SublimePickerFragment pickerFrag = new SublimePickerFragment();
        pickerFrag.setCallback(mFragmentCallback);

        // Options
        Pair<Boolean, SublimeOptions> optionsPair = getOptions();

        if (!optionsPair.first) { // If options are not valid
            Toast.makeText(getActivity(), "No pickers activated",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        // Valid options
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUBLIME_OPTIONS", optionsPair.second);
        pickerFrag.setArguments(bundle);

        pickerFrag.setStyle(DialogFragment.STYLE_NO_TITLE, 0);
        pickerFrag.show(getActivity().getFragmentManager(), "SUBLIME_PICKER");




    }

    // 时间选择的样式
    Pair<Boolean, SublimeOptions> getOptions() {
        SublimeOptions options = new SublimeOptions();
        int displayOptions = 0;
        displayOptions |= SublimeOptions.ACTIVATE_DATE_PICKER;
//        displayOptions |= SublimeOptions.ACTIVATE_TIME_PICKER;
        options.setPickerToShow(SublimeOptions.Picker.DATE_PICKER);
        options.setDisplayOptions(displayOptions);
        // Enable/disable the date range selection feature
        options.setCanPickDateRange(true);

        // If 'displayOptions' is zero, the chosen options are not valid
        return new Pair<>(displayOptions != 0 ? Boolean.TRUE : Boolean.FALSE, options);
    }
    //时间选择监听返回
    SublimePickerFragment.Callback mFragmentCallback = new SublimePickerFragment.Callback() {
        @Override
        public void onCancelled() {
        }
        @Override
        public void onDateTimeRecurrenceSet(SelectedDate selectedDate,
                                            int hourOfDay, int minute,
                                            SublimeRecurrencePicker.RecurrenceOption recurrenceOption,
                                            String recurrenceRule) {
            top_view_title.setText((String.valueOf(selectedDate.getStartDate().get(Calendar.YEAR)) + "-" + String.valueOf(selectedDate.getStartDate().get(Calendar.MONTH) + 1) + "-"
                    + String.valueOf(selectedDate.getStartDate().get(Calendar.DAY_OF_MONTH))).trim());
        }
    };
}
