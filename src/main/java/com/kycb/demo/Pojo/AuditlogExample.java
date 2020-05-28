package com.kycb.demo.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAuditIdIsNull() {
            addCriterion("audit_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("audit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(String value) {
            addCriterion("audit_id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(String value) {
            addCriterion("audit_id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(String value) {
            addCriterion("audit_id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(String value) {
            addCriterion("audit_id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(String value) {
            addCriterion("audit_id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLike(String value) {
            addCriterion("audit_id like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotLike(String value) {
            addCriterion("audit_id not like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<String> values) {
            addCriterion("audit_id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<String> values) {
            addCriterion("audit_id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(String value1, String value2) {
            addCriterion("audit_id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(String value1, String value2) {
            addCriterion("audit_id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidIsNull() {
            addCriterion("audit_adminid is null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidIsNotNull() {
            addCriterion("audit_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidEqualTo(String value) {
            addCriterion("audit_adminid =", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidNotEqualTo(String value) {
            addCriterion("audit_adminid <>", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidGreaterThan(String value) {
            addCriterion("audit_adminid >", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("audit_adminid >=", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidLessThan(String value) {
            addCriterion("audit_adminid <", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidLessThanOrEqualTo(String value) {
            addCriterion("audit_adminid <=", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidLike(String value) {
            addCriterion("audit_adminid like", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidNotLike(String value) {
            addCriterion("audit_adminid not like", value, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidIn(List<String> values) {
            addCriterion("audit_adminid in", values, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidNotIn(List<String> values) {
            addCriterion("audit_adminid not in", values, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidBetween(String value1, String value2) {
            addCriterion("audit_adminid between", value1, value2, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminidNotBetween(String value1, String value2) {
            addCriterion("audit_adminid not between", value1, value2, "auditAdminid");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameIsNull() {
            addCriterion("audit_adminname is null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameIsNotNull() {
            addCriterion("audit_adminname is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameEqualTo(String value) {
            addCriterion("audit_adminname =", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameNotEqualTo(String value) {
            addCriterion("audit_adminname <>", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameGreaterThan(String value) {
            addCriterion("audit_adminname >", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_adminname >=", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameLessThan(String value) {
            addCriterion("audit_adminname <", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameLessThanOrEqualTo(String value) {
            addCriterion("audit_adminname <=", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameLike(String value) {
            addCriterion("audit_adminname like", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameNotLike(String value) {
            addCriterion("audit_adminname not like", value, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameIn(List<String> values) {
            addCriterion("audit_adminname in", values, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameNotIn(List<String> values) {
            addCriterion("audit_adminname not in", values, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameBetween(String value1, String value2) {
            addCriterion("audit_adminname between", value1, value2, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditAdminnameNotBetween(String value1, String value2) {
            addCriterion("audit_adminname not between", value1, value2, "auditAdminname");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Integer value) {
            addCriterion("audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Integer value) {
            addCriterion("audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Integer value) {
            addCriterion("audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Integer value) {
            addCriterion("audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Integer value) {
            addCriterion("audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Integer> values) {
            addCriterion("audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Integer> values) {
            addCriterion("audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Integer value1, Integer value2) {
            addCriterion("audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNull() {
            addCriterion("audit_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNotNull() {
            addCriterion("audit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNameEqualTo(String value) {
            addCriterion("audit_name =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotEqualTo(String value) {
            addCriterion("audit_name <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThan(String value) {
            addCriterion("audit_name >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_name >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThan(String value) {
            addCriterion("audit_name <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThanOrEqualTo(String value) {
            addCriterion("audit_name <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLike(String value) {
            addCriterion("audit_name like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotLike(String value) {
            addCriterion("audit_name not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameIn(List<String> values) {
            addCriterion("audit_name in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotIn(List<String> values) {
            addCriterion("audit_name not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameBetween(String value1, String value2) {
            addCriterion("audit_name between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotBetween(String value1, String value2) {
            addCriterion("audit_name not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIsNull() {
            addCriterion("audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIsNotNull() {
            addCriterion("audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditReasonEqualTo(String value) {
            addCriterion("audit_reason =", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotEqualTo(String value) {
            addCriterion("audit_reason <>", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonGreaterThan(String value) {
            addCriterion("audit_reason >", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("audit_reason >=", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLessThan(String value) {
            addCriterion("audit_reason <", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("audit_reason <=", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLike(String value) {
            addCriterion("audit_reason like", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotLike(String value) {
            addCriterion("audit_reason not like", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIn(List<String> values) {
            addCriterion("audit_reason in", values, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotIn(List<String> values) {
            addCriterion("audit_reason not in", values, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonBetween(String value1, String value2) {
            addCriterion("audit_reason between", value1, value2, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotBetween(String value1, String value2) {
            addCriterion("audit_reason not between", value1, value2, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(Integer value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(Integer value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(Integer value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(Integer value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(Integer value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<Integer> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<Integer> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(Integer value1, Integer value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemidIsNull() {
            addCriterion("audit_itemid is null");
            return (Criteria) this;
        }

        public Criteria andAuditItemidIsNotNull() {
            addCriterion("audit_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditItemidEqualTo(String value) {
            addCriterion("audit_itemid =", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidNotEqualTo(String value) {
            addCriterion("audit_itemid <>", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidGreaterThan(String value) {
            addCriterion("audit_itemid >", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidGreaterThanOrEqualTo(String value) {
            addCriterion("audit_itemid >=", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidLessThan(String value) {
            addCriterion("audit_itemid <", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidLessThanOrEqualTo(String value) {
            addCriterion("audit_itemid <=", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidLike(String value) {
            addCriterion("audit_itemid like", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidNotLike(String value) {
            addCriterion("audit_itemid not like", value, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidIn(List<String> values) {
            addCriterion("audit_itemid in", values, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidNotIn(List<String> values) {
            addCriterion("audit_itemid not in", values, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidBetween(String value1, String value2) {
            addCriterion("audit_itemid between", value1, value2, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andAuditItemidNotBetween(String value1, String value2) {
            addCriterion("audit_itemid not between", value1, value2, "auditItemid");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("apply_reason is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("apply_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("apply_reason =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("apply_reason <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("apply_reason >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_reason >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("apply_reason <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("apply_reason <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("apply_reason like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("apply_reason not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("apply_reason in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("apply_reason not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("apply_reason between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("apply_reason not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(String value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(String value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(String value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(String value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(String value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLike(String value) {
            addCriterion("audit_user like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotLike(String value) {
            addCriterion("audit_user not like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<String> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<String> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(String value1, String value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(String value1, String value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIsNull() {
            addCriterion("audit_userid is null");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIsNotNull() {
            addCriterion("audit_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUseridEqualTo(String value) {
            addCriterion("audit_userid =", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotEqualTo(String value) {
            addCriterion("audit_userid <>", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThan(String value) {
            addCriterion("audit_userid >", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThanOrEqualTo(String value) {
            addCriterion("audit_userid >=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThan(String value) {
            addCriterion("audit_userid <", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThanOrEqualTo(String value) {
            addCriterion("audit_userid <=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLike(String value) {
            addCriterion("audit_userid like", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotLike(String value) {
            addCriterion("audit_userid not like", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIn(List<String> values) {
            addCriterion("audit_userid in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotIn(List<String> values) {
            addCriterion("audit_userid not in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridBetween(String value1, String value2) {
            addCriterion("audit_userid between", value1, value2, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotBetween(String value1, String value2) {
            addCriterion("audit_userid not between", value1, value2, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherIsNull() {
            addCriterion("audit_teacher is null");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherIsNotNull() {
            addCriterion("audit_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherEqualTo(String value) {
            addCriterion("audit_teacher =", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherNotEqualTo(String value) {
            addCriterion("audit_teacher <>", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherGreaterThan(String value) {
            addCriterion("audit_teacher >", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("audit_teacher >=", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherLessThan(String value) {
            addCriterion("audit_teacher <", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherLessThanOrEqualTo(String value) {
            addCriterion("audit_teacher <=", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherLike(String value) {
            addCriterion("audit_teacher like", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherNotLike(String value) {
            addCriterion("audit_teacher not like", value, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherIn(List<String> values) {
            addCriterion("audit_teacher in", values, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherNotIn(List<String> values) {
            addCriterion("audit_teacher not in", values, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherBetween(String value1, String value2) {
            addCriterion("audit_teacher between", value1, value2, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacherNotBetween(String value1, String value2) {
            addCriterion("audit_teacher not between", value1, value2, "auditTeacher");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridIsNull() {
            addCriterion("audit_teacherid is null");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridIsNotNull() {
            addCriterion("audit_teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridEqualTo(String value) {
            addCriterion("audit_teacherid =", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridNotEqualTo(String value) {
            addCriterion("audit_teacherid <>", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridGreaterThan(String value) {
            addCriterion("audit_teacherid >", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("audit_teacherid >=", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridLessThan(String value) {
            addCriterion("audit_teacherid <", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridLessThanOrEqualTo(String value) {
            addCriterion("audit_teacherid <=", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridLike(String value) {
            addCriterion("audit_teacherid like", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridNotLike(String value) {
            addCriterion("audit_teacherid not like", value, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridIn(List<String> values) {
            addCriterion("audit_teacherid in", values, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridNotIn(List<String> values) {
            addCriterion("audit_teacherid not in", values, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridBetween(String value1, String value2) {
            addCriterion("audit_teacherid between", value1, value2, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditTeacheridNotBetween(String value1, String value2) {
            addCriterion("audit_teacherid not between", value1, value2, "auditTeacherid");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIsNull() {
            addCriterion("audit_comment is null");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIsNotNull() {
            addCriterion("audit_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCommentEqualTo(String value) {
            addCriterion("audit_comment =", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotEqualTo(String value) {
            addCriterion("audit_comment <>", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentGreaterThan(String value) {
            addCriterion("audit_comment >", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentGreaterThanOrEqualTo(String value) {
            addCriterion("audit_comment >=", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLessThan(String value) {
            addCriterion("audit_comment <", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLessThanOrEqualTo(String value) {
            addCriterion("audit_comment <=", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLike(String value) {
            addCriterion("audit_comment like", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotLike(String value) {
            addCriterion("audit_comment not like", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIn(List<String> values) {
            addCriterion("audit_comment in", values, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotIn(List<String> values) {
            addCriterion("audit_comment not in", values, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentBetween(String value1, String value2) {
            addCriterion("audit_comment between", value1, value2, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotBetween(String value1, String value2) {
            addCriterion("audit_comment not between", value1, value2, "auditComment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}