package com.he.dao;

import com.he.pojo.LogComment;
import com.he.pojo.LogCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogCommentMapper {
    long countByExample(LogCommentExample example);

    int deleteByExample(LogCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogComment record);

    int insertSelective(LogComment record);

    List<LogComment> selectByExample(LogCommentExample example);

    LogComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogComment record, @Param("example") LogCommentExample example);

    int updateByExample(@Param("record") LogComment record, @Param("example") LogCommentExample example);

    int updateByPrimaryKeySelective(LogComment record);

    int updateByPrimaryKey(LogComment record);
}