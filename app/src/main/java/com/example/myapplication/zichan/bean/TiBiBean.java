package com.example.myapplication.zichan.bean;

import java.util.List;

public class TiBiBean {

    /**
     * status : success
     * code : 200
     * data : [{"id":60,"address":"1AwNYBSsTz2RAroNwv1o62diXf2qMEyc8X","change_balance":"10000.00000000","currency_id":1,"equal_balance":"0.0033($)","currency_name":"BTC","logo":"http://bayi.wanzhantong.cn/uploads/images/3f83abce300289f0f3b08b6c063655eb.jpg","currency_type":"btc","currency":{"id":1,"name":"BTC","type":"btc","logo":"http://bayi.wanzhantong.cn/uploads/images/3f83abce300289f0f3b08b6c063655eb.jpg","min_number":"1.00000000","rate":"1.00000000","key":"1aaaaaaaa","contract_address":"1a","total_account":"1a","contents":"BTC","pt":8,"created_at":"2019-09-19 20:41:04","updated_at":"2019-09-24 19:54:04","deleted_at":null,"is_show":1,"guilong_trans_money":"-1.05000000","usdt_price":"9865.26000000","rmb_price":"0.00000000","vol":"291476136.3576","rise_rate":"-3.04","commission":"0.10"}},{"id":61,"address":"0xED0ab6C30f6C57F75293812e84681A19A5f00242","change_balance":"0.00000000","currency_id":3,"equal_balance":"0.0033($)","currency_name":"ETH","logo":"http://bayi.wanzhantong.cn/uploads/images/5a9cfe203be3829f4530f04f64d10205.jpg","currency_type":"eth","currency":{"id":3,"name":"ETH","type":"eth","logo":"http://bayi.wanzhantong.cn/uploads/images/5a9cfe203be3829f4530f04f64d10205.jpg","min_number":"10.00000000","rate":"0.00000000","key":"UKPqLTdKlbhqFvfvFmvhOOCIxODNiKZoJNXs0F/UAQvH+kob20jyiQYmtRKlR/semkR0/8LaUpo2xYcBCOjVoQ==","contract_address":null,"total_account":"1M9XSPfqofJ6QJ7nqc5RT2QQ9PUzwfkzHA","contents":"ETH","pt":8,"created_at":null,"updated_at":"2019-09-24 19:54:08","deleted_at":null,"is_show":1,"guilong_trans_money":"0.00010000","usdt_price":"208.59000000","rmb_price":"7.01000000","vol":"107846806.9830","rise_rate":"-2.49","commission":"0.20"}},{"id":62,"address":"0xb348Af5ffD935d5400Ff6b11c379861eC2281CB6","change_balance":"69.86666665","currency_id":9,"equal_balance":"0.0033($)","currency_name":"XCN","logo":"http://bayi.wanzhantong.cn/uploads/images/微信图片_20190612121256.jpg","currency_type":"erc20","currency":{"id":9,"name":"XCN","type":"erc20","logo":"http://bayi.wanzhantong.cn/uploads/images/微信图片_20190612121256.jpg","min_number":"10.00000000","rate":"0.05000000","key":"0xf720a082ab2109c41077ce6985a35178c4323843b1145f6d49f22324bd7a26a8","contract_address":"0x6a6e0aed494d1eb977ead79ceff908f69ad59b47","total_account":"0xff93791e55833477fd8e42969cc952eae94ca59d","contents":"TTTT","pt":6,"created_at":null,"updated_at":"2019-09-26 10:11:36","deleted_at":null,"is_show":1,"guilong_trans_money":"0.00100000","usdt_price":"1.00000000","rmb_price":"7.10000000","vol":null,"rise_rate":null,"commission":"0.00"}}]
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
         * id : 60
         * address : 1AwNYBSsTz2RAroNwv1o62diXf2qMEyc8X
         * change_balance : 10000.00000000
         * currency_id : 1
         * equal_balance : 0.0033($)
         * currency_name : BTC
         * logo : http://bayi.wanzhantong.cn/uploads/images/3f83abce300289f0f3b08b6c063655eb.jpg
         * currency_type : btc
         * currency : {"id":1,"name":"BTC","type":"btc","logo":"http://bayi.wanzhantong.cn/uploads/images/3f83abce300289f0f3b08b6c063655eb.jpg","min_number":"1.00000000","rate":"1.00000000","key":"1aaaaaaaa","contract_address":"1a","total_account":"1a","contents":"BTC","pt":8,"created_at":"2019-09-19 20:41:04","updated_at":"2019-09-24 19:54:04","deleted_at":null,"is_show":1,"guilong_trans_money":"-1.05000000","usdt_price":"9865.26000000","rmb_price":"0.00000000","vol":"291476136.3576","rise_rate":"-3.04","commission":"0.10"}
         */

