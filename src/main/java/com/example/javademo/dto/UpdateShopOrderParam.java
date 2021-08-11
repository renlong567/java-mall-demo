package com.example.javademo.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class UpdateShopOrderParam {
    @NotEmpty
    @ApiModelProperty(value = "拼多多店铺ID", required = true)
    private Integer pdd_store_id;

    @NotEmpty
    @ApiModelProperty(value = "拼多多店铺名称", required = true)
    private String pdd_store_name;

    @NotEmpty
    @ApiModelProperty(value = "订单号", required = true)
    private String order_sn;

    @NotEmpty
    @ApiModelProperty(value = "支付金额", required = true)
    private Integer pay_amount;

    @NotEmpty
    @ApiModelProperty(value = "商品金额", required = true)
    private Integer goods_amount;

    @NotEmpty
    @ApiModelProperty(value = "折扣金额", required = true)
    private Integer discount_amount;

    @NotEmpty
    @ApiModelProperty(value = "运费", required = true)
    private Integer dispatch_price;

    @NotEmpty
    @ApiModelProperty(value = "支付类型", required = true)
    private String pay_type;

    @NotEmpty
    @ApiModelProperty(value = "支付单号", required = true)
    private String pay_no;

    @NotEmpty
    @ApiModelProperty(value = "国家或地区", required = true)
    private String country;

    @NotEmpty
    @ApiModelProperty(value = "省", required = true)
    private String province;

    @NotEmpty
    @ApiModelProperty(value = "市", required = true)
    private String city;

    @NotEmpty
    @ApiModelProperty(value = "区", required = true)
    private String area;

    @NotEmpty
    @ApiModelProperty(value = "收件人地址", required = true)
    private String receiver_address;

    @NotEmpty
    @ApiModelProperty(value = "收件人姓名", required = true)
    private String receiver_name;

    @NotEmpty
    @ApiModelProperty(value = "收件人电话", required = true)
    private String receiver_phone;

    @NotEmpty
    @ApiModelProperty(value = "下单时间", required = true)
    private Date created_time;

    @NotEmpty
    @ApiModelProperty(value = "支付时间", required = true)
    private Date pay_time;

    @NotEmpty
    @ApiModelProperty(value = "成交时间", required = true)
    private Date confirm_time;

    @NotEmpty
    @ApiModelProperty(value = "推送仓储状态", required = true)
    private Integer push_warehouse_status;

    @NotEmpty
    @ApiModelProperty(value = "推送时间", required = true)
    private Date push_warehouse_time;

    @NotEmpty
    @ApiModelProperty(value = "快递公司", required = true)
    private String express_com;

    @NotEmpty
    @ApiModelProperty(value = "快递单号", required = true)
    private String express_sn;

    @NotEmpty
    @ApiModelProperty(value = "发货状态", required = true)
    private Integer shipping_status;

    @NotEmpty
    @ApiModelProperty(value = "发货时间", required = true)
    private Date shipping_time;

    public Integer getPdd_store_id() {
        return pdd_store_id;
    }

    public void setPdd_store_id(Integer pdd_store_id) {
        this.pdd_store_id = pdd_store_id;
    }

    public String getPdd_store_name() {
        return pdd_store_name;
    }

    public void setPdd_store_name(String pdd_store_name) {
        this.pdd_store_name = pdd_store_name;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Integer getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(Integer pay_amount) {
        this.pay_amount = pay_amount;
    }

    public Integer getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(Integer goods_amount) {
        this.goods_amount = goods_amount;
    }

    public Integer getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(Integer discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Integer getDispatch_price() {
        return dispatch_price;
    }

    public void setDispatch_price(Integer dispatch_price) {
        this.dispatch_price = dispatch_price;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getPay_no() {
        return pay_no;
    }

    public void setPay_no(String pay_no) {
        this.pay_no = pay_no;
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

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public Date getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(Date confirm_time) {
        this.confirm_time = confirm_time;
    }

    public Integer getPush_warehouse_status() {
        return push_warehouse_status;
    }

    public void setPush_warehouse_status(Integer push_warehouse_status) {
        this.push_warehouse_status = push_warehouse_status;
    }

    public Date getPush_warehouse_time() {
        return push_warehouse_time;
    }

    public void setPush_warehouse_time(Date push_warehouse_time) {
        this.push_warehouse_time = push_warehouse_time;
    }

    public String getExpress_com() {
        return express_com;
    }

    public void setExpress_com(String express_com) {
        this.express_com = express_com;
    }

    public String getExpress_sn() {
        return express_sn;
    }

    public void setExpress_sn(String express_sn) {
        this.express_sn = express_sn;
    }

    public Integer getShipping_status() {
        return shipping_status;
    }

    public void setShipping_status(Integer shipping_status) {
        this.shipping_status = shipping_status;
    }

    public Date getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(Date shipping_time) {
        this.shipping_time = shipping_time;
    }
}
