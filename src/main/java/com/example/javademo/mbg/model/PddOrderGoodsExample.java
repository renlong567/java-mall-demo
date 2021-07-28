package com.example.javademo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PddOrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PddOrderGoodsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdIsNull() {
            addCriterion("pdd_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdIsNotNull() {
            addCriterion("pdd_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdEqualTo(Integer value) {
            addCriterion("pdd_order_id =", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdNotEqualTo(Integer value) {
            addCriterion("pdd_order_id <>", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdGreaterThan(Integer value) {
            addCriterion("pdd_order_id >", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdd_order_id >=", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdLessThan(Integer value) {
            addCriterion("pdd_order_id <", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("pdd_order_id <=", value, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdIn(List<Integer> values) {
            addCriterion("pdd_order_id in", values, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdNotIn(List<Integer> values) {
            addCriterion("pdd_order_id not in", values, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("pdd_order_id between", value1, value2, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andPddOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pdd_order_id not between", value1, value2, "pddOrderId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Integer value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Integer value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Integer value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Integer value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Integer> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Integer> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Short value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Short value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Short value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Short value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Short value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Short value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Short> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Short> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Short value1, Short value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Short value1, Short value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Integer value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Integer value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Integer value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Integer value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Integer> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Integer> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoIsNull() {
            addCriterion("owner_article_no is null");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoIsNotNull() {
            addCriterion("owner_article_no is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoEqualTo(String value) {
            addCriterion("owner_article_no =", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoNotEqualTo(String value) {
            addCriterion("owner_article_no <>", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoGreaterThan(String value) {
            addCriterion("owner_article_no >", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoGreaterThanOrEqualTo(String value) {
            addCriterion("owner_article_no >=", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoLessThan(String value) {
            addCriterion("owner_article_no <", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoLessThanOrEqualTo(String value) {
            addCriterion("owner_article_no <=", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoLike(String value) {
            addCriterion("owner_article_no like", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoNotLike(String value) {
            addCriterion("owner_article_no not like", value, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoIn(List<String> values) {
            addCriterion("owner_article_no in", values, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoNotIn(List<String> values) {
            addCriterion("owner_article_no not in", values, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoBetween(String value1, String value2) {
            addCriterion("owner_article_no between", value1, value2, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andOwnerArticleNoNotBetween(String value1, String value2) {
            addCriterion("owner_article_no not between", value1, value2, "ownerArticleNo");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierIsNull() {
            addCriterion("article_identifier is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierIsNotNull() {
            addCriterion("article_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierEqualTo(String value) {
            addCriterion("article_identifier =", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierNotEqualTo(String value) {
            addCriterion("article_identifier <>", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierGreaterThan(String value) {
            addCriterion("article_identifier >", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("article_identifier >=", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierLessThan(String value) {
            addCriterion("article_identifier <", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierLessThanOrEqualTo(String value) {
            addCriterion("article_identifier <=", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierLike(String value) {
            addCriterion("article_identifier like", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierNotLike(String value) {
            addCriterion("article_identifier not like", value, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierIn(List<String> values) {
            addCriterion("article_identifier in", values, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierNotIn(List<String> values) {
            addCriterion("article_identifier not in", values, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierBetween(String value1, String value2) {
            addCriterion("article_identifier between", value1, value2, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andArticleIdentifierNotBetween(String value1, String value2) {
            addCriterion("article_identifier not between", value1, value2, "articleIdentifier");
            return (Criteria) this;
        }

        public Criteria andPackingQtyIsNull() {
            addCriterion("packing_qty is null");
            return (Criteria) this;
        }

        public Criteria andPackingQtyIsNotNull() {
            addCriterion("packing_qty is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQtyEqualTo(Byte value) {
            addCriterion("packing_qty =", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotEqualTo(Byte value) {
            addCriterion("packing_qty <>", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyGreaterThan(Byte value) {
            addCriterion("packing_qty >", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyGreaterThanOrEqualTo(Byte value) {
            addCriterion("packing_qty >=", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyLessThan(Byte value) {
            addCriterion("packing_qty <", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyLessThanOrEqualTo(Byte value) {
            addCriterion("packing_qty <=", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyIn(List<Byte> values) {
            addCriterion("packing_qty in", values, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotIn(List<Byte> values) {
            addCriterion("packing_qty not in", values, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyBetween(Byte value1, Byte value2) {
            addCriterion("packing_qty between", value1, value2, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotBetween(Byte value1, Byte value2) {
            addCriterion("packing_qty not between", value1, value2, "packingQty");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}