package com.example.javademo.service.impl;

import com.example.javademo.dto.PddOrderListParam;
import com.example.javademo.dto.UpdateShopOrderParam;
import com.example.javademo.mbg.mapper.PddOrderMapper;
import com.example.javademo.mbg.model.PddOrder;
import com.example.javademo.mbg.model.PddOrderExample;
import com.example.javademo.service.PddOrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
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

    @Override
    public PddOrder getUpdateInfo(Integer id) {
        PddOrderExample pddOrderExample = new PddOrderExample();
        pddOrderExample.createCriteria().andIdEqualTo(id);
        List<PddOrder> pddOrderList = pddOrderMapper.selectByExample(pddOrderExample);
        if (pddOrderList.isEmpty()) {
            return new PddOrder();
        }
        return pddOrderList.get(0);
    }

    @Override
    public PddOrder update(Integer id, UpdateShopOrderParam updateShopOrderParam) {
        PddOrder pddOrder = pddOrderMapper.selectByPrimaryKey(id);
        if (pddOrder == null) {
            throw new BadCredentialsException("订单不存在");
        }

        BeanUtils.copyProperties(updateShopOrderParam, pddOrder);

        int updateByPrimaryKeySelective = pddOrderMapper.updateByPrimaryKeySelective(pddOrder);

        if (updateByPrimaryKeySelective != 1) {
            throw new BadCredentialsException("更新失败");
        }
        return pddOrder;
    }

}
