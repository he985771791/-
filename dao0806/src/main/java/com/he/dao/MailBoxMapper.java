package com.he.dao;

import com.he.pojo.MailBox;
import com.he.pojo.MailBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailBoxMapper {
    long countByExample(MailBoxExample example);

    int deleteByExample(MailBoxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailBox record);

    int insertSelective(MailBox record);

    List<MailBox> selectByExample(MailBoxExample example);

    MailBox selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailBox record, @Param("example") MailBoxExample example);

    int updateByExample(@Param("record") MailBox record, @Param("example") MailBoxExample example);

    int updateByPrimaryKeySelective(MailBox record);

    int updateByPrimaryKey(MailBox record);
}