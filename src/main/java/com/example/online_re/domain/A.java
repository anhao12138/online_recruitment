package com.example.online_re.domain;

import java.util.List;

public class A {
    private Integer aid;

    private String aname;

    private List<B> getb;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }
}