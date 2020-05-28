package com.kycb.demo.Pojo;

import java.util.Date;

public class Auditlog {
    private String auditId;

    private Date auditDate;

    private Date applyDate;

    private String auditAdminid;

    private String auditAdminname;

    private Integer auditType;

    private String auditName;

    private String auditReason;

    private Integer auditResult;

    private String auditItemid;

    private String applyReason;

    private String auditUser;

    private String auditUserid;

    private String auditTeacher;

    private String auditTeacherid;

    private String auditComment;

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getAuditAdminid() {
        return auditAdminid;
    }

    public void setAuditAdminid(String auditAdminid) {
        this.auditAdminid = auditAdminid == null ? null : auditAdminid.trim();
    }

    public String getAuditAdminname() {
        return auditAdminname;
    }

    public void setAuditAdminname(String auditAdminname) {
        this.auditAdminname = auditAdminname == null ? null : auditAdminname.trim();
    }

    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason == null ? null : auditReason.trim();
    }

    public Integer getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditItemid() {
        return auditItemid;
    }

    public void setAuditItemid(String auditItemid) {
        this.auditItemid = auditItemid == null ? null : auditItemid.trim();
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public String getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(String auditUserid) {
        this.auditUserid = auditUserid == null ? null : auditUserid.trim();
    }

    public String getAuditTeacher() {
        return auditTeacher;
    }

    public void setAuditTeacher(String auditTeacher) {
        this.auditTeacher = auditTeacher == null ? null : auditTeacher.trim();
    }

    public String getAuditTeacherid() {
        return auditTeacherid;
    }

    public void setAuditTeacherid(String auditTeacherid) {
        this.auditTeacherid = auditTeacherid == null ? null : auditTeacherid.trim();
    }

    public String getAuditComment() {
        return auditComment;
    }

    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment == null ? null : auditComment.trim();
    }
}