package com.he.dao;

import com.he.pojo.WorkflowStepDetail;
import com.he.pojo.WorkflowStepDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowStepDetailMapper {
    long countByExample(WorkflowStepDetailExample example);

    int deleteByExample(WorkflowStepDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkflowStepDetail record);

    int insertSelective(WorkflowStepDetail record);

    List<WorkflowStepDetail> selectByExample(WorkflowStepDetailExample example);

    WorkflowStepDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkflowStepDetail record, @Param("example") WorkflowStepDetailExample example);

    int updateByExample(@Param("record") WorkflowStepDetail record, @Param("example") WorkflowStepDetailExample example);

    int updateByPrimaryKeySelective(WorkflowStepDetail record);

    int updateByPrimaryKey(WorkflowStepDetail record);
}