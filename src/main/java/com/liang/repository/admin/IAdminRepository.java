package com.liang.repository.admin;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
public interface IAdminRepository {
    /**
     * 登录返回用户名
     */
    String login(String username, String password);
}
