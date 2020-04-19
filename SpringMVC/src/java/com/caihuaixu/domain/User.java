package com.caihuaixu.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String sex;
    private Integer age;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
