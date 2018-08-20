package com.he.pojo;
/**
 * 
 * @类名：PermissionDetail
 * @描述：权限详情表
 * @日期：2018年8月18日 下午7:06:08
 */
public class PermissionDetail extends Page {
    private Integer id;

    private Integer permissionId;

    private Integer roleId;

    private Byte isPermission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Byte getIsPermission() {
        return isPermission;
    }

    public void setIsPermission(Byte isPermission) {
        this.isPermission = isPermission;
    }
}