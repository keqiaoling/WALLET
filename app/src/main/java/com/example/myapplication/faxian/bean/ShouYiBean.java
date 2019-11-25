package com.example.myapplication.faxian.bean;

public class ShouYiBean {


    /**
     * status : success
     * code : 200
     * data : {"msg1":"今日收益0$≈0XCN！","msg2":"扣除20%管理费,实际到账0XCN！","number":0}
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
         * msg1 : 今日收益0$≈0XCN！
         * msg2 : 扣除20%管理费,实际到账0XCN！
         * number : 0
         */

        private String msg1;
        private String msg2;
        private int number;

        public String getMsg1() {
            return msg1;
        }

        public void setMsg1(String msg1) {
            this.msg1 = msg1;
        }

        public String getMsg2() {
            return msg2;
        }

        public void setMsg2(String msg2) {
            this.msg2 = msg2;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
