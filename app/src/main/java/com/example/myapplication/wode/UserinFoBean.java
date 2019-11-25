package com.example.myapplication.wode;

public class UserinFoBean {


    /**
     * status :
     * code :
     * data : {"id":"","nickname":"","created_at":"","phone":"","parent_id":"","invitation_code":"","is_block":"","login_ip":"","login_count":"","avatar":"","user_level":"","pay_password":"","level_name":"会员级别"}
     */

    private String status;
    private String code;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
         * id :
         * nickname :
         * created_at :
         * phone :
         * parent_id :
         * invitation_code :
         * is_block :
         * login_ip :
         * login_count :
         * avatar :
         * user_level :
         * pay_password :
         * level_name : 会员级别
         */

        private String id;
        private String nickname;
        private String created_at;
        private String phone;
        private String parent_id;
        private String invitation_code;
        private String is_block;
        private String login_ip;
        private String login_count;
        private String avatar;
        private String user_level;
        private String pay_password;
        private String level_name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getInvitation_code() {
            return invitation_code;
        }

        public void setInvitation_code(String invitation_code) {
            this.invitation_code = invitation_code;
        }

        public String getIs_block() {
            return is_block;
        }

        public void setIs_block(String is_block) {
            this.is_block = is_block;
        }

        public String getLogin_ip() {
            return login_ip;
        }

        public void setLogin_ip(String login_ip) {
            this.login_ip = login_ip;
        }

        public String getLogin_count() {
            return login_count;
        }

        public void setLogin_count(String login_count) {
            this.login_count = login_count;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getUser_level() {
            return user_level;
        }

        public void setUser_level(String user_level) {
            this.user_level = user_level;
        }

        public String getPay_password() {
            return pay_password;
        }

        public void setPay_password(String pay_password) {
            this.pay_password = pay_password;
        }

        public String getLevel_name() {
            return level_name;
        }

        public void setLevel_name(String level_name) {
            this.level_name = level_name;
        }
    }
}
