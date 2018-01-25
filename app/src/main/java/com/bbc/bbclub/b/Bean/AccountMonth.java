package com.bbc.bbclub.b.Bean;

/**
 * Created by Administrator on 2017/8/25.
 */

public class AccountMonth {
    String do_time;
    String name;

    public AccountMonth( String name,String do_time) {
        this.name = name;
        this.do_time = do_time;
    }

    public String getDo_time() {
        return do_time;
    }

    public void setDo_time(String do_time) {
        this.do_time = do_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
