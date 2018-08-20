package com.he.service.step;

import java.util.List;
import com.he.pojo.Step;
import com.he.pojo.StepExample;
/**
 * 
 * @类名：StepServiceI
 * @描述：流程步骤Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface StepServiceI {
	//查询流程步骤操作，stepExample中包含sql语句的条件，step中包含是否分页以及起始页与每页数据个数
	public List<Step> getSteps(StepExample stepExample , Step step);
	//通过id查询流程步骤
	public Step getStepById(int id);
	//插入一条流程步骤记录
	public int insert(Step step);
	//更新一条流程步骤记录
	public int update(Step step);
	//删除一条流程步骤记录
	public int delete(int id);
}
