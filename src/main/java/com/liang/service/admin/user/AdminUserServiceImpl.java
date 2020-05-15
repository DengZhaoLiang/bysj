package com.liang.service.admin.user;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.user.AdminUserPageResponse;
import com.liang.dto.admin.user.AdminUserResponse;
import com.liang.repository.user.IUserRepository;
import com.liang.utils.PageUtils;
import generated_jooq.tables.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private IUserRepository mIUserRepository;

    @Override
    public AdminUserPageResponse page(Pageable pageable, String params) {
        List<AdminUserResponse> page = mIUserRepository.list(params);
        /**
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminUserResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminUserResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);

        AdminUserPageResponse response = new AdminUserPageResponse();
        response.setUser(list);
        response.setPage(pageResponse);
        return response;
    }

    @Override
    public void insert(User user) {
        mIUserRepository.insert(user);
    }

    @Override
    public User detail(Long id) {
        return mIUserRepository.detail(id);
    }

    @Override
    public void update(User user) {
        user.setUpdatedAt(LocalDateTime.now());
        mIUserRepository.update(user);
    }

    @Override
    public void delete(Long id) {
        mIUserRepository.delete(id);
    }

    @Override
    public void reset(Long id) {
        mIUserRepository.reset(id);
    }
}
