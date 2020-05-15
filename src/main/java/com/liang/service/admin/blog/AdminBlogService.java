package com.liang.service.admin.blog;

import com.liang.dto.admin.blog.AdminBlogPageResponse;
import generated_jooq.tables.pojos.Blog;
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
    void insert(Blog blog);

    /**
     * 获取博客详情
     */
    Blog detail(Long id);

    /**
     * 更新博客
     */
    void update(Blog blog);

    /**
     * 删除博客
     */
    void delete(Long id);
}
