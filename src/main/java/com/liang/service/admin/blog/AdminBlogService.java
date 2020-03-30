package com.liang.service.admin.blog;

import com.liang.dto.admin.blog.AdminBlogPageResponse;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
public interface AdminBlogService {
    /**
     * 分页获取博客列表
     */
    AdminBlogPageResponse page(String params, Integer type, Pageable pageable);

    /**
     * 新增博客
     */
    void insert(generated.tables.pojos.Blog blog);
}
