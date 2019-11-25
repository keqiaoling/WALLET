package com.example.myapplication.faxian.bean;

public class SheQuBean {

    /**
     * status : success
     * code : 200
     * data : {"contract_my":0,"team_money":"0.00000000","team_number":0,"income_my":"41.08800000","income_my_today":0,"income_team":0,"income_team_today":0,"daishu":0,"weight":0,"commission":0,"commission_goods":0,"commission_game":0,"sideways":0,"currency":{"id":9,"name":"XCN","type":"erc20","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=2r2iw3sTmG4iQEhNGxVkTV%2FoBLE%3D&Expires=1574649343","min_number":"10.00000000","rate":"0.10000000","key":"0e1eR81eXSU+RJsmytQ/qE2MkpSTpl4SSgrj3Jhydhjg7W9rqFg6lfsWlbi6ag6BBslf34WITv1EY2Wp9YTBotrzDtK1xziY7Z4FqAKsFmwF9FhJN7e9fT7GcAYaOk7/GqDCF8TRXNX2r7PgaiMnkTbBgP1Z7DTmdzAEa+lmPUqcNQ0EAmMjupZO5+ZtC8G3+WBaOAIq4b3QUcKthkZL+4xUdCs+/5Io+rwcBmh7kGZjXkKx4qlhQRVHaYXQa2rjfJgZRdqY6xJDQ1RqT73g0Of6kFxvSXB6b/eMz1QxqP7A6ryn4y2zOF2+7gBDmDYWozXXlCecEW0TgijpQXDNehp4rN16RQhT5NuVWDDG6Zh9EEuqlCpgZNLOyB663UB3OD+TLB/xCllwsijodteXlYHHsPRayJpKqoseU9YRKGCrP3n5i7+KXLFbuYbGRgBczKqhJ+6UCZCKajDfwI+BM/fyOvf134LEgmEsq1f98Q83TMJG+XhnuDIemmSs+eFJ8szx9HKaS2JdhgbfkOD2wQcPiavlEFweQYlN5so/HZ21J2+AaQih9H3wfpoxNq5NvNrFLcyhTPPgvMBWun9dTQxIMXcGcce76PUDJjwJAbn3gJ+Md8BHKykL3A712Cl7iU0hBeIZxZpNxv1d/gFNGAA2agPqLv65NnkOYEXAcvZkrfD6gFyKr8K/1m2ARgYtBu09CxVztskbEZw+ubGehk48iQZN74JsUj+x8IupoHVZN4nZ3PXbZFPLcgGjT52f+kRblyKQfAUOmgp+rF/H389zoCdp+JklvRpHATaXowacLq9XM2LheWlFv91GWvQ1nZn2k16irQETl4EDrg9QqfPYjUVlnJ6szcVVkut49iG6lN6gHwKMGxrEmfi42CbHxSmxC3ro9Ac1","contract_address":"0x6a6e0aed494d1eb977ead79ceff908f69ad59b47","total_account":"Ldi7xkhXifRjbt3mqARmnKXFAdAcniKu3m","contents":"XCN","pt":6,"created_at":null,"updated_at":"2019-11-23 00:00:01","deleted_at":null,"is_show":0,"guilong_trans_money":"0.00100000","usdt_price":"2.44070000","rmb_price":"7.10000000","vol":null,"rise_rate":"1.64","commission":"0.00","fee_account":"qqq","code":"190190"}}
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
         * contract_my : 0
         * team_money : 0.00000000
         * team_number : 0
         * income_my : 41.08800000
         * income_my_today : 0
         * income_team : 0
         * income_team_today : 0
         * daishu : 0
         * weight : 0
         * commission : 0
         * commission_goods : 0
         * commission_game : 0
         * sideways : 0
         * currency : {"id":9,"name":"XCN","type":"erc20","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=2r2iw3sTmG4iQEhNGxVkTV%2FoBLE%3D&Expires=1574649343","min_number":"10.00000000","rate":"0.10000000","key":"0e1eR81eXSU+RJsmytQ/qE2MkpSTpl4SSgrj3Jhydhjg7W9rqFg6lfsWlbi6ag6BBslf34WITv1EY2Wp9YTBotrzDtK1xziY7Z4FqAKsFmwF9FhJN7e9fT7GcAYaOk7/GqDCF8TRXNX2r7PgaiMnkTbBgP1Z7DTmdzAEa+lmPUqcNQ0EAmMjupZO5+ZtC8G3+WBaOAIq4b3QUcKthkZL+4xUdCs+/5Io+rwcBmh7kGZjXkKx4qlhQRVHaYXQa2rjfJgZRdqY6xJDQ1RqT73g0Of6kFxvSXB6b/eMz1QxqP7A6ryn4y2zOF2+7gBDmDYWozXXlCecEW0TgijpQXDNehp4rN16RQhT5NuVWDDG6Zh9EEuqlCpgZNLOyB663UB3OD+TLB/xCllwsijodteXlYHHsPRayJpKqoseU9YRKGCrP3n5i7+KXLFbuYbGRgBczKqhJ+6UCZCKajDfwI+BM/fyOvf134LEgmEsq1f98Q83TMJG+XhnuDIemmSs+eFJ8szx9HKaS2JdhgbfkOD2wQcPiavlEFweQYlN5so/HZ21J2+AaQih9H3wfpoxNq5NvNrFLcyhTPPgvMBWun9dTQxIMXcGcce76PUDJjwJAbn3gJ+Md8BHKykL3A712Cl7iU0hBeIZxZpNxv1d/gFNGAA2agPqLv65NnkOYEXAcvZkrfD6gFyKr8K/1m2ARgYtBu09CxVztskbEZw+ubGehk48iQZN74JsUj+x8IupoHVZN4nZ3PXbZFPLcgGjT52f+kRblyKQfAUOmgp+rF/H389zoCdp+JklvRpHATaXowacLq9XM2LheWlFv91GWvQ1nZn2k16irQETl4EDrg9QqfPYjUVlnJ6szcVVkut49iG6lN6gHwKMGxrEmfi42CbHxSmxC3ro9Ac1","contract_address":"0x6a6e0aed494d1eb977ead79ceff908f69ad59b47","total_account":"Ldi7xkhXifRjbt3mqARmnKXFAdAcniKu3m","contents":"XCN","pt":6,"created_at":null,"updated_at":"2019-11-23 00:00:01","deleted_at":null,"is_show":0,"guilong_trans_money":"0.00100000","usdt_price":"2.44070000","rmb_price":"7.10000000","vol":null,"rise_rate":"1.64","commission":"0.00","fee_account":"qqq","code":"190190"}
         */

