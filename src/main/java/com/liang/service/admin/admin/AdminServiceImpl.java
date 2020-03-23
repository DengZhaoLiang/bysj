package com.liang.service.admin.admin;

import com.liang.dto.admin.admin.AdminResponse;
import com.liang.repository.admin.IAdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import generated.tables.pojos.Admin;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private IAdminRepository mIAdminRepository;

    @Override
    public Admin login(String username, String password) {
        return mIAdminRepository.login(username, password);
    }

    @Override
    public List<AdminResponse> list() {
        return mIAdminRepository.list();
    }
}
