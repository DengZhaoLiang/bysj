package com.liang.service.admin.admin;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.admin.AdminResponse;
import com.liang.repository.admin.IAdminRepository;
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
    public PageResponse page(Pageable pageable) {

        List<AdminResponse> page = mIAdminRepository.list();
        /**
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 10;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(10)
                .collect(Collectors.toList());

        PageResponse response = new PageResponse();

        //获取当前页
        response.setCurrentPage(pageNumber);
        //获取总页数
        int totalPage = 1;
        if (!CollectionUtils.isEmpty(page)) {
            int rows = page.size();
            totalPage = (int) (rows % pageSize == 0 ? Math.ceil(rows / pageSize) : Math.ceil(rows / pageSize) + 1);
        }
        response.setTotalPage(totalPage);
        //获取上一页
        int previous = 1;
        if (pageNumber - 1 >= 1) {
            previous = pageNumber - 1;
        }
        response.setPrevious(previous);
        //获取下一页
        int next = 1;
        if (pageNumber + 1 <= totalPage) {
            next = pageNumber + 1;
        }
        response.setNext(next);
        return response;
    }
}
