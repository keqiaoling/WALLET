package com.example.myapplication.zichan.bean;

import java.util.List;

public class TiBiListBean {

    /**
     * status : success
     * code : 200
     * data : [{"id":1,"name":"BTC","type":"btc","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F01548f42738f48604928984f8c455bee.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=4gQxLvCt%2B9CgEG59U9ygJWdccv0%3D&Expires=1574583884","min_number":"0.01000000","rate":"1.00000000","usdt_price":"7200.60000000"},{"id":3,"name":"ETH","type":"eth","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152411.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=L6pWgMyhOGQAiTWbLGLAXQn%2FhSk%3D&Expires=1574583884","min_number":"0.10000000","rate":"1.00000000","usdt_price":"150.46000000"},{"id":12,"name":"USDT - ERC20","type":"erc20","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152415.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=z%2Fq2XETKiLyONBfb9MvlKqjLmjM%3D&Expires=1574583884","min_number":"50.00000000","rate":"1.00000000","usdt_price":"1.00000000"}]
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
         * name : BTC
         * type : btc
         * logo : http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F01548f42738f48604928984f8c455bee.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=4gQxLvCt%2B9CgEG59U9ygJWdccv0%3D&Expires=1574583884
         * min_number : 0.01000000
         * rate : 1.00000000
         * usdt_price : 7200.60000000
         */

        private int id;
        private String name;
        private String type;
        private String logo;
        private String min_number;
        private String rate;
        private String usdt_price;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getMin_number() {
            return min_number;
        }

        public void setMin_number(String min_number) {
            this.min_number = min_number;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getUsdt_price() {
            return usdt_price;
        }

        public void setUsdt_price(String usdt_price) {
            this.usdt_price = usdt_price;
        }
    }
}
