package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrderCancelLog;
import com.example.javademo.mbg.model.PddOrderCancelLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderCancelLogMapper {
    long countByExample(PddOrderCancelLogExample example);

    int deleteByExample(PddOrderCancelLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PddOrderCancelLog record);

    int insertSelective(PddOrderCancelLog record);

    List<PddOrderCancelLog> selectByExampleWithBLOBs(PddOrderCancelLogExample example);

    List<PddOrderCancelLog> selectByExample(PddOrderCancelLogExample example);

    PddOrderCancelLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PddOrderCancelLog record, @Param("example") PddOrderCancelLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PddOrderCancelLog record, @Param("example") PddOrderCancelLogExample example);

    int updateByExample(@Param("record") PddOrderCancelLog record, @Param("example") PddOrderCancelLogExample example);

    int updateByPrimaryKeySelective(PddOrderCancelLog record);

    int updateByPrimaryKeyWithBLOBs(PddOrderCancelLog record);

    int updateByPrimaryKey(PddOrderCancelLog record);
}