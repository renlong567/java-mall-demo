package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminRolePermissions;
import com.example.javademo.mbg.model.AdminRolePermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRolePermissionsMapper {
    long countByExample(AdminRolePermissionsExample example);

    int deleteByExample(AdminRolePermissionsExample example);

    int insert(AdminRolePermissions record);

    int insertSelective(AdminRolePermissions record);

    List<AdminRolePermissions> selectByExample(AdminRolePermissionsExample example);

    int updateByExampleSelective(@Param("record") AdminRolePermissions record, @Param("example") AdminRolePermissionsExample example);

    int updateByExample(@Param("record") AdminRolePermissions record, @Param("example") AdminRolePermissionsExample example);
}