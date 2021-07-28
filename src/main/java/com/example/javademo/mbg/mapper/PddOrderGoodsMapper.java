package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PddOrderGoods;
import com.example.javademo.mbg.model.PddOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PddOrderGoodsMapper {
    long countByExample(PddOrderGoodsExample example);

    int deleteByExample(PddOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PddOrderGoods record);

    int insertSelective(PddOrderGoods record);

    List<PddOrderGoods> selectByExample(PddOrderGoodsExample example);

    PddOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PddOrderGoods record, @Param("example") PddOrderGoodsExample example);

    int updateByExample(@Param("record") PddOrderGoods record, @Param("example") PddOrderGoodsExample example);

    int updateByPrimaryKeySelective(PddOrderGoods record);

    int updateByPrimaryKey(PddOrderGoods record);
}