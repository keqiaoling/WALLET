package com.example.myapplication.wode;

public class TeaminfoBean {

    /**
     * status : success
     * code : 200
     * data : {"contract_my":"225717.15","team_money":"314510.49","team_number":6,"income_my":"159.29633","income_my_today":0,"income_team":"29.25327","income_team_today":0,"daishu":0,"weight":0,"commission":0,"sideways":0}
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
         * contract_my : 225717.15
         * team_money : 314510.49
         * team_number : 6
         * income_my : 159.29633
         * income_my_today : 0
         * income_team : 29.25327
         * income_team_today : 0
         * daishu : 0
         * weight : 0
         * commission : 0
         * sideways : 0
         */

        private String contract_my;
        private String team_money;
        private int team_number;
        private String income_my;
        private int income_my_today;
        private String income_team;
        private int income_team_today;
        private int daishu;
        private int weight;
        private int commission;
        private int sideways;

        public String getContract_my() {
            return contract_my;
        }

        public void setContract_my(String contract_my) {
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

        public String getIncome_team() {
            return income_team;
        }

        public void setIncome_team(String income_team) {
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

        public int getSideways() {
            return sideways;
        }

        public void setSideways(int sideways) {
            this.sideways = sideways;
        }
    }
}
