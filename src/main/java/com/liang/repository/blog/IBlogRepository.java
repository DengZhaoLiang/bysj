package com.liang.repository.blog;

import generated_jooq.tables.pojos.Blog;
import org.jooq.Record;
import org.jooq.RecordMapper;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
public interface IBlogRepository {

    /**
     * 分页获取博客列表
     */
    <T> List<T> list(String params, Integer type, Integer articleType, RecordMapper<Record, T> mapper);

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

    /**
     * 更新博客浏览量
     */
    void updatePV(Long id, Long pv);
}
