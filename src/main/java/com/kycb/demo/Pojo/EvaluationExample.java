package com.kycb.demo.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andEvaIdIsNull() {
            addCriterion("eva_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaIdIsNotNull() {
            addCriterion("eva_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaIdEqualTo(String value) {
            addCriterion("eva_id =", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotEqualTo(String value) {
            addCriterion("eva_id <>", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdGreaterThan(String value) {
            addCriterion("eva_id >", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdGreaterThanOrEqualTo(String value) {
            addCriterion("eva_id >=", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLessThan(String value) {
            addCriterion("eva_id <", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLessThanOrEqualTo(String value) {
            addCriterion("eva_id <=", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLike(String value) {
            addCriterion("eva_id like", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotLike(String value) {
            addCriterion("eva_id not like", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdIn(List<String> values) {
            addCriterion("eva_id in", values, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotIn(List<String> values) {
            addCriterion("eva_id not in", values, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdBetween(String value1, String value2) {
            addCriterion("eva_id between", value1, value2, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotBetween(String value1, String value2) {
            addCriterion("eva_id not between", value1, value2, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaNameIsNull() {
            addCriterion("eva_name is null");
            return (Criteria) this;
        }

        public Criteria andEvaNameIsNotNull() {
            addCriterion("eva_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvaNameEqualTo(String value) {
            addCriterion("eva_name =", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotEqualTo(String value) {
            addCriterion("eva_name <>", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameGreaterThan(String value) {
            addCriterion("eva_name >", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameGreaterThanOrEqualTo(String value) {
            addCriterion("eva_name >=", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLessThan(String value) {
            addCriterion("eva_name <", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLessThanOrEqualTo(String value) {
            addCriterion("eva_name <=", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLike(String value) {
            addCriterion("eva_name like", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotLike(String value) {
            addCriterion("eva_name not like", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameIn(List<String> values) {
            addCriterion("eva_name in", values, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotIn(List<String> values) {
            addCriterion("eva_name not in", values, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameBetween(String value1, String value2) {
            addCriterion("eva_name between", value1, value2, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotBetween(String value1, String value2) {
            addCriterion("eva_name not between", value1, value2, "evaName");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andEvaDateIsNull() {
            addCriterion("eva_date is null");
            return (Criteria) this;
        }

        public Criteria andEvaDateIsNotNull() {
            addCriterion("eva_date is not null");
            return (Criteria) this;
        }

        public Criteria andEvaDateEqualTo(Date value) {
            addCriterion("eva_date =", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateNotEqualTo(Date value) {
            addCriterion("eva_date <>", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateGreaterThan(Date value) {
            addCriterion("eva_date >", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eva_date >=", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateLessThan(Date value) {
            addCriterion("eva_date <", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateLessThanOrEqualTo(Date value) {
            addCriterion("eva_date <=", value, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateIn(List<Date> values) {
            addCriterion("eva_date in", values, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateNotIn(List<Date> values) {
            addCriterion("eva_date not in", values, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateBetween(Date value1, Date value2) {
            addCriterion("eva_date between", value1, value2, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaDateNotBetween(Date value1, Date value2) {
            addCriterion("eva_date not between", value1, value2, "evaDate");
            return (Criteria) this;
        }

        public Criteria andEvaTypeIsNull() {
            addCriterion("eva_type is null");
            return (Criteria) this;
        }

        public Criteria andEvaTypeIsNotNull() {
            addCriterion("eva_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvaTypeEqualTo(String value) {
            addCriterion("eva_type =", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeNotEqualTo(String value) {
            addCriterion("eva_type <>", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeGreaterThan(String value) {
            addCriterion("eva_type >", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("eva_type >=", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeLessThan(String value) {
            addCriterion("eva_type <", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeLessThanOrEqualTo(String value) {
            addCriterion("eva_type <=", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeLike(String value) {
            addCriterion("eva_type like", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeNotLike(String value) {
            addCriterion("eva_type not like", value, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeIn(List<String> values) {
            addCriterion("eva_type in", values, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeNotIn(List<String> values) {
            addCriterion("eva_type not in", values, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeBetween(String value1, String value2) {
            addCriterion("eva_type between", value1, value2, "evaType");
            return (Criteria) this;
        }

        public Criteria andEvaTypeNotBetween(String value1, String value2) {
            addCriterion("eva_type not between", value1, value2, "evaType");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
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