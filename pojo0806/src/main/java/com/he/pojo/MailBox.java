package com.he.pojo;
/**
 * 
 * @类名：MailBox
 * @描述：邮箱
 * @日期：2018年8月18日 下午7:03:25
 */
public class MailBox extends Page {
    private Integer id;

    private Integer userId;

    private Integer mailId;

    private Byte drafts;

    private Byte sentMail;

    private Byte inbox;

    private Byte trash;

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

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public Byte getDrafts() {
        return drafts;
    }

    public void setDrafts(Byte drafts) {
        this.drafts = drafts;
    }

    public Byte getSentMail() {
        return sentMail;
    }

    public void setSentMail(Byte sentMail) {
        this.sentMail = sentMail;
    }

    public Byte getInbox() {
        return inbox;
    }

    public void setInbox(Byte inbox) {
        this.inbox = inbox;
    }

    public Byte getTrash() {
        return trash;
    }

    public void setTrash(Byte trash) {
        this.trash = trash;
    }
}