package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OauthRefreshTokens implements Serializable {
    private String id;

    private String accessTokenId;

    private Boolean revoked;

    private Date expiresAt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessTokenId() {
        return accessTokenId;
    }

    public void setAccessTokenId(String accessTokenId) {
        this.accessTokenId = accessTokenId;
    }

    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accessTokenId=").append(accessTokenId);
        sb.append(", revoked=").append(revoked);
        sb.append(", expiresAt=").append(expiresAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}