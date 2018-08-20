package com.he.service.userLog;

import java.util.List;
import com.he.pojo.UserLog;
import com.he.pojo.UserLogExample;
/**
 * 
 * @类名：UserLogServiceI
 * @描述：用户日志Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface UserLogServiceI {
	//查询用户日志操作，userLogExample中包含sql语句的条件，userLog中包含是否分页以及起始页与每页数据个数
	public List<UserLog> getUserLogs(UserLogExample userLogExample , UserLog userLog);
	//通过id查询用户日志
	public UserLog getUserLogById(int id);
	//插入一条用户日志记录
	public int insert(UserLog userLog);
	//更新一条用户日志记录
	public int update(UserLog userLog);
	//删除一条用户日志记录
	public int delete(int id);
}
