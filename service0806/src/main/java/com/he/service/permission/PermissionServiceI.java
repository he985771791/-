package com.he.service.permission;

import java.util.List;
import com.he.pojo.Permission;
import com.he.pojo.PermissionExample;
/**
 * 
 * @类名：PermissionServiceI
 * @描述：权限Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface PermissionServiceI {
	//查询权限操作，permissionExample中包含sql语句的条件，permission中包含是否分页以及起始页与每页数据个数
	public List<Permission> getPermissions(PermissionExample permissionExample , Permission permission);
	//通过id查询权限
	public Permission getPermissionById(int id);
	//插入一条权限记录
	public int insert(Permission permission);
	//更新一条权限记录
	public int update(Permission permission);
	//删除一条权限记录
	public int delete(int id);
}
