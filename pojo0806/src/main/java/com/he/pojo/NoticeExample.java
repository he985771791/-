package com.he.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoIsNull() {
            addCriterion("notice_info is null");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoIsNotNull() {
            addCriterion("notice_info is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoEqualTo(String value) {
            addCriterion("notice_info =", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoNotEqualTo(String value) {
            addCriterion("notice_info <>", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoGreaterThan(String value) {
            addCriterion("notice_info >", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("notice_info >=", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoLessThan(String value) {
            addCriterion("notice_info <", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoLessThanOrEqualTo(String value) {
            addCriterion("notice_info <=", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoLike(String value) {
            addCriterion("notice_info like", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoNotLike(String value) {
            addCriterion("notice_info not like", value, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoIn(List<String> values) {
            addCriterion("notice_info in", values, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoNotIn(List<String> values) {
            addCriterion("notice_info not in", values, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoBetween(String value1, String value2) {
            addCriterion("notice_info between", value1, value2, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeInfoNotBetween(String value1, String value2) {
            addCriterion("notice_info not between", value1, value2, "noticeInfo");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNull() {
            addCriterion("notice_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNotNull() {
            addCriterion("notice_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateEqualTo(Date value) {
            addCriterion("notice_date =", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotEqualTo(Date value) {
            addCriterion("notice_date <>", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThan(Date value) {
            addCriterion("notice_date >", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_date >=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThan(Date value) {
            addCriterion("notice_date <", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("notice_date <=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIn(List<Date> values) {
            addCriterion("notice_date in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotIn(List<Date> values) {
            addCriterion("notice_date not in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateBetween(Date value1, Date value2) {
            addCriterion("notice_date between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("notice_date not between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticePersonIsNull() {
            addCriterion("notice_person is null");
            return (Criteria) this;
        }

        public Criteria andNoticePersonIsNotNull() {
            addCriterion("notice_person is not null");
            return (Criteria) this;
        }

        public Criteria andNoticePersonEqualTo(String value) {
            addCriterion("notice_person =", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonNotEqualTo(String value) {
            addCriterion("notice_person <>", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonGreaterThan(String value) {
            addCriterion("notice_person >", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonGreaterThanOrEqualTo(String value) {
            addCriterion("notice_person >=", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonLessThan(String value) {
            addCriterion("notice_person <", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonLessThanOrEqualTo(String value) {
            addCriterion("notice_person <=", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonLike(String value) {
            addCriterion("notice_person like", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonNotLike(String value) {
            addCriterion("notice_person not like", value, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonIn(List<String> values) {
            addCriterion("notice_person in", values, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonNotIn(List<String> values) {
            addCriterion("notice_person not in", values, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonBetween(String value1, String value2) {
            addCriterion("notice_person between", value1, value2, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andNoticePersonNotBetween(String value1, String value2) {
            addCriterion("notice_person not between", value1, value2, "noticePerson");
            return (Criteria) this;
        }

        public Criteria andReadNumIsNull() {
            addCriterion("read_num is null");
            return (Criteria) this;
        }

        public Criteria andReadNumIsNotNull() {
            addCriterion("read_num is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumEqualTo(Integer value) {
            addCriterion("read_num =", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotEqualTo(Integer value) {
            addCriterion("read_num <>", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumGreaterThan(Integer value) {
            addCriterion("read_num >", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num >=", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumLessThan(Integer value) {
            addCriterion("read_num <", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumLessThanOrEqualTo(Integer value) {
            addCriterion("read_num <=", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumIn(List<Integer> values) {
            addCriterion("read_num in", values, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotIn(List<Integer> values) {
            addCriterion("read_num not in", values, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumBetween(Integer value1, Integer value2) {
            addCriterion("read_num between", value1, value2, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num not between", value1, value2, "readNum");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNull() {
            addCriterion("notice_file is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNotNull() {
            addCriterion("notice_file is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileEqualTo(String value) {
            addCriterion("notice_file =", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotEqualTo(String value) {
            addCriterion("notice_file <>", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThan(String value) {
            addCriterion("notice_file >", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThanOrEqualTo(String value) {
            addCriterion("notice_file >=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThan(String value) {
            addCriterion("notice_file <", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThanOrEqualTo(String value) {
            addCriterion("notice_file <=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLike(String value) {
            addCriterion("notice_file like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotLike(String value) {
            addCriterion("notice_file not like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIn(List<String> values) {
            addCriterion("notice_file in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotIn(List<String> values) {
            addCriterion("notice_file not in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileBetween(String value1, String value2) {
            addCriterion("notice_file between", value1, value2, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotBetween(String value1, String value2) {
            addCriterion("notice_file not between", value1, value2, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andIsPublishIsNull() {
            addCriterion("is_publish is null");
            return (Criteria) this;
        }

        public Criteria andIsPublishIsNotNull() {
            addCriterion("is_publish is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublishEqualTo(Byte value) {
            addCriterion("is_publish =", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotEqualTo(Byte value) {
            addCriterion("is_publish <>", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishGreaterThan(Byte value) {
            addCriterion("is_publish >", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_publish >=", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishLessThan(Byte value) {
            addCriterion("is_publish <", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishLessThanOrEqualTo(Byte value) {
            addCriterion("is_publish <=", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishIn(List<Byte> values) {
            addCriterion("is_publish in", values, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotIn(List<Byte> values) {
            addCriterion("is_publish not in", values, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishBetween(Byte value1, Byte value2) {
            addCriterion("is_publish between", value1, value2, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotBetween(Byte value1, Byte value2) {
            addCriterion("is_publish not between", value1, value2, "isPublish");
            return (Criteria) this;
        }

        public Criteria andNoticeSortIsNull() {
            addCriterion("notice_sort is null");
            return (Criteria) this;
        }

        public Criteria andNoticeSortIsNotNull() {
            addCriterion("notice_sort is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeSortEqualTo(Integer value) {
            addCriterion("notice_sort =", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortNotEqualTo(Integer value) {
            addCriterion("notice_sort <>", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortGreaterThan(Integer value) {
            addCriterion("notice_sort >", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_sort >=", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortLessThan(Integer value) {
            addCriterion("notice_sort <", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortLessThanOrEqualTo(Integer value) {
            addCriterion("notice_sort <=", value, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortIn(List<Integer> values) {
            addCriterion("notice_sort in", values, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortNotIn(List<Integer> values) {
            addCriterion("notice_sort not in", values, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortBetween(Integer value1, Integer value2) {
            addCriterion("notice_sort between", value1, value2, "noticeSort");
            return (Criteria) this;
        }

        public Criteria andNoticeSortNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_sort not between", value1, value2, "noticeSort");
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