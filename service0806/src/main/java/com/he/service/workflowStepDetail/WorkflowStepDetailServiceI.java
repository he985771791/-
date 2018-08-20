package com.he.service.workflowStepDetail;

import java.util.List;
import com.he.pojo.WorkflowStepDetail;
import com.he.pojo.WorkflowStepDetailExample;
/**
 * 
 * @类名：WorkflowStepDetailServiceI
 * @描述：流程步骤详情Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface WorkflowStepDetailServiceI {
	//查询流程步骤详情操作，workflowStepDetailExample中包含sql语句的条件，workflowStepDetail中包含是否分页以及起始页与每页数据个数
	public List<WorkflowStepDetail> getWorkflowStepDetails(WorkflowStepDetailExample workflowStepDetailExample , WorkflowStepDetail workflowStepDetail);
	//通过id查询流程步骤详情
	public WorkflowStepDetail getWorkflowStepDetailById(int id);
	//插入一条流程步骤详情记录
	public int insert(WorkflowStepDetail workflowStepDetail);
	//更新一条流程步骤详情记录
	public int update(WorkflowStepDetail workflowStepDetail);
	//删除一条流程步骤详情记录
	public int delete(int id);
}
