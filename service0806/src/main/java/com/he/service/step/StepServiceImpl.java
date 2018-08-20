package com.he.service.step;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.StepMapper;
import com.he.pojo.Step;
import com.he.pojo.StepExample;
/**
 * 
 * @类名：StepServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class StepServiceImpl implements StepServiceI {
	@Autowired
	StepMapper stepMapper;
	@Override
	public List<Step> getSteps(StepExample stepExample, Step step) {
		//如果withPage属性值为1代表要分页
		if(step.getWithPage()==1) {
			PageHelper.startPage(step.getPageNo(),step.getPageSize());
		}
		return stepMapper.selectByExample(stepExample);
	}

	@Override
	public Step getStepById(int id) {
		//通过id查询[note]
		return stepMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Step step) {
		//仅插入不为空指针的[note]数据
		return stepMapper.insertSelective(step);
	}

	@Override
	public int update(Step step) {
		//仅更新不为空指针的[note]数据
		return stepMapper.updateByPrimaryKeySelective(step);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return stepMapper.deleteByPrimaryKey(id);
	}

}
