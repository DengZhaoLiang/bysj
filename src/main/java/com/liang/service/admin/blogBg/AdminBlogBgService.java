package com.liang.service.admin.blogBg;

import com.liang.dto.admin.blogBg.AdminBlogBgPageResponse;
import generated.tables.pojos.BlogBg;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
public interface AdminBlogBgService {
    /**
     * 分页获取博客背景图
     */
    AdminBlogBgPageResponse page(String params, Integer type, Pageable pageable);

    /**
     * 新增博客背景图
     */
    void insert(BlogBg blogBg);

    /**
     * 获取博客背景图详情
     */
    BlogBg detail(Long id);

    /**
     * 修改博客背景图
     */
    void update(BlogBg blogBg);

    /**
     * 删除博客背景图
     */
    void delete(Long id);
}
