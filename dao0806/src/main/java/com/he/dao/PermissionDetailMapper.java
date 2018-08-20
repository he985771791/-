package com.he.dao;

import com.he.pojo.PermissionDetail;
import com.he.pojo.PermissionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionDetailMapper {
    long countByExample(PermissionDetailExample example);

    int deleteByExample(PermissionDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PermissionDetail record);

    int insertSelective(PermissionDetail record);

    List<PermissionDetail> selectByExample(PermissionDetailExample example);

    PermissionDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PermissionDetail record, @Param("example") PermissionDetailExample example);

    int updateByExample(@Param("record") PermissionDetail record, @Param("example") PermissionDetailExample example);

    int updateByPrimaryKeySelective(PermissionDetail record);

    int updateByPrimaryKey(PermissionDetail record);
}