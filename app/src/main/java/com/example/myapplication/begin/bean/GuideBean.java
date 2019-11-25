package com.example.myapplication.begin.bean;

import java.util.List;

public class GuideBean {

    /**
     * status : success
     * code : 200
     * data : ["http://api.xwallet.vip/start_img/1.jpg","http://api.xwallet.vip/start_img/2.jpg","http://api.xwallet.vip/start_img/3.jpg","http://api.xwallet.vip/start_img/4.jpg","http://api.xwallet.vip/start_img/5.jpg"]
     */

    private String status;
    private int code;
    private List<String> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
