package com.liang.repository.admin;

import com.liang.DAO.admin.AdminDbStrategy;
import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
    public List<AdminResponse> list(String params) {
        return mAdminDbStrategy.list(params);
    }

    @Override
    public Optional<Admin> getAdminById(Long id) {
        return mAdminDbStrategy.getAdminById(id);
    }

    @Override
    public void insert(Admin admin) {
        mAdminDbStrategy.insert(admin);
    }

    @Override
    public void update(Admin admin) {
        mAdminDbStrategy.update(admin);
    }

    @Override
    public void delete(Long id) {
        mAdminDbStrategy.delete(id);
    }
}
