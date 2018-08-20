package com.he.pojo;
/**
 * 
 * @类名：Department
 * @描述：部门
 * @日期：2018年8月18日 下午5:07:40
 */
public class Department extends Page{
    private Integer id;

    private String deptName;

    private Integer parentId;

    private Byte isStop;

    private String deptProfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getIsStop() {
        return isStop;
    }

    public void setIsStop(Byte isStop) {
        this.isStop = isStop;
    }

    public String getDeptProfile() {
        return deptProfile;
    }

    public void setDeptProfile(String deptProfile) {
        this.deptProfile = deptProfile == null ? null : deptProfile.trim();
    }
}