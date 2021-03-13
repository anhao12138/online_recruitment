package com.example.online_re.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Date;

/**
 * 用户列表
 */
public class UserLogin {


    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Date creationtime;

    private String msg;

    private Integer applyId;

    /**
     * 有参构造
     * @param id
     * @param name
     * @param password
     * @param phone
     * @param creationtime
     * @param msg
     */
    public UserLogin(Integer id, String name, String password, String phone, Date creationtime, String msg) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.creationtime = creationtime;
        this.msg = msg;
    }

    public UserLogin(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }


    public UserLogin(){}

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }
}