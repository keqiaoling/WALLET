package com.example.myapplication.faxian.bean;

import java.util.List;

public class HeYueListBean {

    /**
     * status : success
     * code : 200
     * data : [{"id":3004,"user_id":5482,"agencies":null,"contracts":null,"agencies_number":"0.00","contracts_number":"100.00","created_at":"2019-11-07 11:02:31","updated_at":"2019-11-23 01:30:32","type":1,"name":"十五天配套","phone":null,"address":null,"email":null,"z":null,"f":null,"send_relation":null,"send_name":null,"send_phone":null,"status":2,"no":"IB07957513878739","is_all":0,"remark":null,"apply_out_at":null,"deleted_at":null,"contract_id":2,"income_rate":"0.4300","contract_day":15,"currency_id":12,"mill_id":12,"end_time":"2019-11-22 23:59:59","contracts_bill":"100.00000000","income":"0.76800000","status_zh":"已完成","currency":{"id":12,"name":"USDT - ERC20","type":"erc20","usdt_price":"1.00000000"}},{"id":52,"user_id":5482,"agencies":null,"contracts":null,"agencies_number":"0.00","contracts_number":"1000.00","created_at":"2019-10-08 14:42:23","updated_at":"2019-11-23 01:30:32","type":1,"name":"四十五天配套","phone":null,"address":null,"email":null,"z":null,"f":null,"send_relation":null,"send_name":null,"send_phone":null,"status":2,"no":"IA08169439256536","is_all":0,"remark":null,"apply_out_at":null,"deleted_at":null,"contract_id":5,"income_rate":"0.9700","contract_day":45,"currency_id":9,"mill_id":9,"end_time":"2019-11-22 23:59:59","contracts_bill":"1000.00000000","income":"21.52000000","status_zh":"已完成","currency":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.44070000"}}]
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
         * id : 3004
         * user_id : 5482
         * agencies : null
         * contracts : null
         * agencies_number : 0.00
         * contracts_number : 100.00
         * created_at : 2019-11-07 11:02:31
         * updated_at : 2019-11-23 01:30:32
         * type : 1
         * name : 十五天配套
         * phone : null
         * address : null
         * email : null
         * z : null
         * f : null
         * send_relation : null
         * send_name : null
         * send_phone : null
         * status : 2
         * no : IB07957513878739
         * is_all : 0
         * remark : null
         * apply_out_at : null
         * deleted_at : null
         * contract_id : 2
         * income_rate : 0.4300
         * contract_day : 15
         * currency_id : 12
         * mill_id : 12
         * end_time : 2019-11-22 23:59:59
         * contracts_bill : 100.00000000
         * income : 0.76800000
         * status_zh : 已完成
         * currency : {"id":12,"name":"USDT - ERC20","type":"erc20","usdt_price":"1.00000000"}
         */

        private int id;
        private int user_id;
        private Object agencies;
        private Object contracts;
        private String agencies_number;
        private String contracts_number;
        private String created_at;
        private String updated_at;
        private int type;
        private String name;
        private Object phone;
        private Object address;
        private Object email;
        private Object z;
        private Object f;
        private Object send_relation;
        private Object send_name;
        private Object send_phone;
        private int status;
        private String no;
        private int is_all;
        private Object remark;
        private Object apply_out_at;
        private Object deleted_at;
        private int contract_id;
        private String income_rate;
        private int contract_day;
        private int currency_id;
        private int mill_id;
        private String end_time;
        private String contracts_bill;
        private String income;
        private String status_zh;
        private CurrencyBean currency;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public Object getAgencies() {
            return agencies;
        }

        public void setAgencies(Object agencies) {
            this.agencies = agencies;
        }

        public Object getContracts() {
            return contracts;
        }

        public void setContracts(Object contracts) {
            this.contracts = contracts;
        }

        public String getAgencies_number() {
            return agencies_number;
        }

        public void setAgencies_number(String agencies_number) {
            this.agencies_number = agencies_number;
        }

        public String getContracts_number() {
            return contracts_number;
        }

        public void setContracts_number(String contracts_number) {
            this.contracts_number = contracts_number;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getZ() {
            return z;
        }

        public void setZ(Object z) {
            this.z = z;
        }

        public Object getF() {
            return f;
        }

        public void setF(Object f) {
            this.f = f;
        }

        public Object getSend_relation() {
            return send_relation;
        }

        public void setSend_relation(Object send_relation) {
            this.send_relation = send_relation;
        }

        public Object getSend_name() {
            return send_name;
        }

        public void setSend_name(Object send_name) {
            this.send_name = send_name;
        }

        public Object getSend_phone() {
            return send_phone;
        }

        public void setSend_phone(Object send_phone) {
            this.send_phone = send_phone;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public int getIs_all() {
            return is_all;
        }

        public void setIs_all(int is_all) {
            this.is_all = is_all;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getApply_out_at() {
            return apply_out_at;
        }

        public void setApply_out_at(Object apply_out_at) {
            this.apply_out_at = apply_out_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public int getContract_id() {
            return contract_id;
        }

        public void setContract_id(int contract_id) {
            this.contract_id = contract_id;
        }

        public String getIncome_rate() {
            return income_rate;
        }

        public void setIncome_rate(String income_rate) {
            this.income_rate = income_rate;
        }

        public int getContract_day() {
            return contract_day;
        }

        public void setContract_day(int contract_day) {
            this.contract_day = contract_day;
        }

        public int getCurrency_id() {
            return currency_id;
        }

        public void setCurrency_id(int currency_id) {
            this.currency_id = currency_id;
        }

        public int getMill_id() {
            return mill_id;
        }

        public void setMill_id(int mill_id) {
            this.mill_id = mill_id;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getContracts_bill() {
            return contracts_bill;
        }

        public void setContracts_bill(String contracts_bill) {
            this.contracts_bill = contracts_bill;
        }

        public String getIncome() {
            return income;
        }

        public void setIncome(String income) {
            this.income = income;
        }

        public String getStatus_zh() {
            return status_zh;
        }

        public void setStatus_zh(String status_zh) {
            this.status_zh = status_zh;
        }

        public CurrencyBean getCurrency() {
            return currency;
        }

        public void setCurrency(CurrencyBean currency) {
            this.currency = currency;
        }

        public static class CurrencyBean {
            /**
             * id : 12
             * name : USDT - ERC20
             * type : erc20
             * usdt_price : 1.00000000
             */

            private int id;
            private String name;
            private String type;
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

            public String getUsdt_price() {
                return usdt_price;
            }

            public void setUsdt_price(String usdt_price) {
                this.usdt_price = usdt_price;
            }
        }
    }
}
