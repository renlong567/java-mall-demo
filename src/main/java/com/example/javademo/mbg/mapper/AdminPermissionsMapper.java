package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminPermissions;
import com.example.javademo.mbg.model.AdminPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminPermissionsMapper {
    long countByExample(AdminPermissionsExample example);

    int deleteByExample(AdminPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminPermissions record);

    int insertSelective(AdminPermissions record);

    List<AdminPermissions> selectByExampleWithBLOBs(AdminPermissionsExample example);

    List<AdminPermissions> selectByExample(AdminPermissionsExample example);

    AdminPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminPermissions record, @Param("example") AdminPermissionsExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminPermissions record, @Param("example") AdminPermissionsExample example);

    int updateByExample(@Param("record") AdminPermissions record, @Param("example") AdminPermissionsExample example);

    int updateByPrimaryKeySelective(AdminPermissions record);

    int updateByPrimaryKeyWithBLOBs(AdminPermissions record);

    int updateByPrimaryKey(AdminPermissions record);
}