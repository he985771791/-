package com.he.service.workflow;

import java.util.List;
import com.he.pojo.Workflow;
import com.he.pojo.WorkflowExample;
/**
 * 
 * @类名：WorkflowServiceI
 * @描述：流程Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface WorkflowServiceI {
	//查询流程操作，workflowExample中包含sql语句的条件，workflow中包含是否分页以及起始页与每页数据个数
	public List<Workflow> getWorkflows(WorkflowExample workflowExample , Workflow workflow);
	//通过id查询流程
	public Workflow getWorkflowById(int id);
	//插入一条流程记录
	public int insert(Workflow workflow);
	//更新一条流程记录
	public int update(Workflow workflow);
	//删除一条流程记录
	public int delete(int id);
}
