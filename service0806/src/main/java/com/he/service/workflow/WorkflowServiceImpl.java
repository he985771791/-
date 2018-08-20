package com.he.service.workflow;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.WorkflowMapper;
import com.he.pojo.Workflow;
import com.he.pojo.WorkflowExample;
/**
 * 
 * @类名：WorkflowServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class WorkflowServiceImpl implements WorkflowServiceI {
	@Autowired
	WorkflowMapper workflowMapper;
	@Override
	public List<Workflow> getWorkflows(WorkflowExample workflowExample, Workflow workflow) {
		//如果withPage属性值为1代表要分页
		if(workflow.getWithPage()==1) {
			PageHelper.startPage(workflow.getPageNo(),workflow.getPageSize());
		}
		return workflowMapper.selectByExample(workflowExample);
	}

	@Override
	public Workflow getWorkflowById(int id) {
		//通过id查询[note]
		return workflowMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Workflow workflow) {
		//仅插入不为空指针的[note]数据
		return workflowMapper.insertSelective(workflow);
	}

	@Override
	public int update(Workflow workflow) {
		//仅更新不为空指针的[note]数据
		return workflowMapper.updateByPrimaryKeySelective(workflow);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return workflowMapper.deleteByPrimaryKey(id);
	}

}
