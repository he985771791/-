package com.he.dao;

import com.he.pojo.Workflow;
import com.he.pojo.WorkflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowMapper {
    long countByExample(WorkflowExample example);

    int deleteByExample(WorkflowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Workflow record);

    int insertSelective(Workflow record);

    List<Workflow> selectByExample(WorkflowExample example);

    Workflow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Workflow record, @Param("example") WorkflowExample example);

    int updateByExample(@Param("record") Workflow record, @Param("example") WorkflowExample example);

    int updateByPrimaryKeySelective(Workflow record);

    int updateByPrimaryKey(Workflow record);
}