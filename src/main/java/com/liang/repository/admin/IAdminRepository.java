package com.liang.repository.admin;

import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
    List<AdminResponse> list();
}
