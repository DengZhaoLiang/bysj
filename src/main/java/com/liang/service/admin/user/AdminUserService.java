package com.liang.service.admin.user;

import com.liang.dto.admin.user.AdminUserPageResponse;
import org.springframework.data.domain.Pageable;
import generated.tables.pojos.User;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
public interface AdminUserService {

    /**
     * 分页获取用户列表
     */
    AdminUserPageResponse page(Pageable pageable, String params);

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
