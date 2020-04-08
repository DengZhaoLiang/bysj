package com.liang.service.admin.posts;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.posts.AdminPostsPageResponse;
import com.liang.dto.admin.posts.AdminPostsResponse;
import com.liang.repository.posts.IPostsRepository;
import com.liang.utils.PageUtils;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/4/8
 **/
@Service
public class AdminPostsServiceImpl implements AdminPostsService {

    @Autowired
    private IPostsRepository mIPostsRepository;

    @Override
    public AdminPostsPageResponse page(Integer check, Integer type, Pageable pageable) {
        List<AdminPostsResponse> page = mIPostsRepository.list(check, type, it -> it.into(AdminPostsResponse.class));

        /*
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminPostsResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminPostsResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        AdminPostsPageResponse response = new AdminPostsPageResponse();
        response.setPosts(list);
        response.setPage(pageResponse);
        return response;
    }
}
