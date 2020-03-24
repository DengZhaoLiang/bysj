package com.liang.service.admin.admin;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;
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
    PageResponse page(Pageable pageable);
}
