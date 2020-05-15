package com.liang.service;

import generated_jooq.tables.pojos.User;

public interface LoginService {
    /**
     * 邮箱或手机号登录
     */
    User login(String username, String password);

    /**
     * 设置最近登录时间
     */
    void setLastLoginTime(generated_jooq.tables.pojos.User user);

    /**
     * 通过手机号查询用户
     */
    boolean existByPhone(String phone);

    /**
     * 通过邮箱查询用户
     */
    boolean existByEmail(String email);

    /**
     * 注册用户
     */
    void register(generated_jooq.tables.pojos.User user);
}
