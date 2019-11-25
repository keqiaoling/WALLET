package com.example.myapplication.wode;

public class UpdateImgBean {


    /**
     * status : success
     * code : 200
     * data : {"show_path":"http://chonggou.jiaobaoleshop.com/uploads/users/5375/2019-09-01/DQqttiJ8q6ETRyi9zGShh1GYo74XLERYqdvqJkGm.png","path":"users/5375/2019-09-01/DQqttiJ8q6ETRyi9zGShh1GYo74XLERYqdvqJkGm.png"}
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
         * show_path : http://chonggou.jiaobaoleshop.com/uploads/users/5375/2019-09-01/DQqttiJ8q6ETRyi9zGShh1GYo74XLERYqdvqJkGm.png
         * path : users/5375/2019-09-01/DQqttiJ8q6ETRyi9zGShh1GYo74XLERYqdvqJkGm.png
         */

        private String show_path;
        private String path;

        public String getShow_path() {
            return show_path;
        }

        public void setShow_path(String show_path) {
            this.show_path = show_path;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }
}
