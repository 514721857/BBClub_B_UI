package com.bbc.bbclub.b;

import android.app.Activity;

import android.app.FragmentTransaction;
import android.os.Bundle;


import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.b.fragment.AccountFragment;
import com.bbc.bbclub.b.fragment.FlightFragment;
import com.bbc.bbclub.b.fragment.RecordFragment;
import com.bbc.bbclub.b.fragment.VerifyFragment;
import com.bbc.bbclub.b.fragment.VideoFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends Activity {
   private AccountFragment accountFragment;
    private FlightFragment flighttFragment;
    private RecordFragment recordFragment;
    private VideoFragment videoFragment;
    private VerifyFragment verifyFragment;


    @InjectView(R.id.verify_layout)
    View verify_layout;


    @InjectView(R.id.sign_layout)
    View sign_layout;

    @InjectView(R.id.video_layout)
    View video_layout;

    @InjectView(R.id.flight_layout)
    View flight_layout;

    @InjectView(R.id.account_layout)
    View account_layout;




    @InjectView(R.id.verify_image)
    ImageView verify_image;

    @InjectView(R.id.flight_image)
    ImageView flight_image;

    @InjectView(R.id.sign_image)
    ImageView sign_image;

    @InjectView(R.id.video_image)
    ImageView video_image;

    @InjectView(R.id.account_image)
    ImageView account_image;


    @InjectView(R.id.verify_text)
    TextView verify_text;

    @InjectView(R.id.sign_text)
    TextView sign_text;

    @InjectView(R.id.video_text)
    TextView video_text;

    @InjectView(R.id.flight_text)
    TextView flight_text;

    @InjectView(R.id.account_text)
    TextView account_text;


    private int chooseIndex = 0;//选择项
    private FragmentTransaction transaction;
    long firstTime;
    private boolean iscycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        setTabSelection(chooseIndex);
    }

    @OnClick({R.id.verify_layout, R.id.sign_layout, R.id.video_layout, R.id.flight_layout,R.id.account_layout})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.verify_layout:
                chooseIndex = 0;
                setTabSelection(0);
                break;
            case R.id.sign_layout:
                chooseIndex = 1;
                setTabSelection(1);
                break;
            case R.id.video_layout:
                chooseIndex = 2;
                setTabSelection(2);
                break;
            case R.id.flight_layout:
                chooseIndex = 3;
                setTabSelection(3);
                break;
            case R.id.account_layout:
                chooseIndex = 4;
                setTabSelection(4);
                break;
        }
    }


            /**
             * 根据传入的index参数来设置选中的tab页。
             *
             * @param index
             *
             */
    private void setTabSelection(int index) {
        transaction=  getFragmentManager().beginTransaction();
        hideFragments(transaction);
        setImageText(index);
        switch (index) {
            case 0:
                if (verifyFragment == null) {

                    verifyFragment = new VerifyFragment();
                    transaction.add(R.id.content, verifyFragment);
                } else {

                    transaction.show(verifyFragment);
                }
                transaction.commit();

                break;
            case 1:
                if (recordFragment == null) {
                    recordFragment = new RecordFragment();

                    transaction.add(R.id.content, recordFragment);
                } else {

                    transaction.show(recordFragment);
                }
                transaction.commit();
                break;
            case 2:
                if (videoFragment == null) {

                    videoFragment = new VideoFragment();
                    transaction.add(R.id.content, videoFragment);
                } else {

                    transaction.show(videoFragment);
                }
                transaction.commit();
//                }


                break;
            case 3:
                if (flighttFragment == null) {

                    flighttFragment = new FlightFragment();
                    transaction.add(R.id.content, flighttFragment);
                } else {

                    transaction.show(flighttFragment);
                }
                transaction.commit();
                break;

            case 4:
                if (accountFragment == null) {

                    accountFragment = new AccountFragment();
                    transaction.add(R.id.content, accountFragment);
                } else {

                    transaction.show(accountFragment);
                }
                transaction.commit();
                break;



        }

    }

    /**
     * @param index
     */
    private void setImageText(int index) {

        clearSelection();
        switch (index) {
            case 0:
                // 当点击了tab时，改变控件的图片和文字颜色
                verify_image.setImageResource(R.mipmap.main_verify_select);
                verify_text.setTextColor(getResources().getColorStateList(
                        R.color.main_text_select));
                break;
            case 1:
                sign_image.setImageResource(R.mipmap.main_sign_select);
                sign_text.setTextColor(getResources().getColorStateList(
                        R.color.main_text_select));
                break;
            case 2:
                video_image.setImageResource(R.mipmap.main_video_select);
                video_text.setTextColor(getResources().getColorStateList(
                        R.color.main_text_select));
                break;

            case 3:
                flight_image.setImageResource(R.mipmap.main_fight_select);
                flight_text.setTextColor(getResources().getColorStateList(
                        R.color.main_text_select));

                break;


            case 4:
                account_image.setImageResource(R.mipmap.main_account_select);
                account_text.setTextColor(getResources().getColorStateList(
                        R.color.main_text_select));

                break;


        }

    }


    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        flight_image.setImageResource(R.mipmap.main_fight_no);
        flight_text.setTextColor(getResources().getColor(
                R.color.main_text));
        verify_image.setImageResource(R.mipmap.main_verify_no);
        verify_text.setTextColor(getResources().getColor(
                R.color.main_text));
        sign_image.setImageResource(R.mipmap.main_sign_no);
        sign_text.setTextColor(getResources().getColor(
                R.color.main_text));
        video_image.setImageResource(R.mipmap.main_video_no);
        video_text.setTextColor(getResources().getColor(
                R.color.main_text));

        account_image.setImageResource(R.mipmap.main_account_no);
        account_text.setTextColor(getResources().getColor(
                R.color.main_text));
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (recordFragment != null) {
            transaction.hide(recordFragment);
        }
        if (verifyFragment != null) {
            transaction.hide(verifyFragment);
        }

        if (videoFragment != null) {

            transaction.hide(videoFragment);
        }
        if (flighttFragment != null) {
            transaction.hide(flighttFragment);
        }
        if (accountFragment != null) {
            transaction.hide(accountFragment);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onRestoreInstanceState(savedInstanceState);
        iscycle = savedInstanceState.getBoolean("iscycle");
        chooseIndex = savedInstanceState.getInt("chooseIndex");
        setTabSelection(chooseIndex);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putBoolean("iscycle", true);
        outState.putInt("chooseIndex", chooseIndex);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (iscycle) {
            setImageText(chooseIndex);
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            long secondTime = System.currentTimeMillis();
            if (secondTime - firstTime > 1000) {

                Toast.makeText(MainActivity.this,getString(R.string.app_back), Toast.LENGTH_SHORT).show();
                firstTime = secondTime;
            } else {
                MyApplication.getInstance().exit();
            }
        }
        return true;
    }


}
