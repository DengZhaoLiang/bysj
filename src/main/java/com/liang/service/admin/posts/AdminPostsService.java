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

    /**
     * 置顶/取消置顶
     */
    void stick(Long id,Integer stick);

    /**
     * 通过审核
     */
    void check(Long id);

    /**
     * 删除帖子
     */
    void delete(Long id);
}
