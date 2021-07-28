package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrderPushWarehouseLog;
import com.example.javademo.mbg.model.PddOrderPushWarehouseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderPushWarehouseLogMapper {
    long countByExample(PddOrderPushWarehouseLogExample example);

    int deleteByExample(PddOrderPushWarehouseLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PddOrderPushWarehouseLog record);

    int insertSelective(PddOrderPushWarehouseLog record);

    List<PddOrderPushWarehouseLog> selectByExampleWithBLOBs(PddOrderPushWarehouseLogExample example);

    List<PddOrderPushWarehouseLog> selectByExample(PddOrderPushWarehouseLogExample example);

    PddOrderPushWarehouseLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PddOrderPushWarehouseLog record, @Param("example") PddOrderPushWarehouseLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PddOrderPushWarehouseLog record, @Param("example") PddOrderPushWarehouseLogExample example);

    int updateByExample(@Param("record") PddOrderPushWarehouseLog record, @Param("example") PddOrderPushWarehouseLogExample example);

    int updateByPrimaryKeySelective(PddOrderPushWarehouseLog record);

    int updateByPrimaryKeyWithBLOBs(PddOrderPushWarehouseLog record);

    int updateByPrimaryKey(PddOrderPushWarehouseLog record);
}