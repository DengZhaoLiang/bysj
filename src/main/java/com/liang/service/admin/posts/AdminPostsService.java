package com.liang.service.admin.posts;

import com.liang.dto.admin.posts.AdminPostsPageResponse;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/4/8
 **/
public interface AdminPostsService {

    /**
     * 分页获取帖子列表
     */
    AdminPostsPageResponse page(Integer check, Integer type, Pageable pageable);
}
