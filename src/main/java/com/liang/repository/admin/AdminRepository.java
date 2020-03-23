package com.liang.repository.admin;

import com.liang.DAO.admin.AdminDbStrategy;
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
    public String login(String username, String password) {
        return mAdminDbStrategy.login(username, password);
    }
}
