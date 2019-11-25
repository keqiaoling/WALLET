package com.example.myapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.myapplication.ZgwApplication;

public class SharedPreferenceUtils {

    private static SharedPreferences getAppSp() {
        return ZgwApplication.getContext().getSharedPreferences("8+1", Context.MODE_PRIVATE);
    }

    //记住密码
    public static boolean getJiZhu() {
        return getAppSp().getBoolean("jiZhu", false);
    }

    public static void setJiZhu(boolean jiZhu) {
        getAppSp().edit().putBoolean("jiZhu", jiZhu).apply();
    }

    //引导页
    public static boolean getYinDao() {
        return getAppSp().getBoolean("yindao", false);
    }

    public static void setYinDao(boolean yindao) {
        getAppSp().edit().putBoolean("yindao", yindao).apply();
    }


    //语言
    public static String getYuYan() {
        return getAppSp().getString("yuyan", "");
    }

    public static void setYuYan(String jiZhu) {
        getAppSp().edit().putString("yuyan", jiZhu).apply();
    }

    //是否登录
    public static boolean getLogin() {
        return getAppSp().getBoolean("login", false);
    }

    public static void setLogin(boolean login) {
        getAppSp().edit().putBoolean("login", login).apply();
    }

    //账号
    public static String getName() {
        return getAppSp().getString("name", "");
    }

    public static void setName(String name) {
        getAppSp().edit().putString("name", name).apply();
    }

    //密码
    public static String getPass() {
        return getAppSp().getString("pass", "");
    }

    public static void setPass(String pass) {
        getAppSp().edit().putString("pass", pass).apply();
    }

    //token
    public static String getToken() {
        return getAppSp().getString("token", "");
    }

    public static void setToken(String pass) {
        getAppSp().edit().putString("token", pass).apply();
    }

}
