package com.example.online_re.domain;

public class ImageAds {
    private Integer id;

    private String imagepath;

    private String imagealt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public String getImagealt() {
        return imagealt;
    }

    public void setImagealt(String imagealt) {
        this.imagealt = imagealt == null ? null : imagealt.trim();
    }
}