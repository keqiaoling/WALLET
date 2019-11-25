package com.example.myapplication.faxian.bean;

public class HeYueBean {

    /**
     * status : success
     * code : 200
     * data : {"investment":"29595.78","income":"95.49571680","today_income":"95.49572"}
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
         * investment : 29595.78
         * income : 95.49571680
         * today_income : 95.49572
         */

        private String investment;
        private String income;
        private String today_income;

        public String getInvestment() {
            return investment;
        }

        public void setInvestment(String investment) {
            this.investment = investment;
        }

        public String getIncome() {
            return income;
        }

        public void setIncome(String income) {
            this.income = income;
        }

        public String getToday_income() {
            return today_income;
        }

        public void setToday_income(String today_income) {
            this.today_income = today_income;
        }
    }
}
