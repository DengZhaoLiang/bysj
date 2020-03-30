package com.liang.repository.blog;

import com.liang.dto.admin.blog.AdminBlogResponse;
import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
public interface IBlogRepository {

    /**
     * 分页获取博客列表
     */
    List<AdminBlogResponse> list(String params, Integer type);

    /**
     * 新增博客
     */
    void insert(generated.tables.pojos.Blog blog);
}
