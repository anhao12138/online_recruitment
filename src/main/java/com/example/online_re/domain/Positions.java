package com.example.online_re.domain;

public class Positions {
    private Integer id;

    private String positionname;

    private Integer positionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
}