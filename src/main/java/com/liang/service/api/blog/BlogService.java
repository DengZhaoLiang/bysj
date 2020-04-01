package com.liang.service.api.blog;

import com.liang.dto.api.blog.ApiBlogPageResponse;
import org.springframework.data.domain.Pageable;
import generated.tables.pojos.Blog;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
public interface BlogService {
    /**
     * 分页获取博客列表
     */
    ApiBlogPageResponse listBlog(String params,Integer type, Integer articleType,Pageable pageable);

    /**
     * 获取博客详情
     */
    Blog detailBlog(Long id);
}
