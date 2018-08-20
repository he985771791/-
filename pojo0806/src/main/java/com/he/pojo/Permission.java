package com.he.pojo;
/**
 * 
 * @类名：Permission
 * @描述：权限
 * @日期：2018年8月18日 下午7:05:42
 */
public class Permission extends Page {
    private Integer id;

    private String permissionName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }
}