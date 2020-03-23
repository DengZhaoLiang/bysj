package com.liang.service.admin.admin;

import com.liang.repository.admin.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private IAdminRepository mIAdminRepository;

    @Override
    public String login(String username, String password) {
        return mIAdminRepository.login(username, password);
    }
}
