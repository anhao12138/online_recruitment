package com.example.online_re.domain;

public class Company {
    private Integer companyId;

    private String companyName;

    private String companyDevelopment;

    private String companyField;

    private String companyRecruitmentType;

    private String companyMinimumEducation;

    private String companySalaryRange;

    private String companyJobDescription;

    private String companyWorkplace;

    private String companyImage;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyDevelopment() {
        return companyDevelopment;
    }

    public void setCompanyDevelopment(String companyDevelopment) {
        this.companyDevelopment = companyDevelopment == null ? null : companyDevelopment.trim();
    }

    public String getCompanyField() {
        return companyField;
    }

    public void setCompanyField(String companyField) {
        this.companyField = companyField == null ? null : companyField.trim();
    }

    public String getCompanyRecruitmentType() {
        return companyRecruitmentType;
    }

    public void setCompanyRecruitmentType(String companyRecruitmentType) {
        this.companyRecruitmentType = companyRecruitmentType == null ? null : companyRecruitmentType.trim();
    }

    public String getCompanyMinimumEducation() {
        return companyMinimumEducation;
    }

    public void setCompanyMinimumEducation(String companyMinimumEducation) {
        this.companyMinimumEducation = companyMinimumEducation == null ? null : companyMinimumEducation.trim();
    }

    public String getCompanySalaryRange() {
        return companySalaryRange;
    }

    public void setCompanySalaryRange(String companySalaryRange) {
        this.companySalaryRange = companySalaryRange == null ? null : companySalaryRange.trim();
    }

    public String getCompanyJobDescription() {
        return companyJobDescription;
    }

    public void setCompanyJobDescription(String companyJobDescription) {
        this.companyJobDescription = companyJobDescription == null ? null : companyJobDescription.trim();
    }

    public String getCompanyWorkplace() {
        return companyWorkplace;
    }

    public void setCompanyWorkplace(String companyWorkplace) {
        this.companyWorkplace = companyWorkplace == null ? null : companyWorkplace.trim();
    }

    public String getCompanyImage() {
        return companyImage;
    }

    public void setCompanyImage(String companyImage) {
        this.companyImage = companyImage == null ? null : companyImage.trim();
    }
}