package com.example.javademo.service.impl;

import com.example.javademo.dto.PddOrderListParam;
import com.example.javademo.mbg.mapper.PddOrderMapper;
import com.example.javademo.mbg.model.PddOrder;
import com.example.javademo.mbg.model.PddOrderExample;
import com.example.javademo.service.PddOrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PddOrderServiceImpl implements PddOrderService {
    @Autowired
    private PddOrderMapper pddOrderMapper;

    @Override
    public List<PddOrder> getList(PddOrderListParam pddOrderListParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pddOrderMapper.selectByExample(new PddOrderExample());
    }
}
