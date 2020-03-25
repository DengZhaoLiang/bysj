package com.liang.service.admin.admin;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.admin.AdminPageResponse;
import com.liang.dto.admin.admin.AdminResponse;
import com.liang.repository.admin.IAdminRepository;
import com.liang.utils.PageUtils;
import generated.tables.pojos.Admin;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
    public AdminPageResponse page(Pageable pageable) {

        List<AdminResponse> page = mIAdminRepository.list();
        /**
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        AdminPageResponse response = new AdminPageResponse();
        response.setAdmin(list);
        response.setPage(pageResponse);
        return response;
    }
}
