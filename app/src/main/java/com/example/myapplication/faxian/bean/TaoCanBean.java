package com.example.myapplication.faxian.bean;

import java.util.List;

public class TaoCanBean {

    /**
     * status : success
     * code : 200
     * data : [{"id":1,"name":"七天配套","day":7,"contents":"<p>7DAYS<\/p>","cover":"http://api.xwallet.vip/uploads/images/565d720e6cc023a162a5c183fd606cdd.png","rate_min":"0.20","rate_max":"0.43","is_vip":0,"break_rate":"0.05","status":1,"number_day":1,"number":0,"min_all":1.4,"max_all":3,"income":"0.0025","max_investment":50000,"status_zh":"抢购中"},{"id":2,"name":"十五天配套","day":15,"contents":"<p>十五天配套<\/p>","cover":"http://api.xwallet.vip/uploads/images/微信图片_20190612121250.jpg","rate_min":"0.27","rate_max":"0.53","is_vip":0,"break_rate":"0.10","status":1,"number_day":1,"number":0,"min_all":4,"max_all":8,"income":"0.0032","max_investment":0,"status_zh":"抢购中"},{"id":3,"name":"三十天配套","day":30,"contents":"<p>30DAYS<\/p>","cover":"http://api.xwallet.vip/uploads/images/b263ee8d7d9295ce4990ba4705c92073.jpg","rate_min":"0.30","rate_max":"0.60","is_vip":0,"break_rate":"0.15","status":1,"number_day":1,"number":0,"min_all":9,"max_all":18,"income":"0.0035","max_investment":0,"status_zh":"抢购中"},{"id":4,"name":"九十天配套","day":90,"contents":"<p>90DAYS<\/p>","cover":"http://api.xwallet.vip/uploads/images/89f3875853986f2bcde03d8d262029f0.jpg","rate_min":"0.43","rate_max":"0.67","is_vip":0,"break_rate":"0.20","status":1,"number_day":1,"number":0,"min_all":13,"max_all":20,"income":"0.0045","max_investment":0,"status_zh":"抢购中"},{"id":5,"name":"四十五天配套","day":45,"contents":"<p>四十五天配套<\/p>","cover":"http://api.xwallet.vip/uploads/images/c62f31442003e1b852a78d7e813397f3.jpg","rate_min":"0.60","rate_max":"1.00","is_vip":1,"break_rate":"0.30","status":2,"number_day":0,"number":0,"min_all":18,"max_all":30,"income":"0.0060","max_investment":0,"status_zh":"VIP"}]
     */

    private String status;
    private int code;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * name : 七天配套
         * day : 7
         * contents : <p>7DAYS</p>
         * cover : http://api.xwallet.vip/uploads/images/565d720e6cc023a162a5c183fd606cdd.png
         * rate_min : 0.20
         * rate_max : 0.43
         * is_vip : 0
         * break_rate : 0.05
         * status : 1
         * number_day : 1
         * number : 0
         * min_all : 1.4
         * max_all : 3
         * income : 0.0025
         * max_investment : 50000
         * status_zh : 抢购中
         */

        private int id;
        private String name;
        private int day;
        private String contents;
        private String cover;
        private String rate_min;
        private String rate_max;
        private int is_vip;
        private String break_rate;
        private int status;
        private int number_day;
        private int number;
        private double min_all;
        private int max_all;
        private String income;
        private int max_investment;
        private String status_zh;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getRate_min() {
            return rate_min;
        }

        public void setRate_min(String rate_min) {
            this.rate_min = rate_min;
        }

        public String getRate_max() {
            return rate_max;
        }

        public void setRate_max(String rate_max) {
            this.rate_max = rate_max;
        }

        public int getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(int is_vip) {
            this.is_vip = is_vip;
        }

        public String getBreak_rate() {
            return break_rate;
        }

        public void setBreak_rate(String break_rate) {
            this.break_rate = break_rate;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getNumber_day() {
            return number_day;
        }

        public void setNumber_day(int number_day) {
            this.number_day = number_day;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public double getMin_all() {
            return min_all;
        }

        public void setMin_all(double min_all) {
            this.min_all = min_all;
        }

        public int getMax_all() {
            return max_all;
        }

        public void setMax_all(int max_all) {
            this.max_all = max_all;
        }

        public String getIncome() {
            return income;
        }

        public void setIncome(String income) {
            this.income = income;
        }

        public int getMax_investment() {
            return max_investment;
        }

        public void setMax_investment(int max_investment) {
            this.max_investment = max_investment;
        }

        public String getStatus_zh() {
            return status_zh;
        }

        public void setStatus_zh(String status_zh) {
            this.status_zh = status_zh;
        }
    }
}
