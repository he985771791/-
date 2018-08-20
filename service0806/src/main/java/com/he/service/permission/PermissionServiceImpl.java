package com.he.service.permission;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.PermissionMapper;
import com.he.pojo.Permission;
import com.he.pojo.PermissionExample;
/**
 * 
 * @类名：PermissionServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class PermissionServiceImpl implements PermissionServiceI {
	@Autowired
	PermissionMapper permissionMapper;
	@Override
	public List<Permission> getPermissions(PermissionExample permissionExample, Permission permission) {
		//如果withPage属性值为1代表要分页
		if(permission.getWithPage()==1) {
			PageHelper.startPage(permission.getPageNo(),permission.getPageSize());
		}
		return permissionMapper.selectByExample(permissionExample);
	}

	@Override
	public Permission getPermissionById(int id) {
		//通过id查询[note]
		return permissionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Permission permission) {
		//仅插入不为空指针的[note]数据
		return permissionMapper.insertSelective(permission);
	}

	@Override
	public int update(Permission permission) {
		//仅更新不为空指针的[note]数据
		return permissionMapper.updateByPrimaryKeySelective(permission);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return permissionMapper.deleteByPrimaryKey(id);
	}

}
