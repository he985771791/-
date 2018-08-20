package com.he.service.workflowStepDetail;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.WorkflowStepDetailMapper;
import com.he.pojo.WorkflowStepDetail;
import com.he.pojo.WorkflowStepDetailExample;
/**
 * 
 * @类名：WorkflowStepDetailServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class WorkflowStepDetailServiceImpl implements WorkflowStepDetailServiceI {
	@Autowired
	WorkflowStepDetailMapper workflowStepDetailMapper;
	@Override
	public List<WorkflowStepDetail> getWorkflowStepDetails(WorkflowStepDetailExample workflowStepDetailExample, WorkflowStepDetail workflowStepDetail) {
		//如果withPage属性值为1代表要分页
		if(workflowStepDetail.getWithPage()==1) {
			PageHelper.startPage(workflowStepDetail.getPageNo(),workflowStepDetail.getPageSize());
		}
		return workflowStepDetailMapper.selectByExample(workflowStepDetailExample);
	}

	@Override
	public WorkflowStepDetail getWorkflowStepDetailById(int id) {
		//通过id查询[note]
		return workflowStepDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(WorkflowStepDetail workflowStepDetail) {
		//仅插入不为空指针的[note]数据
		return workflowStepDetailMapper.insertSelective(workflowStepDetail);
	}

	@Override
	public int update(WorkflowStepDetail workflowStepDetail) {
		//仅更新不为空指针的[note]数据
		return workflowStepDetailMapper.updateByPrimaryKeySelective(workflowStepDetail);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return workflowStepDetailMapper.deleteByPrimaryKey(id);
	}

}
