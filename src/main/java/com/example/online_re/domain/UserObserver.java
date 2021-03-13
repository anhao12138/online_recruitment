package com.example.online_re.domain;

public class UserObserver {
    private Integer id;

    private String name;

    private String observer;

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

    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer == null ? null : observer.trim();
    }
}