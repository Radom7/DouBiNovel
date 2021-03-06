package com.cn.lucky.morning.model.domain;

import java.util.ArrayList;
import java.util.List;

public class BookInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public BookInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
    public void setPage(int page, int size) {
        this.limitStart = page * size;this.limitEnd = size;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookUrlIsNull() {
            addCriterion("book_url is null");
            return (Criteria) this;
        }

        public Criteria andBookUrlIsNotNull() {
            addCriterion("book_url is not null");
            return (Criteria) this;
        }

        public Criteria andBookUrlEqualTo(String value) {
            addCriterion("book_url =", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlNotEqualTo(String value) {
            addCriterion("book_url <>", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlGreaterThan(String value) {
            addCriterion("book_url >", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("book_url >=", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlLessThan(String value) {
            addCriterion("book_url <", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlLessThanOrEqualTo(String value) {
            addCriterion("book_url <=", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlLike(String value) {
            addCriterion("book_url like", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlNotLike(String value) {
            addCriterion("book_url not like", value, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlIn(List<String> values) {
            addCriterion("book_url in", values, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlNotIn(List<String> values) {
            addCriterion("book_url not in", values, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlBetween(String value1, String value2) {
            addCriterion("book_url between", value1, value2, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookUrlNotBetween(String value1, String value2) {
            addCriterion("book_url not between", value1, value2, "bookUrl");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkIsNull() {
            addCriterion("book_source_link is null");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkIsNotNull() {
            addCriterion("book_source_link is not null");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkEqualTo(String value) {
            addCriterion("book_source_link =", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkNotEqualTo(String value) {
            addCriterion("book_source_link <>", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkGreaterThan(String value) {
            addCriterion("book_source_link >", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkGreaterThanOrEqualTo(String value) {
            addCriterion("book_source_link >=", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkLessThan(String value) {
            addCriterion("book_source_link <", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkLessThanOrEqualTo(String value) {
            addCriterion("book_source_link <=", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkLike(String value) {
            addCriterion("book_source_link like", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkNotLike(String value) {
            addCriterion("book_source_link not like", value, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkIn(List<String> values) {
            addCriterion("book_source_link in", values, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkNotIn(List<String> values) {
            addCriterion("book_source_link not in", values, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkBetween(String value1, String value2) {
            addCriterion("book_source_link between", value1, value2, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceLinkNotBetween(String value1, String value2) {
            addCriterion("book_source_link not between", value1, value2, "bookSourceLink");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameIsNull() {
            addCriterion("book_source_name is null");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameIsNotNull() {
            addCriterion("book_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameEqualTo(String value) {
            addCriterion("book_source_name =", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameNotEqualTo(String value) {
            addCriterion("book_source_name <>", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameGreaterThan(String value) {
            addCriterion("book_source_name >", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_source_name >=", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameLessThan(String value) {
            addCriterion("book_source_name <", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameLessThanOrEqualTo(String value) {
            addCriterion("book_source_name <=", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameLike(String value) {
            addCriterion("book_source_name like", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameNotLike(String value) {
            addCriterion("book_source_name not like", value, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameIn(List<String> values) {
            addCriterion("book_source_name in", values, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameNotIn(List<String> values) {
            addCriterion("book_source_name not in", values, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameBetween(String value1, String value2) {
            addCriterion("book_source_name between", value1, value2, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookSourceNameNotBetween(String value1, String value2) {
            addCriterion("book_source_name not between", value1, value2, "bookSourceName");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNull() {
            addCriterion("book_img is null");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNotNull() {
            addCriterion("book_img is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgEqualTo(String value) {
            addCriterion("book_img =", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotEqualTo(String value) {
            addCriterion("book_img <>", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThan(String value) {
            addCriterion("book_img >", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThanOrEqualTo(String value) {
            addCriterion("book_img >=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThan(String value) {
            addCriterion("book_img <", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThanOrEqualTo(String value) {
            addCriterion("book_img <=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLike(String value) {
            addCriterion("book_img like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotLike(String value) {
            addCriterion("book_img not like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgIn(List<String> values) {
            addCriterion("book_img in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotIn(List<String> values) {
            addCriterion("book_img not in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgBetween(String value1, String value2) {
            addCriterion("book_img between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotBetween(String value1, String value2) {
            addCriterion("book_img not between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorIsNull() {
            addCriterion("book_img_error is null");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorIsNotNull() {
            addCriterion("book_img_error is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorEqualTo(String value) {
            addCriterion("book_img_error =", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorNotEqualTo(String value) {
            addCriterion("book_img_error <>", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorGreaterThan(String value) {
            addCriterion("book_img_error >", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorGreaterThanOrEqualTo(String value) {
            addCriterion("book_img_error >=", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorLessThan(String value) {
            addCriterion("book_img_error <", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorLessThanOrEqualTo(String value) {
            addCriterion("book_img_error <=", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorLike(String value) {
            addCriterion("book_img_error like", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorNotLike(String value) {
            addCriterion("book_img_error not like", value, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorIn(List<String> values) {
            addCriterion("book_img_error in", values, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorNotIn(List<String> values) {
            addCriterion("book_img_error not in", values, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorBetween(String value1, String value2) {
            addCriterion("book_img_error between", value1, value2, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andBookImgErrorNotBetween(String value1, String value2) {
            addCriterion("book_img_error not between", value1, value2, "bookImgError");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andNovelDesIsNull() {
            addCriterion("novel_des is null");
            return (Criteria) this;
        }

        public Criteria andNovelDesIsNotNull() {
            addCriterion("novel_des is not null");
            return (Criteria) this;
        }

        public Criteria andNovelDesEqualTo(String value) {
            addCriterion("novel_des =", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesNotEqualTo(String value) {
            addCriterion("novel_des <>", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesGreaterThan(String value) {
            addCriterion("novel_des >", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesGreaterThanOrEqualTo(String value) {
            addCriterion("novel_des >=", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesLessThan(String value) {
            addCriterion("novel_des <", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesLessThanOrEqualTo(String value) {
            addCriterion("novel_des <=", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesLike(String value) {
            addCriterion("novel_des like", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesNotLike(String value) {
            addCriterion("novel_des not like", value, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesIn(List<String> values) {
            addCriterion("novel_des in", values, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesNotIn(List<String> values) {
            addCriterion("novel_des not in", values, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesBetween(String value1, String value2) {
            addCriterion("novel_des between", value1, value2, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelDesNotBetween(String value1, String value2) {
            addCriterion("novel_des not between", value1, value2, "novelDes");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNull() {
            addCriterion("novel_type is null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNotNull() {
            addCriterion("novel_type is not null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeEqualTo(String value) {
            addCriterion("novel_type =", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotEqualTo(String value) {
            addCriterion("novel_type <>", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThan(String value) {
            addCriterion("novel_type >", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("novel_type >=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThan(String value) {
            addCriterion("novel_type <", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThanOrEqualTo(String value) {
            addCriterion("novel_type <=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLike(String value) {
            addCriterion("novel_type like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotLike(String value) {
            addCriterion("novel_type not like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIn(List<String> values) {
            addCriterion("novel_type in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotIn(List<String> values) {
            addCriterion("novel_type not in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeBetween(String value1, String value2) {
            addCriterion("novel_type between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotBetween(String value1, String value2) {
            addCriterion("novel_type not between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(String value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(String value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(String value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(String value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(String value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLike(String value) {
            addCriterion("last_update like", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotLike(String value) {
            addCriterion("last_update not like", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<String> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<String> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(String value1, String value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(String value1, String value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastNewIsNull() {
            addCriterion("last_new is null");
            return (Criteria) this;
        }

        public Criteria andLastNewIsNotNull() {
            addCriterion("last_new is not null");
            return (Criteria) this;
        }

        public Criteria andLastNewEqualTo(String value) {
            addCriterion("last_new =", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewNotEqualTo(String value) {
            addCriterion("last_new <>", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewGreaterThan(String value) {
            addCriterion("last_new >", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewGreaterThanOrEqualTo(String value) {
            addCriterion("last_new >=", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewLessThan(String value) {
            addCriterion("last_new <", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewLessThanOrEqualTo(String value) {
            addCriterion("last_new <=", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewLike(String value) {
            addCriterion("last_new like", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewNotLike(String value) {
            addCriterion("last_new not like", value, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewIn(List<String> values) {
            addCriterion("last_new in", values, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewNotIn(List<String> values) {
            addCriterion("last_new not in", values, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewBetween(String value1, String value2) {
            addCriterion("last_new between", value1, value2, "lastNew");
            return (Criteria) this;
        }

        public Criteria andLastNewNotBetween(String value1, String value2) {
            addCriterion("last_new not between", value1, value2, "lastNew");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_book_info
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_book_info
     *
     * @mbg.generated
     */
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