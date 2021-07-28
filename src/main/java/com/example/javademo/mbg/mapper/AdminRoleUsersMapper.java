package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminRoleUsers;
import com.example.javademo.mbg.model.AdminRoleUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleUsersMapper {
    long countByExample(AdminRoleUsersExample example);

    int deleteByExample(AdminRoleUsersExample example);

    int insert(AdminRoleUsers record);

    int insertSelective(AdminRoleUsers record);

    List<AdminRoleUsers> selectByExample(AdminRoleUsersExample example);

    int updateByExampleSelective(@Param("record") AdminRoleUsers record, @Param("example") AdminRoleUsersExample example);

    int updateByExample(@Param("record") AdminRoleUsers record, @Param("example") AdminRoleUsersExample example);
}