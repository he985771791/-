package com.he.pojo;

import java.util.Date;
/**
 * 
 * @类名：UserLog
 * @描述：用户日志
 * @日期：2018年8月18日 下午7:08:22
 */
public class UserLog extends Page {
    private Integer id;

    private Integer userId;

    private Byte isPerson;

    private String logTitle;

    private String logInfo;

    private Date logDate;

    private Integer commentNum;

    private String logFile;

    private Byte isVisual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsPerson() {
        return isPerson;
    }

    public void setIsPerson(Byte isPerson) {
        this.isPerson = isPerson;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle == null ? null : logTitle.trim();
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile == null ? null : logFile.trim();
    }

    public Byte getIsVisual() {
        return isVisual;
    }

    public void setIsVisual(Byte isVisual) {
        this.isVisual = isVisual;
    }
}