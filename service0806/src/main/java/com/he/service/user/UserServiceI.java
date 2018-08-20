package com.he.service.user;

import java.util.List;
import com.he.pojo.User;
import com.he.pojo.UserExample;
/**
 * 
 * @类名：UserServiceI
 * @描述：用户Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface UserServiceI {
	//查询用户操作，userExample中包含sql语句的条件，user中包含是否分页以及起始页与每页数据个数
	public List<User> getUsers(UserExample userExample , User user);
	//通过id查询用户
	public User getUserById(int id);
	//插入一条用户记录
	public int insert(User user);
	//更新一条用户记录
	public int update(User user);
	//删除一条用户记录
	public int delete(int id);
}
