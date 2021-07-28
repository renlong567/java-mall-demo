package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminUsers;
import com.example.javademo.mbg.model.AdminUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUsersMapper {
    long countByExample(AdminUsersExample example);

    int deleteByExample(AdminUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminUsers record);

    int insertSelective(AdminUsers record);

    List<AdminUsers> selectByExample(AdminUsersExample example);

    AdminUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminUsers record, @Param("example") AdminUsersExample example);

    int updateByExample(@Param("record") AdminUsers record, @Param("example") AdminUsersExample example);

    int updateByPrimaryKeySelective(AdminUsers record);

    int updateByPrimaryKey(AdminUsers record);
}