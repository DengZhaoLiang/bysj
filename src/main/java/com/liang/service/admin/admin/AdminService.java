package com.liang.service.admin.admin;

import com.liang.dto.admin.admin.AdminPageResponse;
import generated_jooq.tables.pojos.Admin;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
public interface AdminService {

    /**
     * 登录返回用户名
     */
    Admin login(String username, String password);

    /**
     * 分页获取管理员列表
     */
    AdminPageResponse page(Pageable pageable, String params);

    /**
     * 获取管理员详情
     */
    Admin detail(Long id);

    /**
     * 添加管理员
     */
    void insert(Admin admin);

    /**
     * 更新管理员
     */
    void update(Admin admin);

    /**
     * 删除管理员
     */
    void delete(Long id);
}
