package com.liang.repository.admin;

import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;
import java.util.Optional;
import org.jooq.types.ULong;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
public interface IAdminRepository {
    /**
     * 登录返回用户名
     */
    Admin login(String username, String password);

    /**
     * 返回管理员列表
     */
    List<AdminResponse> list(String params);

    /**
     * 获取管理员详情
     */
    Optional<Admin> getAdminById(Long id);

    /**
     * 添加管理员
     */
    void insert(Admin admin);

    /**
     * 修改管理员
     */
    void update(Admin admin);

    /**
     * 删除管理员
     */
    void delete(Long id);

}
