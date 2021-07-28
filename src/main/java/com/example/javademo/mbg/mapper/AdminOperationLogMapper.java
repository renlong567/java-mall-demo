package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.AdminOperationLog;
import com.example.javademo.mbg.model.AdminOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminOperationLogMapper {
    long countByExample(AdminOperationLogExample example);

    int deleteByExample(AdminOperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminOperationLog record);

    int insertSelective(AdminOperationLog record);

    List<AdminOperationLog> selectByExampleWithBLOBs(AdminOperationLogExample example);

    List<AdminOperationLog> selectByExample(AdminOperationLogExample example);

    AdminOperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminOperationLog record, @Param("example") AdminOperationLogExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminOperationLog record, @Param("example") AdminOperationLogExample example);

    int updateByExample(@Param("record") AdminOperationLog record, @Param("example") AdminOperationLogExample example);

    int updateByPrimaryKeySelective(AdminOperationLog record);

    int updateByPrimaryKeyWithBLOBs(AdminOperationLog record);

    int updateByPrimaryKey(AdminOperationLog record);
}