package com.he.pojo;

import java.util.ArrayList;
import java.util.List;

public class MailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMainReceiveIsNull() {
            addCriterion("main_receive is null");
            return (Criteria) this;
        }

        public Criteria andMainReceiveIsNotNull() {
            addCriterion("main_receive is not null");
            return (Criteria) this;
        }

        public Criteria andMainReceiveEqualTo(String value) {
            addCriterion("main_receive =", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveNotEqualTo(String value) {
            addCriterion("main_receive <>", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveGreaterThan(String value) {
            addCriterion("main_receive >", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("main_receive >=", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveLessThan(String value) {
            addCriterion("main_receive <", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveLessThanOrEqualTo(String value) {
            addCriterion("main_receive <=", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveLike(String value) {
            addCriterion("main_receive like", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveNotLike(String value) {
            addCriterion("main_receive not like", value, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveIn(List<String> values) {
            addCriterion("main_receive in", values, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveNotIn(List<String> values) {
            addCriterion("main_receive not in", values, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveBetween(String value1, String value2) {
            addCriterion("main_receive between", value1, value2, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMainReceiveNotBetween(String value1, String value2) {
            addCriterion("main_receive not between", value1, value2, "mainReceive");
            return (Criteria) this;
        }

        public Criteria andMailTitleIsNull() {
            addCriterion("mail_title is null");
            return (Criteria) this;
        }

        public Criteria andMailTitleIsNotNull() {
            addCriterion("mail_title is not null");
            return (Criteria) this;
        }

        public Criteria andMailTitleEqualTo(String value) {
            addCriterion("mail_title =", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotEqualTo(String value) {
            addCriterion("mail_title <>", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleGreaterThan(String value) {
            addCriterion("mail_title >", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mail_title >=", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLessThan(String value) {
            addCriterion("mail_title <", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLessThanOrEqualTo(String value) {
            addCriterion("mail_title <=", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLike(String value) {
            addCriterion("mail_title like", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotLike(String value) {
            addCriterion("mail_title not like", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleIn(List<String> values) {
            addCriterion("mail_title in", values, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotIn(List<String> values) {
            addCriterion("mail_title not in", values, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleBetween(String value1, String value2) {
            addCriterion("mail_title between", value1, value2, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotBetween(String value1, String value2) {
            addCriterion("mail_title not between", value1, value2, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailInfoIsNull() {
            addCriterion("mail_info is null");
            return (Criteria) this;
        }

        public Criteria andMailInfoIsNotNull() {
            addCriterion("mail_info is not null");
            return (Criteria) this;
        }

        public Criteria andMailInfoEqualTo(String value) {
            addCriterion("mail_info =", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoNotEqualTo(String value) {
            addCriterion("mail_info <>", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoGreaterThan(String value) {
            addCriterion("mail_info >", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mail_info >=", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoLessThan(String value) {
            addCriterion("mail_info <", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoLessThanOrEqualTo(String value) {
            addCriterion("mail_info <=", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoLike(String value) {
            addCriterion("mail_info like", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoNotLike(String value) {
            addCriterion("mail_info not like", value, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoIn(List<String> values) {
            addCriterion("mail_info in", values, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoNotIn(List<String> values) {
            addCriterion("mail_info not in", values, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoBetween(String value1, String value2) {
            addCriterion("mail_info between", value1, value2, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMailInfoNotBetween(String value1, String value2) {
            addCriterion("mail_info not between", value1, value2, "mailInfo");
            return (Criteria) this;
        }

        public Criteria andMainFileIsNull() {
            addCriterion("main_file is null");
            return (Criteria) this;
        }

        public Criteria andMainFileIsNotNull() {
            addCriterion("main_file is not null");
            return (Criteria) this;
        }

        public Criteria andMainFileEqualTo(String value) {
            addCriterion("main_file =", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileNotEqualTo(String value) {
            addCriterion("main_file <>", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileGreaterThan(String value) {
            addCriterion("main_file >", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileGreaterThanOrEqualTo(String value) {
            addCriterion("main_file >=", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileLessThan(String value) {
            addCriterion("main_file <", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileLessThanOrEqualTo(String value) {
            addCriterion("main_file <=", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileLike(String value) {
            addCriterion("main_file like", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileNotLike(String value) {
            addCriterion("main_file not like", value, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileIn(List<String> values) {
            addCriterion("main_file in", values, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileNotIn(List<String> values) {
            addCriterion("main_file not in", values, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileBetween(String value1, String value2) {
            addCriterion("main_file between", value1, value2, "mainFile");
            return (Criteria) this;
        }

        public Criteria andMainFileNotBetween(String value1, String value2) {
            addCriterion("main_file not between", value1, value2, "mainFile");
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