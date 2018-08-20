package com.he.service.userLog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.UserLogMapper;
import com.he.pojo.UserLog;
import com.he.pojo.UserLogExample;
/**
 * 
 * @类名：UserLogServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class UserLogServiceImpl implements UserLogServiceI {
	@Autowired
	UserLogMapper userLogMapper;
	@Override
	public List<UserLog> getUserLogs(UserLogExample userLogExample, UserLog userLog) {
		//如果withPage属性值为1代表要分页
		if(userLog.getWithPage()==1) {
			PageHelper.startPage(userLog.getPageNo(),userLog.getPageSize());
		}
		return userLogMapper.selectByExample(userLogExample);
	}

	@Override
	public UserLog getUserLogById(int id) {
		//通过id查询[note]
		return userLogMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(UserLog userLog) {
		//仅插入不为空指针的[note]数据
		return userLogMapper.insertSelective(userLog);
	}

	@Override
	public int update(UserLog userLog) {
		//仅更新不为空指针的[note]数据
		return userLogMapper.updateByPrimaryKeySelective(userLog);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return userLogMapper.deleteByPrimaryKey(id);
	}

}
