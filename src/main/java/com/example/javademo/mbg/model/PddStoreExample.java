package com.example.javademo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PddStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PddStoreExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andStoreSnIsNull() {
            addCriterion("store_sn is null");
            return (Criteria) this;
        }

        public Criteria andStoreSnIsNotNull() {
            addCriterion("store_sn is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSnEqualTo(String value) {
            addCriterion("store_sn =", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotEqualTo(String value) {
            addCriterion("store_sn <>", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnGreaterThan(String value) {
            addCriterion("store_sn >", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnGreaterThanOrEqualTo(String value) {
            addCriterion("store_sn >=", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLessThan(String value) {
            addCriterion("store_sn <", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLessThanOrEqualTo(String value) {
            addCriterion("store_sn <=", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLike(String value) {
            addCriterion("store_sn like", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotLike(String value) {
            addCriterion("store_sn not like", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnIn(List<String> values) {
            addCriterion("store_sn in", values, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotIn(List<String> values) {
            addCriterion("store_sn not in", values, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnBetween(String value1, String value2) {
            addCriterion("store_sn between", value1, value2, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotBetween(String value1, String value2) {
            addCriterion("store_sn not between", value1, value2, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNull() {
            addCriterion("store_status is null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNotNull() {
            addCriterion("store_status is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusEqualTo(Byte value) {
            addCriterion("store_status =", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotEqualTo(Byte value) {
            addCriterion("store_status <>", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThan(Byte value) {
            addCriterion("store_status >", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_status >=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThan(Byte value) {
            addCriterion("store_status <", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThanOrEqualTo(Byte value) {
            addCriterion("store_status <=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIn(List<Byte> values) {
            addCriterion("store_status in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotIn(List<Byte> values) {
            addCriterion("store_status not in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusBetween(Byte value1, Byte value2) {
            addCriterion("store_status between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("store_status not between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientSecretIsNull() {
            addCriterion("client_secret is null");
            return (Criteria) this;
        }

        public Criteria andClientSecretIsNotNull() {
            addCriterion("client_secret is not null");
            return (Criteria) this;
        }

        public Criteria andClientSecretEqualTo(String value) {
            addCriterion("client_secret =", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotEqualTo(String value) {
            addCriterion("client_secret <>", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretGreaterThan(String value) {
            addCriterion("client_secret >", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretGreaterThanOrEqualTo(String value) {
            addCriterion("client_secret >=", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLessThan(String value) {
            addCriterion("client_secret <", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLessThanOrEqualTo(String value) {
            addCriterion("client_secret <=", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLike(String value) {
            addCriterion("client_secret like", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotLike(String value) {
            addCriterion("client_secret not like", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretIn(List<String> values) {
            addCriterion("client_secret in", values, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotIn(List<String> values) {
            addCriterion("client_secret not in", values, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretBetween(String value1, String value2) {
            addCriterion("client_secret between", value1, value2, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotBetween(String value1, String value2) {
            addCriterion("client_secret not between", value1, value2, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andExpiresAtIsNull() {
            addCriterion("expires_at is null");
            return (Criteria) this;
        }

        public Criteria andExpiresAtIsNotNull() {
            addCriterion("expires_at is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresAtEqualTo(Integer value) {
            addCriterion("expires_at =", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtNotEqualTo(Integer value) {
            addCriterion("expires_at <>", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtGreaterThan(Integer value) {
            addCriterion("expires_at >", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("expires_at >=", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtLessThan(Integer value) {
            addCriterion("expires_at <", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtLessThanOrEqualTo(Integer value) {
            addCriterion("expires_at <=", value, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtIn(List<Integer> values) {
            addCriterion("expires_at in", values, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtNotIn(List<Integer> values) {
            addCriterion("expires_at not in", values, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtBetween(Integer value1, Integer value2) {
            addCriterion("expires_at between", value1, value2, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andExpiresAtNotBetween(Integer value1, Integer value2) {
            addCriterion("expires_at not between", value1, value2, "expiresAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtIsNull() {
            addCriterion("last_sync_at is null");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtIsNotNull() {
            addCriterion("last_sync_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtEqualTo(Integer value) {
            addCriterion("last_sync_at =", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtNotEqualTo(Integer value) {
            addCriterion("last_sync_at <>", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtGreaterThan(Integer value) {
            addCriterion("last_sync_at >", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_sync_at >=", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtLessThan(Integer value) {
            addCriterion("last_sync_at <", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtLessThanOrEqualTo(Integer value) {
            addCriterion("last_sync_at <=", value, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtIn(List<Integer> values) {
            addCriterion("last_sync_at in", values, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtNotIn(List<Integer> values) {
            addCriterion("last_sync_at not in", values, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtBetween(Integer value1, Integer value2) {
            addCriterion("last_sync_at between", value1, value2, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andLastSyncAtNotBetween(Integer value1, Integer value2) {
            addCriterion("last_sync_at not between", value1, value2, "lastSyncAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNull() {
            addCriterion("refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNotNull() {
            addCriterion("refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenEqualTo(String value) {
            addCriterion("refresh_token =", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotEqualTo(String value) {
            addCriterion("refresh_token <>", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThan(String value) {
            addCriterion("refresh_token >", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_token >=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThan(String value) {
            addCriterion("refresh_token <", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("refresh_token <=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLike(String value) {
            addCriterion("refresh_token like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotLike(String value) {
            addCriterion("refresh_token not like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIn(List<String> values) {
            addCriterion("refresh_token in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotIn(List<String> values) {
            addCriterion("refresh_token not in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenBetween(String value1, String value2) {
            addCriterion("refresh_token between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("refresh_token not between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtIsNull() {
            addCriterion("refresh_token_expires_at is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtIsNotNull() {
            addCriterion("refresh_token_expires_at is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtEqualTo(Integer value) {
            addCriterion("refresh_token_expires_at =", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtNotEqualTo(Integer value) {
            addCriterion("refresh_token_expires_at <>", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtGreaterThan(Integer value) {
            addCriterion("refresh_token_expires_at >", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("refresh_token_expires_at >=", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtLessThan(Integer value) {
            addCriterion("refresh_token_expires_at <", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtLessThanOrEqualTo(Integer value) {
            addCriterion("refresh_token_expires_at <=", value, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtIn(List<Integer> values) {
            addCriterion("refresh_token_expires_at in", values, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtNotIn(List<Integer> values) {
            addCriterion("refresh_token_expires_at not in", values, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtBetween(Integer value1, Integer value2) {
            addCriterion("refresh_token_expires_at between", value1, value2, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenExpiresAtNotBetween(Integer value1, Integer value2) {
            addCriterion("refresh_token_expires_at not between", value1, value2, "refreshTokenExpiresAt");
            return (Criteria) this;
        }

        public Criteria andSyncResponseIsNull() {
            addCriterion("sync_response is null");
            return (Criteria) this;
        }

        public Criteria andSyncResponseIsNotNull() {
            addCriterion("sync_response is not null");
            return (Criteria) this;
        }

        public Criteria andSyncResponseEqualTo(String value) {
            addCriterion("sync_response =", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseNotEqualTo(String value) {
            addCriterion("sync_response <>", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseGreaterThan(String value) {
            addCriterion("sync_response >", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseGreaterThanOrEqualTo(String value) {
            addCriterion("sync_response >=", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseLessThan(String value) {
            addCriterion("sync_response <", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseLessThanOrEqualTo(String value) {
            addCriterion("sync_response <=", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseLike(String value) {
            addCriterion("sync_response like", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseNotLike(String value) {
            addCriterion("sync_response not like", value, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseIn(List<String> values) {
            addCriterion("sync_response in", values, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseNotIn(List<String> values) {
            addCriterion("sync_response not in", values, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseBetween(String value1, String value2) {
            addCriterion("sync_response between", value1, value2, "syncResponse");
            return (Criteria) this;
        }

        public Criteria andSyncResponseNotBetween(String value1, String value2) {
            addCriterion("sync_response not between", value1, value2, "syncResponse");
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