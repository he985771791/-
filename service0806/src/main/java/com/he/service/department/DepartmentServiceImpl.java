package com.he.service.department;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.DepartmentMapper;
import com.he.pojo.Department;
import com.he.pojo.DepartmentExample;
/**
 * 
 * @类名：DepartmentServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class DepartmentServiceImpl implements DepartmentServiceI {
	@Autowired
	DepartmentMapper departmentMapper;
	@Override
	public List<Department> getDepartments(DepartmentExample departmentExample, Department department) {
		//如果withPage属性值为1代表要分页
		if(department.getWithPage()==1) {
			PageHelper.startPage(department.getPageNo(),department.getPageSize());
		}
		return departmentMapper.selectByExample(departmentExample);
	}

	@Override
	public Department getDepartmentById(int id) {
		//通过id查询[note]
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Department department) {
		//仅插入不为空指针的[note]数据
		return departmentMapper.insertSelective(department);
	}

	@Override
	public int update(Department department) {
		//仅更新不为空指针的[note]数据
		return departmentMapper.updateByPrimaryKeySelective(department);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return departmentMapper.deleteByPrimaryKey(id);
	}

}
