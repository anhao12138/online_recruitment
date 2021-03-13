package com.example.online_re.domain;

public class jobWithBLOBs extends job {
    private String description;

    private String testContent;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent == null ? null : testContent.trim();
    }
}