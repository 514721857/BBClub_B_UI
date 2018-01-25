package com.bbc.bbclub.b.Bean;

/**
 * Created by Administrator on 2017/8/24.
 */

public class AccountSection {
    private String month;
    private String times;

    public AccountSection(String month, String times) {
        this.month = month;
        this.times = times;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
