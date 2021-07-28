package com.example.javademo.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class UpdateAdminPasswordParam {
    @NotEmpty
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "旧密码", required = true)
    private String oldPassword;

    @NotEmpty
    @ApiModelProperty(value = "新密码", required = true)
    private String newPassword;

    @NotEmpty
    @ApiModelProperty(value = "再次确认新密码", required = true)
    private String confirmNewPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
}
