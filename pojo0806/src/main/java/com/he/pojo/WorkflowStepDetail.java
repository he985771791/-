package com.he.pojo;

import java.util.Date;
/**
 * 
 * @类名：WorkflowStepDetail
 * @描述：流程—步骤详情
 * @日期：2018年8月18日 下午7:08:45
 */
public class WorkflowStepDetail extends Page {
    private Integer id;

    private Integer userId;

    private Integer workflowId;

    private Integer stepId;

    private Byte isVerify;

    private String detailTitle;

    private String detailInfo;

    private String detailFile;

    private String detailRemark;

    private Date detailDate;

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

    public Integer getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public Byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Byte isVerify) {
        this.isVerify = isVerify;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo == null ? null : detailInfo.trim();
    }

    public String getDetailFile() {
        return detailFile;
    }

    public void setDetailFile(String detailFile) {
        this.detailFile = detailFile == null ? null : detailFile.trim();
    }

    public String getDetailRemark() {
        return detailRemark;
    }

    public void setDetailRemark(String detailRemark) {
        this.detailRemark = detailRemark == null ? null : detailRemark.trim();
    }

    public Date getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(Date detailDate) {
        this.detailDate = detailDate;
    }
}