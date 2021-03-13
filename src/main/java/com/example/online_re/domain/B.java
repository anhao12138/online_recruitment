package com.example.online_re.domain;

import java.util.List;

public class B {
    private Integer bid;

    private String bname;

    private Integer bId;

    private List<C> getc;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }
}