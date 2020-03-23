package com.liang.service.admin.admin;

import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
public interface AdminService {

    /**
     * 登录返回用户名
     */
    Admin login(String username, String password);


    List<AdminResponse> list();
}
