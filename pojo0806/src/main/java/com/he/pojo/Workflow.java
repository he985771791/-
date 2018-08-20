package com.he.pojo;
/**
 * 
 * @类名：Workflow
 * @描述：流程
 * @日期：2018年8月18日 下午7:08:36
 */
public class Workflow extends Page {
    private Integer id;

    private String workflowName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName == null ? null : workflowName.trim();
    }
}