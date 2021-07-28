package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrderResendLog;
import com.example.javademo.mbg.model.PddOrderResendLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderResendLogMapper {
    long countByExample(PddOrderResendLogExample example);

    int deleteByExample(PddOrderResendLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PddOrderResendLog record);

    int insertSelective(PddOrderResendLog record);

    List<PddOrderResendLog> selectByExampleWithBLOBs(PddOrderResendLogExample example);

    List<PddOrderResendLog> selectByExample(PddOrderResendLogExample example);

    PddOrderResendLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PddOrderResendLog record, @Param("example") PddOrderResendLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PddOrderResendLog record, @Param("example") PddOrderResendLogExample example);

    int updateByExample(@Param("record") PddOrderResendLog record, @Param("example") PddOrderResendLogExample example);

    int updateByPrimaryKeySelective(PddOrderResendLog record);

    int updateByPrimaryKeyWithBLOBs(PddOrderResendLog record);

    int updateByPrimaryKey(PddOrderResendLog record);
}