        private int contract_my;
        private String team_money;
        private int team_number;
        private String income_my;
        private int income_my_today;
        private int income_team;
        private int income_team_today;
        private int daishu;
        private int weight;
        private int commission;
        private int commission_goods;
        private int commission_game;
        private int sideways;
        private CurrencyBean currency;

        public int getContract_my() {
            return contract_my;
        }

        public void setContract_my(int contract_my) {
            this.contract_my = contract_my;
        }

        public String getTeam_money() {
            return team_money;
        }

        public void setTeam_money(String team_money) {
            this.team_money = team_money;
        }

        public int getTeam_number() {
            return team_number;
        }

        public void setTeam_number(int team_number) {
            this.team_number = team_number;
        }

        public String getIncome_my() {
            return income_my;
        }

        public void setIncome_my(String income_my) {
            this.income_my = income_my;
        }

        public int getIncome_my_today() {
            return income_my_today;
        }

        public void setIncome_my_today(int income_my_today) {
            this.income_my_today = income_my_today;
        }

        public int getIncome_team() {
            return income_team;
        }

        public void setIncome_team(int income_team) {
            this.income_team = income_team;
        }

        public int getIncome_team_today() {
            return income_team_today;
        }

        public void setIncome_team_today(int income_team_today) {
            this.income_team_today = income_team_today;
        }

        public int getDaishu() {
            return daishu;
        }

