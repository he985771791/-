package com.he.service.role;

import java.util.List;
import com.he.pojo.Role;
import com.he.pojo.RoleExample;
/**
 * 
 * @类名：RoleServiceI
 * @描述：角色职位Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface RoleServiceI {
	//查询角色职位操作，roleExample中包含sql语句的条件，role中包含是否分页以及起始页与每页数据个数
	public List<Role> getRoles(RoleExample roleExample , Role role);
	//通过id查询角色职位
	public Role getRoleById(int id);
	//插入一条角色职位记录
	public int insert(Role role);
	//更新一条角色职位记录
	public int update(Role role);
	//删除一条角色职位记录
	public int delete(int id);
}
