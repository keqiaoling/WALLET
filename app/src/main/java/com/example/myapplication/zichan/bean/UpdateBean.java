package com.example.myapplication.zichan.bean;

public class UpdateBean {

    /**
     * status : success
     * code : 200
     * data : {"down_url":"http://down.xwallet.vip/download/","app_version":"1.3.1","desc":"1. 新增邀请好友分享功能,2. 修复已知Bug,3. X-Trade查询系统即将上线","android_version":"1.0.0","ios_version":"1.0.0","android_url":"http://down.xwallet.vip/download/app.apk","ios_url":"http://down.xwallet.vip/download/app.ipa"}
     */

    private String status;
    private int code;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * down_url : http://down.xwallet.vip/download/
         * app_version : 1.3.1
         * desc : 1. 新增邀请好友分享功能,2. 修复已知Bug,3. X-Trade查询系统即将上线
         * android_version : 1.0.0
         * ios_version : 1.0.0
         * android_url : http://down.xwallet.vip/download/app.apk
         * ios_url : http://down.xwallet.vip/download/app.ipa
         */

        private String down_url;
        private String app_version;
        private String desc;
        private String android_version;
        private String ios_version;
        private String android_url;
        private String ios_url;

        public String getDown_url() {
            return down_url;
        }

        public void setDown_url(String down_url) {
            this.down_url = down_url;
        }

        public String getApp_version() {
            return app_version;
        }

        public void setApp_version(String app_version) {
            this.app_version = app_version;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getAndroid_version() {
            return android_version;
        }

        public void setAndroid_version(String android_version) {
            this.android_version = android_version;
        }

        public String getIos_version() {
            return ios_version;
        }

        public void setIos_version(String ios_version) {
            this.ios_version = ios_version;
        }

        public String getAndroid_url() {
            return android_url;
        }

        public void setAndroid_url(String android_url) {
            this.android_url = android_url;
        }

        public String getIos_url() {
            return ios_url;
        }

        public void setIos_url(String ios_url) {
            this.ios_url = ios_url;
        }
    }
}
