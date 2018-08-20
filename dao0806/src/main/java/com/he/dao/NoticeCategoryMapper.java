package com.he.dao;

import com.he.pojo.NoticeCategory;
import com.he.pojo.NoticeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeCategoryMapper {
    long countByExample(NoticeCategoryExample example);

    int deleteByExample(NoticeCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeCategory record);

    int insertSelective(NoticeCategory record);

    List<NoticeCategory> selectByExample(NoticeCategoryExample example);

    NoticeCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeCategory record, @Param("example") NoticeCategoryExample example);

    int updateByExample(@Param("record") NoticeCategory record, @Param("example") NoticeCategoryExample example);

    int updateByPrimaryKeySelective(NoticeCategory record);

    int updateByPrimaryKey(NoticeCategory record);
}