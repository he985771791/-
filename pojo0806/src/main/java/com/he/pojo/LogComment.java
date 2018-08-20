package com.he.pojo;

import java.util.Date;
/**
 * 
 * @类名：LogComment
 * @描述：日志评论
 * @日期：2018年8月18日 下午7:02:39
 */
public class LogComment  extends Page{
    private Integer id;

    private Integer logId;

    private Integer userId;

    private String commentInfo;

    private Date commentDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo == null ? null : commentInfo.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}