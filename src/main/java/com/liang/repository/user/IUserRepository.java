package com.liang.repository.user;

import com.liang.dto.admin.user.AdminUserResponse;
import generated.tables.pojos.User;
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
    void insert(generated.tables.pojos.User user);

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
}
