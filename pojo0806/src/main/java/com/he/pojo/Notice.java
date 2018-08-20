package com.he.pojo;

import java.util.Date;
/**
 * 
 * @类名：Notice
 * @描述：通知公告
 * @日期：2018年8月18日 下午7:03:39
 */
public class Notice extends Page {
    private Integer id;

    private Integer categoryId;

    private Integer userId;

    private String noticeTitle;

    private String noticeInfo;

    private Date noticeDate;

    private String noticePerson;

    private Integer readNum;

    private String noticeFile;

    private Byte isPublish;

    private Integer noticeSort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeInfo() {
        return noticeInfo;
    }

    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo == null ? null : noticeInfo.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticePerson() {
        return noticePerson;
    }

    public void setNoticePerson(String noticePerson) {
        this.noticePerson = noticePerson == null ? null : noticePerson.trim();
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public String getNoticeFile() {
        return noticeFile;
    }

    public void setNoticeFile(String noticeFile) {
        this.noticeFile = noticeFile == null ? null : noticeFile.trim();
    }

    public Byte getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Byte isPublish) {
        this.isPublish = isPublish;
    }

    public Integer getNoticeSort() {
        return noticeSort;
    }

    public void setNoticeSort(Integer noticeSort) {
        this.noticeSort = noticeSort;
    }
}