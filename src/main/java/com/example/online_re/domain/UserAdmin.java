package com.example.online_re.domain;

import org.apache.catalina.User;

public class UserAdmin {

    private Integer applyid;

    private String applyname;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }
}