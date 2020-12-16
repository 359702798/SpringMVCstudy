package com.itcast.domain;


import java.util.Date;

public class User {

    private  String username;
    private Integer  age;
    private Date   date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public User() {
    }

    public User(String username, Integer age,Date date) {
        this.username = username;
        this.age = age;
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
