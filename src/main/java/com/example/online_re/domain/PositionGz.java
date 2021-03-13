package com.example.online_re.domain;

import java.util.Date;

public class PositionGz {
    private Integer id;

    private Integer category1;

    private Integer category2;

    private String name;

    private String nature;

    private Integer high;

    private Integer low;

    private String address;

    private String workTime;

    private String education;

    private String attacts;

    private String describe;

    private Date creationTime;

    private Integer positionId;

    private Integer hotPosition;

    private Integer companyId;

    private Date data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory1() {
        return category1;
    }

    public void setCategory1(Integer category1) {
        this.category1 = category1;
    }

    public Integer getCategory2() {
        return category2;
    }

    public void setCategory2(Integer category2) {
        this.category2 = category2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getAttacts() {
        return attacts;
    }

    public void setAttacts(String attacts) {
        this.attacts = attacts == null ? null : attacts.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getHotPosition() {
        return hotPosition;
    }

    public void setHotPosition(Integer hotPosition) {
        this.hotPosition = hotPosition;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}