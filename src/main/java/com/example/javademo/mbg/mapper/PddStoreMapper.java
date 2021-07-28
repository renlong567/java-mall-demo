package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddStore;
import com.example.javademo.mbg.model.PddStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddStoreMapper {
    long countByExample(PddStoreExample example);

    int deleteByExample(PddStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PddStore record);

    int insertSelective(PddStore record);

    List<PddStore> selectByExample(PddStoreExample example);

    PddStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PddStore record, @Param("example") PddStoreExample example);

    int updateByExample(@Param("record") PddStore record, @Param("example") PddStoreExample example);

    int updateByPrimaryKeySelective(PddStore record);

    int updateByPrimaryKey(PddStore record);
}