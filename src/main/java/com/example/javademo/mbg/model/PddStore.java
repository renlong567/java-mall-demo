package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PddStore implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "店铺名称")
    private String name;

    @ApiModelProperty(value = "店铺管理员")
    private String manager;

    @ApiModelProperty(value = "店铺编号")
    private String storeSn;

    @ApiModelProperty(value = "店铺状态，0禁用，1启用")
    private Byte storeStatus;

    private String clientId;

    private String clientSecret;

    private String code;

    private String accessToken;

    private Integer expiresAt;

    @ApiModelProperty(value = "上次同步时间")
    private Integer lastSyncAt;

    private String refreshToken;

    private Integer refreshTokenExpiresAt;

    @ApiModelProperty(value = "同步响应信息")
    private String syncResponse;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getStoreSn() {
        return storeSn;
    }

    public void setStoreSn(String storeSn) {
        this.storeSn = storeSn;
    }

    public Byte getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Byte storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Integer getLastSyncAt() {
        return lastSyncAt;
    }

    public void setLastSyncAt(Integer lastSyncAt) {
        this.lastSyncAt = lastSyncAt;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Integer getRefreshTokenExpiresAt() {
        return refreshTokenExpiresAt;
    }

    public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    }

    public String getSyncResponse() {
        return syncResponse;
    }

    public void setSyncResponse(String syncResponse) {
        this.syncResponse = syncResponse;
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
        sb.append(", name=").append(name);
        sb.append(", manager=").append(manager);
        sb.append(", storeSn=").append(storeSn);
        sb.append(", storeStatus=").append(storeStatus);
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", code=").append(code);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", expiresAt=").append(expiresAt);
        sb.append(", lastSyncAt=").append(lastSyncAt);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", refreshTokenExpiresAt=").append(refreshTokenExpiresAt);
        sb.append(", syncResponse=").append(syncResponse);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}