package com.example.online_re.domain;

public class JobBasic {
    private Integer basicId;

    private String name;

    private String major;

    private String phone;

    private String email;

    private String state;

    private String sex;

    private String agelimit;

    public Integer getBasicId() {
        return basicId;
    }

    public void setBasicId(Integer basicId) {
        this.basicId = basicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAgelimit() {
        return agelimit;
    }

    public void setAgelimit(String agelimit) {
        this.agelimit = agelimit == null ? null : agelimit.trim();
    }
}