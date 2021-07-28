package com.example.javademo.controller;


import com.example.javademo.common.api.CommonResult;
import com.example.javademo.mbg.model.PddOrder;
import com.example.javademo.service.PddOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "PddOrderController", description = "拼多多订单管理")
@RequestMapping("/pddOrder")
public class PddOrderController {
    @Autowired
    private PddOrderService pddOrderService;

    @ApiOperation("获取拼多多订单列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PddOrder>> getList() {
        return CommonResult.success(pddOrderService.getList());
    }
}
