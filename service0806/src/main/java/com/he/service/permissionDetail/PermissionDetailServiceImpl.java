package com.he.service.permissionDetail;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.PermissionDetailMapper;
import com.he.pojo.PermissionDetail;
import com.he.pojo.PermissionDetailExample;
/**
 * 
 * @类名：PermissionDetailServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class PermissionDetailServiceImpl implements PermissionDetailServiceI {
	@Autowired
	PermissionDetailMapper permissionDetailMapper;
	@Override
	public List<PermissionDetail> getPermissionDetails(PermissionDetailExample permissionDetailExample, PermissionDetail permissionDetail) {
		//如果withPage属性值为1代表要分页
		if(permissionDetail.getWithPage()==1) {
			PageHelper.startPage(permissionDetail.getPageNo(),permissionDetail.getPageSize());
		}
		return permissionDetailMapper.selectByExample(permissionDetailExample);
	}

	@Override
	public PermissionDetail getPermissionDetailById(int id) {
		//通过id查询[note]
		return permissionDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(PermissionDetail permissionDetail) {
		//仅插入不为空指针的[note]数据
		return permissionDetailMapper.insertSelective(permissionDetail);
	}

	@Override
	public int update(PermissionDetail permissionDetail) {
		//仅更新不为空指针的[note]数据
		return permissionDetailMapper.updateByPrimaryKeySelective(permissionDetail);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return permissionDetailMapper.deleteByPrimaryKey(id);
	}

}
