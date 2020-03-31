package com.liang.service.api.blog;

import com.liang.dto.api.blog.ApiBlogPageResponse;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
public interface BlogService {
    /**
     * 分页获取博客列表
     */
    ApiBlogPageResponse listBlog(Integer type, Pageable pageable);
}
