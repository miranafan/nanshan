// Copyright (C) 2018 Nanshan
// All rights reserved
package model.user;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/6 下午6:00
 **/
public class UserSession {
    private static ThreadLocal<UserModel> userLocal = new ThreadLocal<UserModel>();

    /**
     * 用户信息设置
     *
     * @param session
     */
    public static void set(UserModel session) {
        userLocal.set(session);
    }

    /**
     * 获取用户信息
     *
     * @return
     */
    public static UserModel get() {
        return userLocal.get();
    }

    /**
     * 清除用户信息
     */
    public static void remove() {
        userLocal.remove();
    }
}