        private int id;
        private String address;
        private String change_balance;
        private int currency_id;
        private String equal_balance;
        private String currency_name;
        private String logo;
        private String currency_type;
        private CurrencyBean currency;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getChange_balance() {
            return change_balance;
        }

        public void setChange_balance(String change_balance) {
            this.change_balance = change_balance;
        }

        public int getCurrency_id() {
            return currency_id;
        }

        public void setCurrency_id(int currency_id) {
            this.currency_id = currency_id;
        }

        public String getEqual_balance() {
            return equal_balance;
        }

        public void setEqual_balance(String equal_balance) {
            this.equal_balance = equal_balance;
        }

        public String getCurrency_name() {
            return currency_name;
        }

        public void setCurrency_name(String currency_name) {
            this.currency_name = currency_name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getCurrency_type() {
            return currency_type;
        }

        public void setCurrency_type(String currency_type) {
            this.currency_type = currency_type;
        }

        public CurrencyBean getCurrency() {
            return currency;
        }

        public void setCurrency(CurrencyBean currency) {
            this.currency = currency;
        }

        public static class CurrencyBean {
            /**
             * id : 1
             * name : BTC
             * type : btc
             * logo : http://bayi.wanzhantong.cn/uploads/images/3f83abce300289f0f3b08b6c063655eb.jpg
             * min_number : 1.00000000
             * rate : 1.00000000
             * key : 1aaaaaaaa
             * contract_address : 1a
             * total_account : 1a
             * contents : BTC
             * pt : 8
             * created_at : 2019-09-19 20:41:04
             * updated_at : 2019-09-24 19:54:04
             * deleted_at : null
             * is_show : 1
             * guilong_trans_money : -1.05000000
             * usdt_price : 9865.26000000
             * rmb_price : 0.00000000
             * vol : 291476136.3576
             * rise_rate : -3.04
             * commission : 0.10
             */

            private int id;
            private String name;
            private String type;
            private String logo;
            private String min_number;
            private String rate;
            private String key;
            private String contract_address;
            private String total_account;
            private String contents;
            private int pt;
            private String created_at;
            private String updated_at;
            private Object deleted_at;
            private int is_show;
            private String guilong_trans_money;
            private String usdt_price;
            private String rmb_price;
            private String vol;
            private String rise_rate;
            private String commission;

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

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getContract_address() {
                return contract_address;
            }

            public void setContract_address(String contract_address) {
                this.contract_address = contract_address;
            }

            public String getTotal_account() {
                return total_account;
            }

            public void setTotal_account(String total_account) {
                this.total_account = total_account;
            }

            public String getContents() {
                return contents;
            }

            public void setContents(String contents) {
                this.contents = contents;
            }

            public int getPt() {
                return pt;
            }

            public void setPt(int pt) {
                this.pt = pt;
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

            public Object getDeleted_at() {
                return deleted_at;
            }

            public void setDeleted_at(Object deleted_at) {
                this.deleted_at = deleted_at;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public String getGuilong_trans_money() {
                return guilong_trans_money;
            }

            public void setGuilong_trans_money(String guilong_trans_money) {
                this.guilong_trans_money = guilong_trans_money;
            }

            public String getUsdt_price() {
                return usdt_price;
            }

            public void setUsdt_price(String usdt_price) {
                this.usdt_price = usdt_price;
            }

            public String getRmb_price() {
                return rmb_price;
            }

            public void setRmb_price(String rmb_price) {
                this.rmb_price = rmb_price;
            }

            public String getVol() {
                return vol;
            }

            public void setVol(String vol) {
                this.vol = vol;
            }

            public String getRise_rate() {
                return rise_rate;
            }

            public void setRise_rate(String rise_rate) {
                this.rise_rate = rise_rate;
            }

            public String getCommission() {
                return commission;
            }

            public void setCommission(String commission) {
                this.commission = commission;
            }
        }
    }
}
