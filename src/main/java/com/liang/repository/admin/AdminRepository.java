package com.liang.repository.admin;

import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import com.liang.DAO.admin.AdminDbStrategy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
@Repository
@Primary
public class AdminRepository implements IAdminRepository {

    @Autowired
    private AdminDbStrategy mAdminDbStrategy;

    @Override
    public Admin login(String username, String password) {
        return mAdminDbStrategy.login(username, password);
    }

    @Override
    public List<AdminResponse> list() {
        return mAdminDbStrategy.list();
    }
}
