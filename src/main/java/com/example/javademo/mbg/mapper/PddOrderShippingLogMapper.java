package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrderShippingLog;
import com.example.javademo.mbg.model.PddOrderShippingLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderShippingLogMapper {
    long countByExample(PddOrderShippingLogExample example);

    int deleteByExample(PddOrderShippingLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PddOrderShippingLog record);

    int insertSelective(PddOrderShippingLog record);

    List<PddOrderShippingLog> selectByExampleWithBLOBs(PddOrderShippingLogExample example);

    List<PddOrderShippingLog> selectByExample(PddOrderShippingLogExample example);

    PddOrderShippingLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PddOrderShippingLog record, @Param("example") PddOrderShippingLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PddOrderShippingLog record, @Param("example") PddOrderShippingLogExample example);

    int updateByExample(@Param("record") PddOrderShippingLog record, @Param("example") PddOrderShippingLogExample example);

    int updateByPrimaryKeySelective(PddOrderShippingLog record);

    int updateByPrimaryKeyWithBLOBs(PddOrderShippingLog record);

    int updateByPrimaryKey(PddOrderShippingLog record);
}