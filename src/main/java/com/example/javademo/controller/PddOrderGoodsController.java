package com.example.javademo.controller;


import com.example.javademo.common.api.CommonResult;
import com.example.javademo.mbg.model.PddOrderGoods;
import com.example.javademo.service.PddOrderGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "PddOrderGoodsController", description = "拼多多订单详情管理")
@RequestMapping("/PddOrderGoods")
public class PddOrderGoodsController {
    @Autowired
    private PddOrderGoodsService pddOrderGoodsService;

    @ApiOperation("获取拼多多订单详情列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PddOrderGoods>> getList() {
        return CommonResult.success(pddOrderGoodsService.getList());
    }
}
