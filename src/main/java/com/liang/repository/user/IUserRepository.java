package com.liang.repository.user;

import com.liang.dto.admin.user.AdminUserResponse;
import generated_jooq.tables.pojos.User;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
public interface IUserRepository {

    /**
     * 模糊查询返回用户列表
     */
    List<AdminUserResponse> list(String params);

    /**
     * 添加用户
     */
    void insert(generated_jooq.tables.pojos.User user);

    /**
     * 获取用户详情
     */
    User detail(Long id);

    /**
     * 修改用户
     */
    void update(User user);

    /**
     * 删除用户
     */
    void delete(Long id);

    /**
     * 重置用户密码
     */
    void reset(Long id);

    /**
     * 邮箱、手机号登陆
     */
    generated_jooq.tables.pojos.User login(String username, String password);

    /**
     * 通过手机号查找用户
     */
    boolean existByPhone(String phone);

    /**
     * 通过邮箱查询用户
     */
    boolean existByEmail(String email);
}
