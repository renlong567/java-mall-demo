package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrder;
import com.example.javademo.mbg.model.PddOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderMapper {
    long countByExample(PddOrderExample example);

    int deleteByExample(PddOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PddOrder record);

    int insertSelective(PddOrder record);

    List<PddOrder> selectByExampleWithBLOBs(PddOrderExample example);

    List<PddOrder> selectByExample(PddOrderExample example);

    PddOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PddOrder record, @Param("example") PddOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") PddOrder record, @Param("example") PddOrderExample example);

    int updateByExample(@Param("record") PddOrder record, @Param("example") PddOrderExample example);

    int updateByPrimaryKeySelective(PddOrder record);

    int updateByPrimaryKeyWithBLOBs(PddOrder record);

    int updateByPrimaryKey(PddOrder record);
}