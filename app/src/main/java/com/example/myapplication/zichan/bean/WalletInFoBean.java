package com.example.myapplication.zichan.bean;

import java.util.List;

public class WalletInFoBean {

    /**
     * status : success
     * code : 200
     * data : {"list":{"current_page":1,"data":[{"id":1795,"user_id":1623,"value":"0.05120","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.05120000","after":"0.00000000","dui":"IA08169621322397","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05632000","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1796,"user_id":1623,"value":"0.05178","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.10298400","after":"0.05120000","dui":"IA08169439256536","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05696240","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1797,"user_id":1623,"value":"0.14207","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.24505600","after":"0.10298400","dui":"IA09012780160020","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.15627920","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11764,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.26872000","after":"0.24505600","dui":"IA09862914331755","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11765,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.29238400","after":"0.26872000","dui":"IA09515414472564","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11766,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30064000","after":"0.29238400","dui":"IA10894482589538","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11767,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30889600","after":"0.30064000","dui":"IA10374218806738","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11768,"user_id":1623,"value":"0.16388","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.47277600","after":"0.30889600","dui":"IA10946257308489","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.19838657","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11769,"user_id":1623,"value":"0.09053","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.56330400","after":"0.47277600","dui":"IA10377898111930","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.10958958","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11770,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.58696800","after":"0.56330400","dui":"IA09515076704242","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11771,"user_id":1623,"value":"0.00977","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.59673600","after":"0.58696800","dui":"IA10895362441926","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01182475","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11772,"user_id":1623,"value":"0.00674","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.60348000","after":"0.59673600","dui":"IA10375036303096","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00816402","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11773,"user_id":1623,"value":"0.11831","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.72179200","after":"0.60348000","dui":"IA09851418610363","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.14322377","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11774,"user_id":1623,"value":"0.01800","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.73979200","after":"0.72179200","dui":"IA10375609844155","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02179008","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11775,"user_id":1623,"value":"0.00868","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.74847200","after":"0.73979200","dui":"IA08641974786628","memo":"平级奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01050766","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}}],"first_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=1","from":1,"last_page":9319,"last_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=9319","next_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=2","path":"http://api.xwallet.vip/api/v1/wallet/wallets_detail","per_page":15,"prev_page_url":null,"to":15,"total":139780},"wallet_info":{"id":9,"user_id":5480,"currency_id":9,"address":"0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D","change_balance":"1408.68278413","old_balance":"0.00000000","lock_balance":"0.000000000000","push_service":"0.000000000000","lock_guilong":"否","llv_balance":"0.00","put_balance":"0.00","is_new":1,"address1":"0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D","currency_name":"XCN","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=Protki5pjiGVBA2KPcbr89I9Ek4%3D&Expires=1574223712","currency_type":"erc20","doll_balance":"3,348.44","usdt_price":"2.38"}}
     */

