package com.liang.repository.blog;

import com.liang.dto.admin.blog.AdminBlogResponse;
import java.util.List;
import generated.tables.pojos.Blog;
import org.jooq.Record;
import org.jooq.RecordMapper;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
public interface IBlogRepository {

    /**
     * 分页获取博客列表
     */
    <T> List<T> list(String params, Integer type, RecordMapper<Record,T> mapper);

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
