// Copyright (C) 2018 Nanshan
// All rights reserved
package model.user;

import model.status.OnOffEnum;
import model.user.enums.UserRoleEnum;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/6 下午5:40
 **/
public class UserModel {
    /**
     * 用户ID
     */
    private long userId;

    /**
     * 注册手机号
     */
    private String mobile;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    private UserRoleEnum role;

    /**
     * 用户状态
     */
    private OnOffEnum status;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    public OnOffEnum getStatus() {
        return status;
    }

    public void setStatus(OnOffEnum status) {
        this.status = status;
    }
}
