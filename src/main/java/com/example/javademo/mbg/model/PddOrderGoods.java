package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PddOrderGoods implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "订单ID")
    private Integer pddOrderId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品单价")
    private Integer goodsPrice;

    @ApiModelProperty(value = "商品数量")
    private Short num;

    @ApiModelProperty(value = "商品总价")
    private Integer totalPrice;

    @ApiModelProperty(value = "商品货号")
    private String ownerArticleNo;

    @ApiModelProperty(value = "商品条码")
    private String barcode;

    @ApiModelProperty(value = "商品海关备案号")
    private String articleIdentifier;

    @ApiModelProperty(value = "包装规格，是否是套装几件装，一般为1")
    private Byte packingQty;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPddOrderId() {
        return pddOrderId;
    }

    public void setPddOrderId(Integer pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOwnerArticleNo() {
        return ownerArticleNo;
    }

    public void setOwnerArticleNo(String ownerArticleNo) {
        this.ownerArticleNo = ownerArticleNo;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getArticleIdentifier() {
        return articleIdentifier;
    }

    public void setArticleIdentifier(String articleIdentifier) {
        this.articleIdentifier = articleIdentifier;
    }

    public Byte getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(Byte packingQty) {
        this.packingQty = packingQty;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pddOrderId=").append(pddOrderId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", num=").append(num);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", ownerArticleNo=").append(ownerArticleNo);
        sb.append(", barcode=").append(barcode);
        sb.append(", articleIdentifier=").append(articleIdentifier);
        sb.append(", packingQty=").append(packingQty);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}