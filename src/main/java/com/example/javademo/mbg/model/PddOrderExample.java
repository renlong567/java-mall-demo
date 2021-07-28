package com.example.javademo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PddOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PddOrderExample() {
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

        public Criteria andPddStoreIdIsNull() {
            addCriterion("pdd_store_id is null");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdIsNotNull() {
            addCriterion("pdd_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdEqualTo(Integer value) {
            addCriterion("pdd_store_id =", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdNotEqualTo(Integer value) {
            addCriterion("pdd_store_id <>", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdGreaterThan(Integer value) {
            addCriterion("pdd_store_id >", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdd_store_id >=", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdLessThan(Integer value) {
            addCriterion("pdd_store_id <", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("pdd_store_id <=", value, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdIn(List<Integer> values) {
            addCriterion("pdd_store_id in", values, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdNotIn(List<Integer> values) {
            addCriterion("pdd_store_id not in", values, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("pdd_store_id between", value1, value2, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pdd_store_id not between", value1, value2, "pddStoreId");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameIsNull() {
            addCriterion("pdd_store_name is null");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameIsNotNull() {
            addCriterion("pdd_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameEqualTo(String value) {
            addCriterion("pdd_store_name =", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameNotEqualTo(String value) {
            addCriterion("pdd_store_name <>", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameGreaterThan(String value) {
            addCriterion("pdd_store_name >", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_store_name >=", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameLessThan(String value) {
            addCriterion("pdd_store_name <", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameLessThanOrEqualTo(String value) {
            addCriterion("pdd_store_name <=", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameLike(String value) {
            addCriterion("pdd_store_name like", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameNotLike(String value) {
            addCriterion("pdd_store_name not like", value, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameIn(List<String> values) {
            addCriterion("pdd_store_name in", values, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameNotIn(List<String> values) {
            addCriterion("pdd_store_name not in", values, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameBetween(String value1, String value2) {
            addCriterion("pdd_store_name between", value1, value2, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andPddStoreNameNotBetween(String value1, String value2) {
            addCriterion("pdd_store_name not between", value1, value2, "pddStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Integer value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Integer value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Integer value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Integer value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Integer> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Integer> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Integer value1, Integer value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(Integer value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(Integer value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(Integer value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(Integer value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(Integer value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<Integer> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<Integer> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(Integer value1, Integer value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIsNull() {
            addCriterion("dispatch_price is null");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIsNotNull() {
            addCriterion("dispatch_price is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceEqualTo(Integer value) {
            addCriterion("dispatch_price =", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotEqualTo(Integer value) {
            addCriterion("dispatch_price <>", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceGreaterThan(Integer value) {
            addCriterion("dispatch_price >", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_price >=", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceLessThan(Integer value) {
            addCriterion("dispatch_price <", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_price <=", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIn(List<Integer> values) {
            addCriterion("dispatch_price in", values, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotIn(List<Integer> values) {
            addCriterion("dispatch_price not in", values, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_price between", value1, value2, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_price not between", value1, value2, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusIsNull() {
            addCriterion("push_warehouse_status is null");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusIsNotNull() {
            addCriterion("push_warehouse_status is not null");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusEqualTo(Byte value) {
            addCriterion("push_warehouse_status =", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusNotEqualTo(Byte value) {
            addCriterion("push_warehouse_status <>", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusGreaterThan(Byte value) {
            addCriterion("push_warehouse_status >", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("push_warehouse_status >=", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusLessThan(Byte value) {
            addCriterion("push_warehouse_status <", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusLessThanOrEqualTo(Byte value) {
            addCriterion("push_warehouse_status <=", value, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusIn(List<Byte> values) {
            addCriterion("push_warehouse_status in", values, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusNotIn(List<Byte> values) {
            addCriterion("push_warehouse_status not in", values, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusBetween(Byte value1, Byte value2) {
            addCriterion("push_warehouse_status between", value1, value2, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("push_warehouse_status not between", value1, value2, "pushWarehouseStatus");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeIsNull() {
            addCriterion("push_warehouse_time is null");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeIsNotNull() {
            addCriterion("push_warehouse_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeEqualTo(Date value) {
            addCriterion("push_warehouse_time =", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeNotEqualTo(Date value) {
            addCriterion("push_warehouse_time <>", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeGreaterThan(Date value) {
            addCriterion("push_warehouse_time >", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_warehouse_time >=", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeLessThan(Date value) {
            addCriterion("push_warehouse_time <", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_warehouse_time <=", value, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeIn(List<Date> values) {
            addCriterion("push_warehouse_time in", values, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeNotIn(List<Date> values) {
            addCriterion("push_warehouse_time not in", values, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeBetween(Date value1, Date value2) {
            addCriterion("push_warehouse_time between", value1, value2, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andPushWarehouseTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_warehouse_time not between", value1, value2, "pushWarehouseTime");
            return (Criteria) this;
        }

        public Criteria andExpressComIsNull() {
            addCriterion("express_com is null");
            return (Criteria) this;
        }

        public Criteria andExpressComIsNotNull() {
            addCriterion("express_com is not null");
            return (Criteria) this;
        }

        public Criteria andExpressComEqualTo(String value) {
            addCriterion("express_com =", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComNotEqualTo(String value) {
            addCriterion("express_com <>", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComGreaterThan(String value) {
            addCriterion("express_com >", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComGreaterThanOrEqualTo(String value) {
            addCriterion("express_com >=", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComLessThan(String value) {
            addCriterion("express_com <", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComLessThanOrEqualTo(String value) {
            addCriterion("express_com <=", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComLike(String value) {
            addCriterion("express_com like", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComNotLike(String value) {
            addCriterion("express_com not like", value, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComIn(List<String> values) {
            addCriterion("express_com in", values, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComNotIn(List<String> values) {
            addCriterion("express_com not in", values, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComBetween(String value1, String value2) {
            addCriterion("express_com between", value1, value2, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressComNotBetween(String value1, String value2) {
            addCriterion("express_com not between", value1, value2, "expressCom");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNull() {
            addCriterion("express_sn is null");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNotNull() {
            addCriterion("express_sn is not null");
            return (Criteria) this;
        }

        public Criteria andExpressSnEqualTo(String value) {
            addCriterion("express_sn =", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotEqualTo(String value) {
            addCriterion("express_sn <>", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThan(String value) {
            addCriterion("express_sn >", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThanOrEqualTo(String value) {
            addCriterion("express_sn >=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThan(String value) {
            addCriterion("express_sn <", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThanOrEqualTo(String value) {
            addCriterion("express_sn <=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLike(String value) {
            addCriterion("express_sn like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotLike(String value) {
            addCriterion("express_sn not like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnIn(List<String> values) {
            addCriterion("express_sn in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotIn(List<String> values) {
            addCriterion("express_sn not in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnBetween(String value1, String value2) {
            addCriterion("express_sn between", value1, value2, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotBetween(String value1, String value2) {
            addCriterion("express_sn not between", value1, value2, "expressSn");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Byte value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Byte value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Byte value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Byte value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Byte> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Byte> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Byte value1, Byte value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Date value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Date value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Date value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Date value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Date> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Date> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Date value1, Date value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
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