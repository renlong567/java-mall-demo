package com.example.javademo.service.impl;

import com.example.javademo.mbg.mapper.PddOrderGoodsMapper;
import com.example.javademo.mbg.model.PddOrderGoods;
import com.example.javademo.mbg.model.PddOrderGoodsExample;
import com.example.javademo.service.PddOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PddOrderGoodsServiceImpl implements PddOrderGoodsService {
    @Autowired
    private PddOrderGoodsMapper PddOrderGoodsMapper;

    @Override
    public List<PddOrderGoods> getList() {
        return PddOrderGoodsMapper.selectByExample(new PddOrderGoodsExample());
    }
}
