package com.example.online_re.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Position {
    private BigDecimal id;

    private Integer comapnyId;

    private String title;

    private String jobArea;

    private BigDecimal salary;

    private String jobContacts;

    private String jobPhone;

    private String jobEmail;

    private Boolean status;

    private Long creatorId;

    private Date updateTime;

    private Date createTime;

    private String testContent;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Integer getComapnyId() {
        return comapnyId;
    }

    public void setComapnyId(Integer comapnyId) {
        this.comapnyId = comapnyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getJobArea() {
        return jobArea;
    }

    public void setJobArea(String jobArea) {
        this.jobArea = jobArea == null ? null : jobArea.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJobContacts() {
        return jobContacts;
    }

    public void setJobContacts(String jobContacts) {
        this.jobContacts = jobContacts == null ? null : jobContacts.trim();
    }

    public String getJobPhone() {
        return jobPhone;
    }

    public void setJobPhone(String jobPhone) {
        this.jobPhone = jobPhone == null ? null : jobPhone.trim();
    }

    public String getJobEmail() {
        return jobEmail;
    }

    public void setJobEmail(String jobEmail) {
        this.jobEmail = jobEmail == null ? null : jobEmail.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent == null ? null : testContent.trim();
    }
}