package com.he.pojo;
/**
 * 
 * @类名：Step
 * @描述：流程步骤
 * @日期：2018年8月18日 下午7:07:32
 */
public class Step extends Page {
    private Integer id;

    private String stepName;

    private String stepInfo;

    private Integer workflowId;

    private Integer stepNum;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    public String getStepInfo() {
        return stepInfo;
    }

    public void setStepInfo(String stepInfo) {
        this.stepInfo = stepInfo == null ? null : stepInfo.trim();
    }

    public Integer getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public Integer getStepNum() {
        return stepNum;
    }

    public void setStepNum(Integer stepNum) {
        this.stepNum = stepNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}