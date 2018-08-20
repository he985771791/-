package com.he.dao;

import com.he.pojo.Step;
import com.he.pojo.StepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StepMapper {
    long countByExample(StepExample example);

    int deleteByExample(StepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Step record);

    int insertSelective(Step record);

    List<Step> selectByExample(StepExample example);

    Step selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Step record, @Param("example") StepExample example);

    int updateByExample(@Param("record") Step record, @Param("example") StepExample example);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);
}