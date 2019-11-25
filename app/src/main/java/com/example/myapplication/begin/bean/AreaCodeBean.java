package com.example.myapplication.begin.bean;

import java.io.Serializable;

public class AreaCodeBean implements Serializable {

    /**
     * area_code : +86
     * country_id : 37
     * name_cn : 中国大陆
     * name_en : China
     */

    private String area_code;
    private String country_id;
    private String name_cn;
    private String name_en;

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
}
