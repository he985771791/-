package com.he.service.department;

import java.util.List;
import com.he.pojo.Department;
import com.he.pojo.DepartmentExample;
/**
 * 
 * @类名：DepartmentServiceI
 * @描述：部门Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface DepartmentServiceI {
	//查询部门操作，departmentExample中包含sql语句的条件，department中包含是否分页以及起始页与每页数据个数
	public List<Department> getDepartments(DepartmentExample departmentExample , Department department);
	//通过id查询部门
	public Department getDepartmentById(int id);
	//插入一条部门记录
	public int insert(Department department);
	//更新一条部门记录
	public int update(Department department);
	//删除一条部门记录
	public int delete(int id);
}
