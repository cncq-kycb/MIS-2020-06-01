package com.kycb.demo.Pojo;

public class Organizations {
    private String orgId;

    private String orgName;

    private String orgCode;

    private Integer orgState;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getOrgState() {
        return orgState;
    }

    public void setOrgState(Integer orgState) {
        this.orgState = orgState;
    }
}