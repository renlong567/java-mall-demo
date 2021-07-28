package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminRoles;
import com.example.javademo.mbg.model.AdminRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRolesMapper {
    long countByExample(AdminRolesExample example);

    int deleteByExample(AdminRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoles record);

    int insertSelective(AdminRoles record);

    List<AdminRoles> selectByExample(AdminRolesExample example);

    AdminRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByExample(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByPrimaryKeySelective(AdminRoles record);

    int updateByPrimaryKey(AdminRoles record);
}