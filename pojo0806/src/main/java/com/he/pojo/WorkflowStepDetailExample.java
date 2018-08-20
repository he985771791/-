package com.he.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkflowStepDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkflowStepDetailExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIsNull() {
            addCriterion("workflow_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIsNotNull() {
            addCriterion("workflow_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdEqualTo(Integer value) {
            addCriterion("workflow_id =", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotEqualTo(Integer value) {
            addCriterion("workflow_id <>", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThan(Integer value) {
            addCriterion("workflow_id >", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workflow_id >=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThan(Integer value) {
            addCriterion("workflow_id <", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThanOrEqualTo(Integer value) {
            addCriterion("workflow_id <=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIn(List<Integer> values) {
            addCriterion("workflow_id in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotIn(List<Integer> values) {
            addCriterion("workflow_id not in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdBetween(Integer value1, Integer value2) {
            addCriterion("workflow_id between", value1, value2, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workflow_id not between", value1, value2, "workflowId");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Integer value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Integer value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Integer value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Integer value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Integer value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Integer> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Integer> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Integer value1, Integer value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNull() {
            addCriterion("is_verify is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNotNull() {
            addCriterion("is_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyEqualTo(Byte value) {
            addCriterion("is_verify =", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotEqualTo(Byte value) {
            addCriterion("is_verify <>", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThan(Byte value) {
            addCriterion("is_verify >", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_verify >=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThan(Byte value) {
            addCriterion("is_verify <", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("is_verify <=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIn(List<Byte> values) {
            addCriterion("is_verify in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotIn(List<Byte> values) {
            addCriterion("is_verify not in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyBetween(Byte value1, Byte value2) {
            addCriterion("is_verify between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_verify not between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNull() {
            addCriterion("detail_title is null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNotNull() {
            addCriterion("detail_title is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleEqualTo(String value) {
            addCriterion("detail_title =", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotEqualTo(String value) {
            addCriterion("detail_title <>", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThan(String value) {
            addCriterion("detail_title >", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("detail_title >=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThan(String value) {
            addCriterion("detail_title <", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThanOrEqualTo(String value) {
            addCriterion("detail_title <=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLike(String value) {
            addCriterion("detail_title like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotLike(String value) {
            addCriterion("detail_title not like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIn(List<String> values) {
            addCriterion("detail_title in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotIn(List<String> values) {
            addCriterion("detail_title not in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleBetween(String value1, String value2) {
            addCriterion("detail_title between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotBetween(String value1, String value2) {
            addCriterion("detail_title not between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIsNull() {
            addCriterion("detail_info is null");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIsNotNull() {
            addCriterion("detail_info is not null");
            return (Criteria) this;
        }

        public Criteria andDetailInfoEqualTo(String value) {
            addCriterion("detail_info =", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotEqualTo(String value) {
            addCriterion("detail_info <>", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoGreaterThan(String value) {
            addCriterion("detail_info >", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("detail_info >=", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLessThan(String value) {
            addCriterion("detail_info <", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("detail_info <=", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLike(String value) {
            addCriterion("detail_info like", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotLike(String value) {
            addCriterion("detail_info not like", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIn(List<String> values) {
            addCriterion("detail_info in", values, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotIn(List<String> values) {
            addCriterion("detail_info not in", values, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoBetween(String value1, String value2) {
            addCriterion("detail_info between", value1, value2, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotBetween(String value1, String value2) {
            addCriterion("detail_info not between", value1, value2, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailFileIsNull() {
            addCriterion("detail_file is null");
            return (Criteria) this;
        }

        public Criteria andDetailFileIsNotNull() {
            addCriterion("detail_file is not null");
            return (Criteria) this;
        }

        public Criteria andDetailFileEqualTo(String value) {
            addCriterion("detail_file =", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileNotEqualTo(String value) {
            addCriterion("detail_file <>", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileGreaterThan(String value) {
            addCriterion("detail_file >", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileGreaterThanOrEqualTo(String value) {
            addCriterion("detail_file >=", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileLessThan(String value) {
            addCriterion("detail_file <", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileLessThanOrEqualTo(String value) {
            addCriterion("detail_file <=", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileLike(String value) {
            addCriterion("detail_file like", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileNotLike(String value) {
            addCriterion("detail_file not like", value, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileIn(List<String> values) {
            addCriterion("detail_file in", values, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileNotIn(List<String> values) {
            addCriterion("detail_file not in", values, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileBetween(String value1, String value2) {
            addCriterion("detail_file between", value1, value2, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailFileNotBetween(String value1, String value2) {
            addCriterion("detail_file not between", value1, value2, "detailFile");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNull() {
            addCriterion("detail_remark is null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNotNull() {
            addCriterion("detail_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkEqualTo(String value) {
            addCriterion("detail_remark =", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotEqualTo(String value) {
            addCriterion("detail_remark <>", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThan(String value) {
            addCriterion("detail_remark >", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("detail_remark >=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThan(String value) {
            addCriterion("detail_remark <", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThanOrEqualTo(String value) {
            addCriterion("detail_remark <=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLike(String value) {
            addCriterion("detail_remark like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotLike(String value) {
            addCriterion("detail_remark not like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIn(List<String> values) {
            addCriterion("detail_remark in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotIn(List<String> values) {
            addCriterion("detail_remark not in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkBetween(String value1, String value2) {
            addCriterion("detail_remark between", value1, value2, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotBetween(String value1, String value2) {
            addCriterion("detail_remark not between", value1, value2, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailDateIsNull() {
            addCriterion("detail_date is null");
            return (Criteria) this;
        }

        public Criteria andDetailDateIsNotNull() {
            addCriterion("detail_date is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDateEqualTo(Date value) {
            addCriterion("detail_date =", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotEqualTo(Date value) {
            addCriterion("detail_date <>", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateGreaterThan(Date value) {
            addCriterion("detail_date >", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateGreaterThanOrEqualTo(Date value) {
            addCriterion("detail_date >=", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateLessThan(Date value) {
            addCriterion("detail_date <", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateLessThanOrEqualTo(Date value) {
            addCriterion("detail_date <=", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateIn(List<Date> values) {
            addCriterion("detail_date in", values, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotIn(List<Date> values) {
            addCriterion("detail_date not in", values, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateBetween(Date value1, Date value2) {
            addCriterion("detail_date between", value1, value2, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotBetween(Date value1, Date value2) {
            addCriterion("detail_date not between", value1, value2, "detailDate");
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