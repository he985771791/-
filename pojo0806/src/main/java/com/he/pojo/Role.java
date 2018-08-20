package com.he.pojo;
/**
 * 
 * @类名：Role
 * @描述：职位角色
 * @日期：2018年8月18日 下午7:07:12
 */
public class Role extends Page {
    private Integer id;

    private Integer deptId;

    private String roleName;

    private Byte isStop;

    private String roleProfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Byte getIsStop() {
        return isStop;
    }

    public void setIsStop(Byte isStop) {
        this.isStop = isStop;
    }

    public String getRoleProfile() {
        return roleProfile;
    }

    public void setRoleProfile(String roleProfile) {
        this.roleProfile = roleProfile == null ? null : roleProfile.trim();
    }
}