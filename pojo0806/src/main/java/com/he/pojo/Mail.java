package com.he.pojo;
/**
 * 
 * @类名：Mail
 * @描述：邮件
 * @日期：2018年8月18日 下午7:03:05
 */
public class Mail extends Page{
    private Integer id;

    private String mainReceive;

    private String mailTitle;

    private String mailInfo;

    private String mainFile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainReceive() {
        return mainReceive;
    }

    public void setMainReceive(String mainReceive) {
        this.mainReceive = mainReceive == null ? null : mainReceive.trim();
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle == null ? null : mailTitle.trim();
    }

    public String getMailInfo() {
        return mailInfo;
    }

    public void setMailInfo(String mailInfo) {
        this.mailInfo = mailInfo == null ? null : mailInfo.trim();
    }

    public String getMainFile() {
        return mainFile;
    }

    public void setMainFile(String mainFile) {
        this.mainFile = mainFile == null ? null : mainFile.trim();
    }
}