package com.bbc.bbclub.b.Account;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.b.R;
import com.bbc.bbclub.b.shop.UpdateShopActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FailAccountActivity extends Activity {
    @InjectView(R.id.top_view_title)
    TextView top_view_title;

    @InjectView(R.id.top_view_back)
    ImageView top_view_back;

    @InjectView(R.id.account_tip)
    TextView account_tip;

    @InjectView(R.id.account_commit)
    Button account_commit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_account);
        ButterKnife.inject(this);
        initView();
    }

    @OnClick({R.id.top_view_back, R.id.account_commit})
    public void onTabClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.account_commit:
                Intent intent = new Intent(FailAccountActivity.this, ShenHeActivity.class);
                FailAccountActivity.this.startActivity(intent);
                break;
        }
    }


    private void initView() {
        top_view_title.setVisibility(View.VISIBLE);
        top_view_title.setText("结算");
        SpannableStringBuilder spannable = new SpannableStringBuilder("因部落资料不全无法通过审核，点击补全资料重新结算");
        //设置文字的前景色
        spannable.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.login_verify_text)), 16, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //这个一定要记得设置，不然点击不生效
        account_tip.setMovementMethod(LinkMovementMethod.getInstance());
        spannable.setSpan(new TextClick(), 16, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        account_tip.setText(spannable);
    }

    private class TextClick extends ClickableSpan {
        @Override
        public void onClick(View widget) {
            Intent intent = new Intent(FailAccountActivity.this, UpdateShopActivity.class);
            FailAccountActivity.this.startActivity(intent);
        }

        @Override
        public void updateDrawState(TextPaint ds) {
//            ds.setColor(ds.linkColor);
//            ds.setUnderlineText(true);
        }
    }

}
