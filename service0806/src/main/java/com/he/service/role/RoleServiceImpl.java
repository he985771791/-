package com.he.service.role;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.RoleMapper;
import com.he.pojo.Role;
import com.he.pojo.RoleExample;
/**
 * 
 * @类名：RoleServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class RoleServiceImpl implements RoleServiceI {
	@Autowired
	RoleMapper roleMapper;
	@Override
	public List<Role> getRoles(RoleExample roleExample, Role role) {
		//如果withPage属性值为1代表要分页
		if(role.getWithPage()==1) {
			PageHelper.startPage(role.getPageNo(),role.getPageSize());
		}
		return roleMapper.selectByExample(roleExample);
	}

	@Override
	public Role getRoleById(int id) {
		//通过id查询[note]
		return roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Role role) {
		//仅插入不为空指针的[note]数据
		return roleMapper.insertSelective(role);
	}

	@Override
	public int update(Role role) {
		//仅更新不为空指针的[note]数据
		return roleMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return roleMapper.deleteByPrimaryKey(id);
	}

}
