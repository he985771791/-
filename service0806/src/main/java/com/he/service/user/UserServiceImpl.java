package com.he.service.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.UserMapper;
import com.he.pojo.User;
import com.he.pojo.UserExample;
/**
 * 
 * @类名：UserServiceImpl
 * @描述：用户Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> getUsers(UserExample userExample, User user) {
		//如果withPage属性值为1代表要分页
		if(user.getWithPage()==1) {
			PageHelper.startPage(user.getPageNo(),user.getPageSize());
		}
		return userMapper.selectByExample(userExample);
	}

	@Override
	public User getUserById(int id) {
		//通过id查询用户
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(User user) {
		//仅插入不为空指针的用户数据
		return userMapper.insertSelective(user);
	}

	@Override
	public int update(User user) {
		//仅更新不为空指针的用户数据
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int delete(int id) {
		//删除一条用户记录
		return userMapper.deleteByPrimaryKey(id);
	}

}
