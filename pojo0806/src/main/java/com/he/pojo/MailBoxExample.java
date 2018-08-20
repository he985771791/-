package com.he.pojo;

import java.util.ArrayList;
import java.util.List;

public class MailBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailBoxExample() {
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

        public Criteria andMailIdIsNull() {
            addCriterion("mail_id is null");
            return (Criteria) this;
        }

        public Criteria andMailIdIsNotNull() {
            addCriterion("mail_id is not null");
            return (Criteria) this;
        }

        public Criteria andMailIdEqualTo(Integer value) {
            addCriterion("mail_id =", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotEqualTo(Integer value) {
            addCriterion("mail_id <>", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThan(Integer value) {
            addCriterion("mail_id >", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_id >=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThan(Integer value) {
            addCriterion("mail_id <", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThanOrEqualTo(Integer value) {
            addCriterion("mail_id <=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdIn(List<Integer> values) {
            addCriterion("mail_id in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotIn(List<Integer> values) {
            addCriterion("mail_id not in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdBetween(Integer value1, Integer value2) {
            addCriterion("mail_id between", value1, value2, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_id not between", value1, value2, "mailId");
            return (Criteria) this;
        }

        public Criteria andDraftsIsNull() {
            addCriterion("drafts is null");
            return (Criteria) this;
        }

        public Criteria andDraftsIsNotNull() {
            addCriterion("drafts is not null");
            return (Criteria) this;
        }

        public Criteria andDraftsEqualTo(Byte value) {
            addCriterion("drafts =", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotEqualTo(Byte value) {
            addCriterion("drafts <>", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsGreaterThan(Byte value) {
            addCriterion("drafts >", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsGreaterThanOrEqualTo(Byte value) {
            addCriterion("drafts >=", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsLessThan(Byte value) {
            addCriterion("drafts <", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsLessThanOrEqualTo(Byte value) {
            addCriterion("drafts <=", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsIn(List<Byte> values) {
            addCriterion("drafts in", values, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotIn(List<Byte> values) {
            addCriterion("drafts not in", values, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsBetween(Byte value1, Byte value2) {
            addCriterion("drafts between", value1, value2, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotBetween(Byte value1, Byte value2) {
            addCriterion("drafts not between", value1, value2, "drafts");
            return (Criteria) this;
        }

        public Criteria andSentMailIsNull() {
            addCriterion("sent_mail is null");
            return (Criteria) this;
        }

        public Criteria andSentMailIsNotNull() {
            addCriterion("sent_mail is not null");
            return (Criteria) this;
        }

        public Criteria andSentMailEqualTo(Byte value) {
            addCriterion("sent_mail =", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailNotEqualTo(Byte value) {
            addCriterion("sent_mail <>", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailGreaterThan(Byte value) {
            addCriterion("sent_mail >", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailGreaterThanOrEqualTo(Byte value) {
            addCriterion("sent_mail >=", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailLessThan(Byte value) {
            addCriterion("sent_mail <", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailLessThanOrEqualTo(Byte value) {
            addCriterion("sent_mail <=", value, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailIn(List<Byte> values) {
            addCriterion("sent_mail in", values, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailNotIn(List<Byte> values) {
            addCriterion("sent_mail not in", values, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailBetween(Byte value1, Byte value2) {
            addCriterion("sent_mail between", value1, value2, "sentMail");
            return (Criteria) this;
        }

        public Criteria andSentMailNotBetween(Byte value1, Byte value2) {
            addCriterion("sent_mail not between", value1, value2, "sentMail");
            return (Criteria) this;
        }

        public Criteria andInboxIsNull() {
            addCriterion("inbox is null");
            return (Criteria) this;
        }

        public Criteria andInboxIsNotNull() {
            addCriterion("inbox is not null");
            return (Criteria) this;
        }

        public Criteria andInboxEqualTo(Byte value) {
            addCriterion("inbox =", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxNotEqualTo(Byte value) {
            addCriterion("inbox <>", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxGreaterThan(Byte value) {
            addCriterion("inbox >", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxGreaterThanOrEqualTo(Byte value) {
            addCriterion("inbox >=", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxLessThan(Byte value) {
            addCriterion("inbox <", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxLessThanOrEqualTo(Byte value) {
            addCriterion("inbox <=", value, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxIn(List<Byte> values) {
            addCriterion("inbox in", values, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxNotIn(List<Byte> values) {
            addCriterion("inbox not in", values, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxBetween(Byte value1, Byte value2) {
            addCriterion("inbox between", value1, value2, "inbox");
            return (Criteria) this;
        }

        public Criteria andInboxNotBetween(Byte value1, Byte value2) {
            addCriterion("inbox not between", value1, value2, "inbox");
            return (Criteria) this;
        }

        public Criteria andTrashIsNull() {
            addCriterion("trash is null");
            return (Criteria) this;
        }

        public Criteria andTrashIsNotNull() {
            addCriterion("trash is not null");
            return (Criteria) this;
        }

        public Criteria andTrashEqualTo(Byte value) {
            addCriterion("trash =", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotEqualTo(Byte value) {
            addCriterion("trash <>", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThan(Byte value) {
            addCriterion("trash >", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThanOrEqualTo(Byte value) {
            addCriterion("trash >=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThan(Byte value) {
            addCriterion("trash <", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThanOrEqualTo(Byte value) {
            addCriterion("trash <=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashIn(List<Byte> values) {
            addCriterion("trash in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotIn(List<Byte> values) {
            addCriterion("trash not in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashBetween(Byte value1, Byte value2) {
            addCriterion("trash between", value1, value2, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotBetween(Byte value1, Byte value2) {
            addCriterion("trash not between", value1, value2, "trash");
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