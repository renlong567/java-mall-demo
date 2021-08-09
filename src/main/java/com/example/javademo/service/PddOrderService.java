package com.example.javademo.service;

import com.example.javademo.dto.PddOrderListParam;
import com.example.javademo.mbg.model.PddOrder;

import java.util.List;

public interface PddOrderService {
    List<PddOrder> getList(PddOrderListParam pddOrderListParam, Integer pageNum, Integer pageSize);
}