    private String status;
    private int code;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * list : {"current_page":1,"data":[{"id":1795,"user_id":1623,"value":"0.05120","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.05120000","after":"0.00000000","dui":"IA08169621322397","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05632000","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1796,"user_id":1623,"value":"0.05178","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.10298400","after":"0.05120000","dui":"IA08169439256536","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05696240","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1797,"user_id":1623,"value":"0.14207","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.24505600","after":"0.10298400","dui":"IA09012780160020","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.15627920","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11764,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.26872000","after":"0.24505600","dui":"IA09862914331755","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11765,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.29238400","after":"0.26872000","dui":"IA09515414472564","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11766,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30064000","after":"0.29238400","dui":"IA10894482589538","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11767,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30889600","after":"0.30064000","dui":"IA10374218806738","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11768,"user_id":1623,"value":"0.16388","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.47277600","after":"0.30889600","dui":"IA10946257308489","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.19838657","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11769,"user_id":1623,"value":"0.09053","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.56330400","after":"0.47277600","dui":"IA10377898111930","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.10958958","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11770,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.58696800","after":"0.56330400","dui":"IA09515076704242","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11771,"user_id":1623,"value":"0.00977","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.59673600","after":"0.58696800","dui":"IA10895362441926","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01182475","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11772,"user_id":1623,"value":"0.00674","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.60348000","after":"0.59673600","dui":"IA10375036303096","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00816402","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11773,"user_id":1623,"value":"0.11831","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.72179200","after":"0.60348000","dui":"IA09851418610363","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.14322377","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11774,"user_id":1623,"value":"0.01800","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.73979200","after":"0.72179200","dui":"IA10375609844155","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02179008","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11775,"user_id":1623,"value":"0.00868","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.74847200","after":"0.73979200","dui":"IA08641974786628","memo":"平级奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01050766","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}}],"first_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=1","from":1,"last_page":9319,"last_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=9319","next_page_url":"http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=2","path":"http://api.xwallet.vip/api/v1/wallet/wallets_detail","per_page":15,"prev_page_url":null,"to":15,"total":139780}
         * wallet_info : {"id":9,"user_id":5480,"currency_id":9,"address":"0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D","change_balance":"1408.68278413","old_balance":"0.00000000","lock_balance":"0.000000000000","push_service":"0.000000000000","lock_guilong":"否","llv_balance":"0.00","put_balance":"0.00","is_new":1,"address1":"0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D","currency_name":"XCN","logo":"http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=Protki5pjiGVBA2KPcbr89I9Ek4%3D&Expires=1574223712","currency_type":"erc20","doll_balance":"3,348.44","usdt_price":"2.38"}
         */

        private ListBean list;
        private WalletInfoBean wallet_info;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public WalletInfoBean getWallet_info() {
            return wallet_info;
        }

        public void setWallet_info(WalletInfoBean wallet_info) {
            this.wallet_info = wallet_info;
        }

        public static class ListBean {
            /**
             * current_page : 1
             * data : [{"id":1795,"user_id":1623,"value":"0.05120","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.05120000","after":"0.00000000","dui":"IA08169621322397","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05632000","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1796,"user_id":1623,"value":"0.05178","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.10298400","after":"0.05120000","dui":"IA08169439256536","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.05696240","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":1797,"user_id":1623,"value":"0.14207","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-10 10:00:30","updated_at":"2019-10-10 10:00:30","before":"0.24505600","after":"0.10298400","dui":"IA09012780160020","memo":"佣金奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.15627920","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11764,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.26872000","after":"0.24505600","dui":"IA09862914331755","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11765,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.29238400","after":"0.26872000","dui":"IA09515414472564","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11766,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30064000","after":"0.29238400","dui":"IA10894482589538","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11767,"user_id":1623,"value":"0.00826","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.30889600","after":"0.30064000","dui":"IA10374218806738","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00999438","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11768,"user_id":1623,"value":"0.16388","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.47277600","after":"0.30889600","dui":"IA10946257308489","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.19838657","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11769,"user_id":1623,"value":"0.09053","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.56330400","after":"0.47277600","dui":"IA10377898111930","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.10958958","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11770,"user_id":1623,"value":"0.02366","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.58696800","after":"0.56330400","dui":"IA09515076704242","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02864669","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11771,"user_id":1623,"value":"0.00977","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.59673600","after":"0.58696800","dui":"IA10895362441926","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01182475","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11772,"user_id":1623,"value":"0.00674","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.60348000","after":"0.59673600","dui":"IA10375036303096","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.00816402","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11773,"user_id":1623,"value":"0.11831","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.72179200","after":"0.60348000","dui":"IA09851418610363","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.14322377","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11774,"user_id":1623,"value":"0.01800","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.73979200","after":"0.72179200","dui":"IA10375609844155","memo":"代数奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.02179008","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}},{"id":11775,"user_id":1623,"value":"0.00868","type":"未知","currency_id":9,"status":1,"deleted_at":null,"created_at":"2019-10-12 15:57:22","updated_at":"2019-10-12 15:57:22","before":"0.74847200","after":"0.73979200","dui":"IA08641974786628","memo":"平级奖励","level":"","contract_id":0,"contract_rate":"0.00000000","number":"0.01050766","dy_id":0,"currencies":{"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}}]
             * first_page_url : http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=1
             * from : 1
             * last_page : 9319
             * last_page_url : http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=9319
             * next_page_url : http://api.xwallet.vip/api/v1/wallet/wallets_detail?page=2
             * path : http://api.xwallet.vip/api/v1/wallet/wallets_detail
             * per_page : 15
             * prev_page_url : null
             * to : 15
             * total : 139780
             */

            private int current_page;
            private String first_page_url;
            private int from;
            private int last_page;
            private String last_page_url;
            private String next_page_url;
            private String path;
            private int per_page;
            private Object prev_page_url;
            private int to;
            private int total;
            private List<DataBean> data;

            public int getCurrent_page() {
                return current_page;
            }

            public void setCurrent_page(int current_page) {
                this.current_page = current_page;
            }

            public String getFirst_page_url() {
                return first_page_url;
            }

            public void setFirst_page_url(String first_page_url) {
                this.first_page_url = first_page_url;
            }

            public int getFrom() {
                return from;
            }

            public void setFrom(int from) {
                this.from = from;
            }

            public int getLast_page() {
                return last_page;
            }

            public void setLast_page(int last_page) {
                this.last_page = last_page;
            }

            public String getLast_page_url() {
                return last_page_url;
            }

            public void setLast_page_url(String last_page_url) {
                this.last_page_url = last_page_url;
            }

            public String getNext_page_url() {
                return next_page_url;
            }

            public void setNext_page_url(String next_page_url) {
                this.next_page_url = next_page_url;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getPer_page() {
                return per_page;
            }

            public void setPer_page(int per_page) {
                this.per_page = per_page;
            }

            public Object getPrev_page_url() {
                return prev_page_url;
            }

            public void setPrev_page_url(Object prev_page_url) {
                this.prev_page_url = prev_page_url;
            }

            public int getTo() {
                return to;
            }

            public void setTo(int to) {
                this.to = to;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * id : 1795
                 * user_id : 1623
                 * value : 0.05120
                 * type : 未知
                 * currency_id : 9
                 * status : 1
                 * deleted_at : null
                 * created_at : 2019-10-10 10:00:30
                 * updated_at : 2019-10-10 10:00:30
                 * before : 0.05120000
                 * after : 0.00000000
                 * dui : IA08169621322397
                 * memo : 佣金奖励
                 * level :
                 * contract_id : 0
                 * contract_rate : 0.00000000
                 * number : 0.05632000
                 * dy_id : 0
                 * currencies : {"id":9,"name":"XCN","type":"erc20","usdt_price":"2.37700000"}
                 */

                private int id;
                private int user_id;
                private String value;
                private String type;
                private int currency_id;
                private int status;
                private Object deleted_at;
                private String created_at;
                private String updated_at;
                private String before;
                private String after;
                private String dui;
                private String memo;
                private String level;
                private int contract_id;
                private String contract_rate;
                private String number;
                private int dy_id;
                private CurrenciesBean currencies;

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

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getCurrency_id() {
                    return currency_id;
                }

                public void setCurrency_id(int currency_id) {
                    this.currency_id = currency_id;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public Object getDeleted_at() {
                    return deleted_at;
                }

                public void setDeleted_at(Object deleted_at) {
                    this.deleted_at = deleted_at;
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

                public String getBefore() {
                    return before;
                }

                public void setBefore(String before) {
                    this.before = before;
                }

                public String getAfter() {
                    return after;
                }

                public void setAfter(String after) {
                    this.after = after;
                }

                public String getDui() {
                    return dui;
                }

                public void setDui(String dui) {
                    this.dui = dui;
                }

                public String getMemo() {
                    return memo;
                }

                public void setMemo(String memo) {
                    this.memo = memo;
                }

                public String getLevel() {
                    return level;
                }

                public void setLevel(String level) {
                    this.level = level;
                }

                public int getContract_id() {
                    return contract_id;
                }

                public void setContract_id(int contract_id) {
                    this.contract_id = contract_id;
                }

                public String getContract_rate() {
                    return contract_rate;
                }

                public void setContract_rate(String contract_rate) {
                    this.contract_rate = contract_rate;
                }

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }

                public int getDy_id() {
                    return dy_id;
                }

                public void setDy_id(int dy_id) {
                    this.dy_id = dy_id;
                }

                public CurrenciesBean getCurrencies() {
                    return currencies;
                }

                public void setCurrencies(CurrenciesBean currencies) {
                    this.currencies = currencies;
                }

                public static class CurrenciesBean {
                    /**
                     * id : 9
                     * name : XCN
                     * type : erc20
                     * usdt_price : 2.37700000
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

        public static class WalletInfoBean {
            /**
             * id : 9
             * user_id : 5480
             * currency_id : 9
             * address : 0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D
             * change_balance : 1408.68278413
             * old_balance : 0.00000000
             * lock_balance : 0.000000000000
             * push_service : 0.000000000000
             * lock_guilong : 否
             * llv_balance : 0.00
             * put_balance : 0.00
             * is_new : 1
             * address1 : 0x669e1aad26c21fdb0Bb3446639e34aF5aDeEFb5D
             * currency_name : XCN
             * logo : http://xwallet81.oss-cn-hongkong.aliyuncs.com/images%2F%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191019152422.png?OSSAccessKeyId=LTAI4FfN9jSdKYJNm7aA8ggJ&Signature=Protki5pjiGVBA2KPcbr89I9Ek4%3D&Expires=1574223712
             * currency_type : erc20
             * doll_balance : 3,348.44
             * usdt_price : 2.38
             */

            private int id;
            private int user_id;
            private int currency_id;
            private String address;
            private String change_balance;
            private String old_balance;
            private String lock_balance;
            private String push_service;
            private String lock_guilong;
            private String llv_balance;
            private String put_balance;
            private int is_new;
            private String address1;
            private String currency_name;
            private String logo;
            private String currency_type;
            private String doll_balance;
            private String usdt_price;
            private String is_dui;
            private String is_transfer;
            private String is_recharge;
            private String is_withdraw;
            private String is_contract;

            public String getIs_dui() {
                return is_dui;
            }

            public void setIs_dui(String is_dui) {
                this.is_dui = is_dui;
            }

            public String getIs_transfer() {
                return is_transfer;
            }

            public void setIs_transfer(String is_transfer) {
                this.is_transfer = is_transfer;
            }

            public String getIs_recharge() {
                return is_recharge;
            }

            public void setIs_recharge(String is_recharge) {
                this.is_recharge = is_recharge;
            }

            public String getIs_withdraw() {
                return is_withdraw;
            }

            public void setIs_withdraw(String is_withdraw) {
                this.is_withdraw = is_withdraw;
            }

            public String getIs_contract() {
                return is_contract;
            }

            public void setIs_contract(String is_contract) {
                this.is_contract = is_contract;
            }

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

            public int getCurrency_id() {
                return currency_id;
            }

            public void setCurrency_id(int currency_id) {
                this.currency_id = currency_id;
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

            public String getOld_balance() {
                return old_balance;
            }

            public void setOld_balance(String old_balance) {
                this.old_balance = old_balance;
            }

            public String getLock_balance() {
                return lock_balance;
            }

            public void setLock_balance(String lock_balance) {
                this.lock_balance = lock_balance;
            }

            public String getPush_service() {
                return push_service;
            }

            public void setPush_service(String push_service) {
                this.push_service = push_service;
            }

            public String getLock_guilong() {
                return lock_guilong;
            }

            public void setLock_guilong(String lock_guilong) {
                this.lock_guilong = lock_guilong;
            }

            public String getLlv_balance() {
                return llv_balance;
            }

            public void setLlv_balance(String llv_balance) {
                this.llv_balance = llv_balance;
            }

            public String getPut_balance() {
                return put_balance;
            }

            public void setPut_balance(String put_balance) {
                this.put_balance = put_balance;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getAddress1() {
                return address1;
            }

            public void setAddress1(String address1) {
                this.address1 = address1;
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

            public String getDoll_balance() {
                return doll_balance;
            }

            public void setDoll_balance(String doll_balance) {
                this.doll_balance = doll_balance;
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
