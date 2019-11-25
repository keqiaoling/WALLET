package com.example.myapplication.faxian.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class HomeBean {

    /**
     * status : success
     * code : 200
     * data : {"slide":[{"id":8,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGa600301fcaf0dfc9604a986f459e8cf9.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=H%2FRjC6JwjvmQJ7OgcASjxvHguY0%3D&Expires=1574587458","show_location":1,"name":"234","created_at":"2019-09-11 18:26:43","updated_at":"2019-11-04 10:55:30"},{"id":9,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGe059cbd3df805437ab8d04c56d44d1ec.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=TMpKkG%2FhibmF8HSaTD%2BjS%2F4O3Bk%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-02 20:15:12","updated_at":"2019-11-04 10:55:57"},{"id":15,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG083998f4e204d518fbb228775f8b5a08.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=TOnChrERAoajl4cAbZJ1rQ6j4Bs%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-05 13:07:24","updated_at":"2019-11-04 10:57:30"},{"id":19,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGc02e2dd44afb2165e03526b9b3a4d635.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=fVd8MaTJqPKEs0sBtbzWS38jkf4%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-23 11:26:48","updated_at":"2019-11-04 10:56:26"},{"id":20,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG4.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=ZeZWQs6Ahl2JDtB3bYDgNfYz%2Bro%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-30 14:09:33","updated_at":"2019-10-30 14:09:33"},{"id":21,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG094ae53ce4581bd8d7f658f09ef71c38.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=DT9PCiuDH07aPzvk2Rkbqx7ZsxA%3D&Expires=1574587458","show_location":1,"name":"8","created_at":"2019-10-30 17:41:02","updated_at":"2019-11-04 10:57:53"},{"id":22,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F780a6d046d485e3e03842d6b2e8c2a0b.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=ZrMnfmVbJ8vWCR8Cdt5iv7Bktr4%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-11-03 13:38:36","updated_at":"2019-11-03 13:38:36"},{"id":23,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG3.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=UrsDiMvJjuUo%2BKY7477gfgnTKrM%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-11-03 13:38:52","updated_at":"2019-11-03 13:38:52"}],"info":{"id":31927,"nickname":"1","created_at":"2019-11-23 10:30:48","phone":"15730066732","parent_id":1623,"invitation_code":"pzqfpd","is_block":0,"login_ip":null,"login_count":0,"avatar":"http://api.xwallet.vip/uploads/images/20190930173107.png","user_level":0,"pay_password":"001103","uuid":null,"area_code":86,"register_address":null,"email":null,"help_word":null,"help_key":[],"agency_id":0,"consume":"0.00","is_valid":0,"team_money":"0.00000000","private_address":null,"address_detail":null,"team_user_money":"0.00000000","count_yeji":0,"level_name":"普通会员","invite_url":"http://api.xwallet.vip/api/invite_url?invite=pzqfpd","is_show":1},"BTC":"0.00000000","ETH":"0.00000000","XCN":"0.00000000","LTC":"0.00000000","USDT - ERC20":"0.00000000","today_earnings":0,"today_earnings_money":1}
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
         * slide : [{"id":8,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGa600301fcaf0dfc9604a986f459e8cf9.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=H%2FRjC6JwjvmQJ7OgcASjxvHguY0%3D&Expires=1574587458","show_location":1,"name":"234","created_at":"2019-09-11 18:26:43","updated_at":"2019-11-04 10:55:30"},{"id":9,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGe059cbd3df805437ab8d04c56d44d1ec.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=TMpKkG%2FhibmF8HSaTD%2BjS%2F4O3Bk%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-02 20:15:12","updated_at":"2019-11-04 10:55:57"},{"id":15,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG083998f4e204d518fbb228775f8b5a08.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=TOnChrERAoajl4cAbZJ1rQ6j4Bs%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-05 13:07:24","updated_at":"2019-11-04 10:57:30"},{"id":19,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGc02e2dd44afb2165e03526b9b3a4d635.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=fVd8MaTJqPKEs0sBtbzWS38jkf4%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-23 11:26:48","updated_at":"2019-11-04 10:56:26"},{"id":20,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG4.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=ZeZWQs6Ahl2JDtB3bYDgNfYz%2Bro%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-10-30 14:09:33","updated_at":"2019-10-30 14:09:33"},{"id":21,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG094ae53ce4581bd8d7f658f09ef71c38.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=DT9PCiuDH07aPzvk2Rkbqx7ZsxA%3D&Expires=1574587458","show_location":1,"name":"8","created_at":"2019-10-30 17:41:02","updated_at":"2019-11-04 10:57:53"},{"id":22,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F780a6d046d485e3e03842d6b2e8c2a0b.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=ZrMnfmVbJ8vWCR8Cdt5iv7Bktr4%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-11-03 13:38:36","updated_at":"2019-11-03 13:38:36"},{"id":23,"cover":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMG3.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=UrsDiMvJjuUo%2BKY7477gfgnTKrM%3D&Expires=1574587458","show_location":1,"name":null,"created_at":"2019-11-03 13:38:52","updated_at":"2019-11-03 13:38:52"}]
         * info : {"id":31927,"nickname":"1","created_at":"2019-11-23 10:30:48","phone":"15730066732","parent_id":1623,"invitation_code":"pzqfpd","is_block":0,"login_ip":null,"login_count":0,"avatar":"http://api.xwallet.vip/uploads/images/20190930173107.png","user_level":0,"pay_password":"001103","uuid":null,"area_code":86,"register_address":null,"email":null,"help_word":null,"help_key":[],"agency_id":0,"consume":"0.00","is_valid":0,"team_money":"0.00000000","private_address":null,"address_detail":null,"team_user_money":"0.00000000","count_yeji":0,"level_name":"普通会员","invite_url":"http://api.xwallet.vip/api/invite_url?invite=pzqfpd","is_show":1}
         * BTC : 0.00000000
         * ETH : 0.00000000
         * XCN : 0.00000000
         * LTC : 0.00000000
         * USDT - ERC20 : 0.00000000
         * today_earnings : 0
         * today_earnings_money : 1
         */

        private InfoBean info;
        private String BTC;
        private String ETH;
        private String XCN;
        private String LTC;
        @SerializedName("USDT - ERC20")
        private String _$USDTERC20130; // FIXME check this code
        private int today_earnings;
        private int today_earnings_money;
        private List<SlideBean> slide;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public String getBTC() {
            return BTC;
        }

        public void setBTC(String BTC) {
            this.BTC = BTC;
        }

        public String getETH() {
            return ETH;
        }

        public void setETH(String ETH) {
            this.ETH = ETH;
        }

        public String getXCN() {
            return XCN;
        }

        public void setXCN(String XCN) {
            this.XCN = XCN;
        }

        public String getLTC() {
            return LTC;
        }

        public void setLTC(String LTC) {
            this.LTC = LTC;
        }

        public String get_$USDTERC20130() {
            return _$USDTERC20130;
        }

        public void set_$USDTERC20130(String _$USDTERC20130) {
            this._$USDTERC20130 = _$USDTERC20130;
        }

        public int getToday_earnings() {
            return today_earnings;
        }

        public void setToday_earnings(int today_earnings) {
            this.today_earnings = today_earnings;
        }

        public int getToday_earnings_money() {
            return today_earnings_money;
        }

        public void setToday_earnings_money(int today_earnings_money) {
            this.today_earnings_money = today_earnings_money;
        }

        public List<SlideBean> getSlide() {
            return slide;
        }

        public void setSlide(List<SlideBean> slide) {
            this.slide = slide;
        }

        public static class InfoBean {
            /**
             * id : 31927
             * nickname : 1
             * created_at : 2019-11-23 10:30:48
             * phone : 15730066732
             * parent_id : 1623
             * invitation_code : pzqfpd
             * is_block : 0
             * login_ip : null
             * login_count : 0
             * avatar : http://api.xwallet.vip/uploads/images/20190930173107.png
             * user_level : 0
             * pay_password : 001103
             * uuid : null
             * area_code : 86
             * register_address : null
             * email : null
             * help_word : null
             * help_key : []
             * agency_id : 0
             * consume : 0.00
             * is_valid : 0
             * team_money : 0.00000000
             * private_address : null
             * address_detail : null
             * team_user_money : 0.00000000
             * count_yeji : 0
             * level_name : 普通会员
             * invite_url : http://api.xwallet.vip/api/invite_url?invite=pzqfpd
             * is_show : 1
             */

            private int id;
            private String nickname;
            private String created_at;
            private String phone;
            private int parent_id;
            private String invitation_code;
            private int is_block;
            private Object login_ip;
            private int login_count;
            private String avatar;
            private int user_level;
            private String pay_password;
            private Object uuid;
            private int area_code;
            private Object register_address;
            private Object email;
            private Object help_word;
            private int agency_id;
            private String consume;
            private int is_valid;
            private String team_money;
            private Object private_address;
            private Object address_detail;
            private String team_user_money;
            private int count_yeji;
            private String level_name;
            private String invite_url;
            private int is_show;
            private List<?> help_key;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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

            public int getParent_id() {
                return parent_id;
            }

            public void setParent_id(int parent_id) {
                this.parent_id = parent_id;
            }

            public String getInvitation_code() {
                return invitation_code;
            }

            public void setInvitation_code(String invitation_code) {
                this.invitation_code = invitation_code;
            }

            public int getIs_block() {
                return is_block;
            }

            public void setIs_block(int is_block) {
                this.is_block = is_block;
            }

            public Object getLogin_ip() {
                return login_ip;
            }

            public void setLogin_ip(Object login_ip) {
                this.login_ip = login_ip;
            }

            public int getLogin_count() {
                return login_count;
            }

            public void setLogin_count(int login_count) {
                this.login_count = login_count;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getUser_level() {
                return user_level;
            }

            public void setUser_level(int user_level) {
                this.user_level = user_level;
            }

            public String getPay_password() {
                return pay_password;
            }

            public void setPay_password(String pay_password) {
                this.pay_password = pay_password;
            }

            public Object getUuid() {
                return uuid;
            }

            public void setUuid(Object uuid) {
                this.uuid = uuid;
            }

            public int getArea_code() {
                return area_code;
            }

            public void setArea_code(int area_code) {
                this.area_code = area_code;
            }

            public Object getRegister_address() {
                return register_address;
            }

            public void setRegister_address(Object register_address) {
                this.register_address = register_address;
            }

            public Object getEmail() {
                return email;
            }

            public void setEmail(Object email) {
                this.email = email;
            }

            public Object getHelp_word() {
                return help_word;
            }

            public void setHelp_word(Object help_word) {
                this.help_word = help_word;
            }

            public int getAgency_id() {
                return agency_id;
            }

            public void setAgency_id(int agency_id) {
                this.agency_id = agency_id;
            }

            public String getConsume() {
                return consume;
            }

            public void setConsume(String consume) {
                this.consume = consume;
            }

            public int getIs_valid() {
                return is_valid;
            }

            public void setIs_valid(int is_valid) {
                this.is_valid = is_valid;
            }

            public String getTeam_money() {
                return team_money;
            }

            public void setTeam_money(String team_money) {
                this.team_money = team_money;
            }

            public Object getPrivate_address() {
                return private_address;
            }

            public void setPrivate_address(Object private_address) {
                this.private_address = private_address;
            }

            public Object getAddress_detail() {
                return address_detail;
            }

            public void setAddress_detail(Object address_detail) {
                this.address_detail = address_detail;
            }

            public String getTeam_user_money() {
                return team_user_money;
            }

            public void setTeam_user_money(String team_user_money) {
                this.team_user_money = team_user_money;
            }

            public int getCount_yeji() {
                return count_yeji;
            }

            public void setCount_yeji(int count_yeji) {
                this.count_yeji = count_yeji;
            }

            public String getLevel_name() {
                return level_name;
            }

            public void setLevel_name(String level_name) {
                this.level_name = level_name;
            }

            public String getInvite_url() {
                return invite_url;
            }

            public void setInvite_url(String invite_url) {
                this.invite_url = invite_url;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public List<?> getHelp_key() {
                return help_key;
            }

            public void setHelp_key(List<?> help_key) {
                this.help_key = help_key;
            }
        }

        public static class SlideBean {
            /**
             * id : 8
             * cover : http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2FWechatIMGa600301fcaf0dfc9604a986f459e8cf9.jpeg?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=H%2FRjC6JwjvmQJ7OgcASjxvHguY0%3D&Expires=1574587458
             * show_location : 1
             * name : 234
             * created_at : 2019-09-11 18:26:43
             * updated_at : 2019-11-04 10:55:30
             */

            private int id;
            private String cover;
            private int show_location;
            private String name;
            private String created_at;
            private String updated_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getShow_location() {
                return show_location;
            }

            public void setShow_location(int show_location) {
                this.show_location = show_location;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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
        }
    }
}
