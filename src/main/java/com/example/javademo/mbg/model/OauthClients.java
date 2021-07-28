package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OauthClients implements Serializable {
    private Long id;

    private Long userId;

    private String name;

    private String secret;

    private String provider;

    private Boolean personalAccessClient;

    private Boolean passwordClient;

    private Boolean revoked;

    private Date createdAt;

    private Date updatedAt;

    private String redirect;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Boolean getPersonalAccessClient() {
        return personalAccessClient;
    }

    public void setPersonalAccessClient(Boolean personalAccessClient) {
        this.personalAccessClient = personalAccessClient;
    }

    public Boolean getPasswordClient() {
        return passwordClient;
    }

    public void setPasswordClient(Boolean passwordClient) {
        this.passwordClient = passwordClient;
    }

    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
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

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", secret=").append(secret);
        sb.append(", provider=").append(provider);
        sb.append(", personalAccessClient=").append(personalAccessClient);
        sb.append(", passwordClient=").append(passwordClient);
        sb.append(", revoked=").append(revoked);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", redirect=").append(redirect);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}