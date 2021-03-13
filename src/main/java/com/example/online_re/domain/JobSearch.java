package com.example.online_re.domain;


public class JobSearch {
    private Integer id;

    private String email;

    private String day;

    private String name;

    private String site;

    private String development;

    private String domanial;

    private String salaried;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development == null ? null : development.trim();
    }

    public String getDomanial() {
        return domanial;
    }

    public void setDomanial(String domanial) {
        this.domanial = domanial == null ? null : domanial.trim();
    }

    public String getSalaried() {
        return salaried;
    }

    public void setSalaried(String salaried) {
        this.salaried = salaried == null ? null : salaried.trim();
    }
}