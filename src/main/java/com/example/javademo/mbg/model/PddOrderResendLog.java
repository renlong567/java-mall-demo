package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PddOrderResendLog implements Serializable {
    private Long id;

    @ApiModelProperty(value = "拼多多店铺ID")
    private Integer pddStoreId;

    @ApiModelProperty(value = "订单ID")
    private Integer pddOrderId;

    @ApiModelProperty(value = "订单号")
    private String orderSn;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "推送返回信息")
    private String response;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPddStoreId() {
        return pddStoreId;
    }

    public void setPddStoreId(Integer pddStoreId) {
        this.pddStoreId = pddStoreId;
    }

    public Integer getPddOrderId() {
        return pddOrderId;
    }

    public void setPddOrderId(Integer pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pddStoreId=").append(pddStoreId);
        sb.append(", pddOrderId=").append(pddOrderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", response=").append(response);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}