        public void setDaishu(int daishu) {
            this.daishu = daishu;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getCommission() {
            return commission;
        }

        public void setCommission(int commission) {
            this.commission = commission;
        }

        public int getCommission_goods() {
            return commission_goods;
        }

        public void setCommission_goods(int commission_goods) {
            this.commission_goods = commission_goods;
        }

        public int getCommission_game() {
            return commission_game;
        }

        public void setCommission_game(int commission_game) {
            this.commission_game = commission_game;
        }

        public int getSideways() {
            return sideways;
        }

        public void setSideways(int sideways) {
            this.sideways = sideways;
        }

        public CurrencyBean getCurrency() {
            return currency;
        }

        public void setCurrency(CurrencyBean currency) {
            this.currency = currency;
        }

        public static class CurrencyBean {
            /**
             * id : 9
             * name : XCN
             * type : erc20
             * logo : http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=2r2iw3sTmG4iQEhNGxVkTV%2FoBLE%3D&Expires=1574649343
             * min_number : 10.00000000
             * rate : 0.10000000
             * key : 0e1eR81eXSU+RJsmytQ/qE2MkpSTpl4SSgrj3Jhydhjg7W9rqFg6lfsWlbi6ag6BBslf34WITv1EY2Wp9YTBotrzDtK1xziY7Z4FqAKsFmwF9FhJN7e9fT7GcAYaOk7/GqDCF8TRXNX2r7PgaiMnkTbBgP1Z7DTmdzAEa+lmPUqcNQ0EAmMjupZO5+ZtC8G3+WBaOAIq4b3QUcKthkZL+4xUdCs+/5Io+rwcBmh7kGZjXkKx4qlhQRVHaYXQa2rjfJgZRdqY6xJDQ1RqT73g0Of6kFxvSXB6b/eMz1QxqP7A6ryn4y2zOF2+7gBDmDYWozXXlCecEW0TgijpQXDNehp4rN16RQhT5NuVWDDG6Zh9EEuqlCpgZNLOyB663UB3OD+TLB/xCllwsijodteXlYHHsPRayJpKqoseU9YRKGCrP3n5i7+KXLFbuYbGRgBczKqhJ+6UCZCKajDfwI+BM/fyOvf134LEgmEsq1f98Q83TMJG+XhnuDIemmSs+eFJ8szx9HKaS2JdhgbfkOD2wQcPiavlEFweQYlN5so/HZ21J2+AaQih9H3wfpoxNq5NvNrFLcyhTPPgvMBWun9dTQxIMXcGcce76PUDJjwJAbn3gJ+Md8BHKykL3A712Cl7iU0hBeIZxZpNxv1d/gFNGAA2agPqLv65NnkOYEXAcvZkrfD6gFyKr8K/1m2ARgYtBu09CxVztskbEZw+ubGehk48iQZN74JsUj+x8IupoHVZN4nZ3PXbZFPLcgGjT52f+kRblyKQfAUOmgp+rF/H389zoCdp+JklvRpHATaXowacLq9XM2LheWlFv91GWvQ1nZn2k16irQETl4EDrg9QqfPYjUVlnJ6szcVVkut49iG6lN6gHwKMGxrEmfi42CbHxSmxC3ro9Ac1
             * contract_address : 0x6a6e0aed494d1eb977ead79ceff908f69ad59b47
             * total_account : Ldi7xkhXifRjbt3mqARmnKXFAdAcniKu3m
             * contents : XCN
             * pt : 6
             * created_at : null
             * updated_at : 2019-11-23 00:00:01
             * deleted_at : null
             * is_show : 0
             * guilong_trans_money : 0.00100000
             * usdt_price : 2.44070000
             * rmb_price : 7.10000000
             * vol : null
             * rise_rate : 1.64
             * commission : 0.00
             * fee_account : qqq
             * code : 190190
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
            private String deleted_at;
            private int is_show;
            private String guilong_trans_money;
            private String usdt_price;
            private String rmb_price;
            private String vol;
            private String rise_rate;
            private String commission;
            private String fee_account;
            private String code;

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

            public String getDeleted_at() {
                return deleted_at;
            }

            public void setDeleted_at(String deleted_at) {
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

            public String getFee_account() {
                return fee_account;
            }

            public void setFee_account(String fee_account) {
                this.fee_account = fee_account;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }
        }
    }
}
