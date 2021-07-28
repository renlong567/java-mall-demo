package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminUserPermissions;
import com.example.javademo.mbg.model.AdminUserPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserPermissionsMapper {
    long countByExample(AdminUserPermissionsExample example);

    int deleteByExample(AdminUserPermissionsExample example);

    int insert(AdminUserPermissions record);

    int insertSelective(AdminUserPermissions record);

    List<AdminUserPermissions> selectByExample(AdminUserPermissionsExample example);

    int updateByExampleSelective(@Param("record") AdminUserPermissions record, @Param("example") AdminUserPermissionsExample example);

    int updateByExample(@Param("record") AdminUserPermissions record, @Param("example") AdminUserPermissionsExample example);
}