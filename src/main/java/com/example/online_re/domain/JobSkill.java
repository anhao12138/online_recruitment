package com.example.online_re.domain;

public class JobSkill {
    private Integer joboneid;

    private String jobtwoname;

    private Integer jobtwoid;

    public Integer getJoboneid() {
        return joboneid;
    }

    public void setJoboneid(Integer joboneid) {
        this.joboneid = joboneid;
    }

    public String getJobtwoname() {
        return jobtwoname;
    }

    public void setJobtwoname(String jobtwoname) {
        this.jobtwoname = jobtwoname == null ? null : jobtwoname.trim();
    }

    public Integer getJobtwoid() {
        return jobtwoid;
    }

    public void setJobtwoid(Integer jobtwoid) {
        this.jobtwoid = jobtwoid;
    }
}