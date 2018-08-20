package com.he.service.permissionDetail;

import java.util.List;
import com.he.pojo.PermissionDetail;
import com.he.pojo.PermissionDetailExample;
/**
 * 
 * @类名：PermissionDetailServiceI
 * @描述：权限详情Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface PermissionDetailServiceI {
	//查询权限详情操作，permissionDetailExample中包含sql语句的条件，permissionDetail中包含是否分页以及起始页与每页数据个数
	public List<PermissionDetail> getPermissionDetails(PermissionDetailExample permissionDetailExample , PermissionDetail permissionDetail);
	//通过id查询权限详情
	public PermissionDetail getPermissionDetailById(int id);
	//插入一条权限详情记录
	public int insert(PermissionDetail permissionDetail);
	//更新一条权限详情记录
	public int update(PermissionDetail permissionDetail);
	//删除一条权限详情记录
	public int delete(int id);
}
