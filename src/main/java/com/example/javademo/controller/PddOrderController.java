package com.example.javademo.controller;


import com.example.javademo.common.api.CommonPage;
import com.example.javademo.common.api.CommonResult;
import com.example.javademo.dto.PddOrderListParam;
import com.example.javademo.dto.UpdateShopOrderParam;
import com.example.javademo.mbg.model.PddOrder;
import com.example.javademo.service.PddOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult<CommonPage<PddOrder>> getList(PddOrderListParam pddOrderListParam, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<PddOrder> pddOrderList = pddOrderService.getList(pddOrderListParam, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(pddOrderList));
    }

    @ApiOperation("根据订单id获取编辑订单信息")
    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PddOrder> getUpdateInfo(@PathVariable Integer id) {
        PddOrder pddOrderResult = pddOrderService.getUpdateInfo(id);
        return CommonResult.success(pddOrderResult);
    }

    @ApiOperation("编辑订单")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PddOrder> update(@PathVariable Integer id, @RequestBody UpdateShopOrderParam updateShopOrderParam) {
        PddOrder pddOrder = pddOrderService.update(id, updateShopOrderParam);
        return CommonResult.success(pddOrder);
    }
}
