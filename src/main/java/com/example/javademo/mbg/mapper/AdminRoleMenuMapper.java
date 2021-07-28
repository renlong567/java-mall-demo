package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminRoleMenu;
import com.example.javademo.mbg.model.AdminRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleMenuMapper {
    long countByExample(AdminRoleMenuExample example);

    int deleteByExample(AdminRoleMenuExample example);

    int insert(AdminRoleMenu record);

    int insertSelective(AdminRoleMenu record);

    List<AdminRoleMenu> selectByExample(AdminRoleMenuExample example);

    int updateByExampleSelective(@Param("record") AdminRoleMenu record, @Param("example") AdminRoleMenuExample example);

    int updateByExample(@Param("record") AdminRoleMenu record, @Param("example") AdminRoleMenuExample example);
}