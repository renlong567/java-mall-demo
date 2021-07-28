package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PddOrder implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "拼多多店铺ID")
    private Integer pddStoreId;

    @ApiModelProperty(value = "拼多多店铺名称")
    private String pddStoreName;

    @ApiModelProperty(value = "订单号")
    private String orderSn;

    @ApiModelProperty(value = "支付金额，支付金额=商品金额-折扣金额+邮费")
    private Integer payAmount;

    @ApiModelProperty(value = "商品金额")
    private Integer goodsAmount;

    @ApiModelProperty(value = "折扣金额")
    private Integer discountAmount;

    @ApiModelProperty(value = "运费")
    private Integer dispatchPrice;

    @ApiModelProperty(value = "支付类型")
    private String payType;

    @ApiModelProperty(value = "支付单号")
    private String payNo;

    @ApiModelProperty(value = "国家或地区")
    private String country;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "收件人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收件人电话")
    private String receiverPhone;

    @ApiModelProperty(value = "下单时间")
    private Date createdTime;

    @ApiModelProperty(value = "支付时间")
    private Date payTime;

    @ApiModelProperty(value = "成交时间")
    private Date confirmTime;

    @ApiModelProperty(value = "推送仓储状态，0未推送，1已推送，2推送失败，3无需推送")
    private Byte pushWarehouseStatus;

    @ApiModelProperty(value = "推送时间")
    private Date pushWarehouseTime;

    @ApiModelProperty(value = "快递公司")
    private String expressCom;

    @ApiModelProperty(value = "快递单号")
    private String expressSn;

    @ApiModelProperty(value = "发货状态，0未发货，1已发货，2发货失败，3已发货，同步失败")
    private Byte shippingStatus;

    @ApiModelProperty(value = "发货时间")
    private Date shippingTime;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "收件人地址")
    private String receiverAddress;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPddStoreId() {
        return pddStoreId;
    }

    public void setPddStoreId(Integer pddStoreId) {
        this.pddStoreId = pddStoreId;
    }

    public String getPddStoreName() {
        return pddStoreName;
    }

    public void setPddStoreName(String pddStoreName) {
        this.pddStoreName = pddStoreName;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getDispatchPrice() {
        return dispatchPrice;
    }

    public void setDispatchPrice(Integer dispatchPrice) {
        this.dispatchPrice = dispatchPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Byte getPushWarehouseStatus() {
        return pushWarehouseStatus;
    }

    public void setPushWarehouseStatus(Byte pushWarehouseStatus) {
        this.pushWarehouseStatus = pushWarehouseStatus;
    }

    public Date getPushWarehouseTime() {
        return pushWarehouseTime;
    }

    public void setPushWarehouseTime(Date pushWarehouseTime) {
        this.pushWarehouseTime = pushWarehouseTime;
    }

    public String getExpressCom() {
        return expressCom;
    }

    public void setExpressCom(String expressCom) {
        this.expressCom = expressCom;
    }

    public String getExpressSn() {
        return expressSn;
    }

    public void setExpressSn(String expressSn) {
        this.expressSn = expressSn;
    }

    public Byte getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Byte shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
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

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pddStoreId=").append(pddStoreId);
        sb.append(", pddStoreName=").append(pddStoreName);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", goodsAmount=").append(goodsAmount);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", dispatchPrice=").append(dispatchPrice);
        sb.append(", payType=").append(payType);
        sb.append(", payNo=").append(payNo);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", pushWarehouseStatus=").append(pushWarehouseStatus);
        sb.append(", pushWarehouseTime=").append(pushWarehouseTime);
        sb.append(", expressCom=").append(expressCom);
        sb.append(", expressSn=").append(expressSn);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", shippingTime=").append(shippingTime);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}