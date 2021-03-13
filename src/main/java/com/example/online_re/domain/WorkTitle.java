package com.example.online_re.domain;

public class WorkTitle {
    private Integer wordId;

    private String site;

    private String workState;

    private String workName;

    private String workSalaried;

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState == null ? null : workState.trim();
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public String getWorkSalaried() {
        return workSalaried;
    }

    public void setWorkSalaried(String workSalaried) {
        this.workSalaried = workSalaried == null ? null : workSalaried.trim();
    }
}