package com.example.myapplication.begin.bean;

public class LoginBean {

    /**
     * status : success
     * code : 200
     * data : {"token":"bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC9jaG9uZ2dvdS5qaWFiYW9sZXNob3AuY29tXC9hcGlcL3YxXC9hdXRoXC9sb2dpbiIsImlhdCI6MTU2NzM2Mjg5NSwiZXhwIjoyMTY3MzYyODM1LCJuYmYiOjE1NjczNjI4OTUsImp0aSI6IkdIa2dmb21rQXhxR05Hdm8iLCJzdWIiOjUzNzUsInBydiI6ImI5MTI3OTk3OGYxMWFhN2JjNTY3MDQ4N2ZmZjAxZTIyODI1M2ZlNDgiLCJndWFyZCI6ImFwaSJ9.HqIqfSaGNIE9xS5FLc5kQ3zD6LOzz79juvgQ1jQnxiA"}
     */

    private String status;
    private int code;
    private String message;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

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
         * token : bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC9jaG9uZ2dvdS5qaWFiYW9sZXNob3AuY29tXC9hcGlcL3YxXC9hdXRoXC9sb2dpbiIsImlhdCI6MTU2NzM2Mjg5NSwiZXhwIjoyMTY3MzYyODM1LCJuYmYiOjE1NjczNjI4OTUsImp0aSI6IkdIa2dmb21rQXhxR05Hdm8iLCJzdWIiOjUzNzUsInBydiI6ImI5MTI3OTk3OGYxMWFhN2JjNTY3MDQ4N2ZmZjAxZTIyODI1M2ZlNDgiLCJndWFyZCI6ImFwaSJ9.HqIqfSaGNIE9xS5FLc5kQ3zD6LOzz79juvgQ1jQnxiA
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
