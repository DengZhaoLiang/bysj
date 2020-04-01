package com.liang.repository.blogBg;

import java.util.List;
import org.jooq.Record;
import org.jooq.RecordMapper;
import generated.tables.pojos.BlogBg;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
public interface IBlogBgRepository {

    /**
     * 分页获取博客背景图列表
     */
    <T> List<T> list(String params, Integer type, RecordMapper<Record,T> mapper);

    /**
     * 新增博客背景图
     */
    void insert(BlogBg blogBg);

    /**
     * 获取博客背景图详情
     */
    BlogBg detail(Long id);

    /**
     * 获取博客背景图详情
     */
    BlogBg detail(Integer type);

    /**
     * 更新博客背景图
     */
    void update(BlogBg blogBg);

    /**
     * 删除博客背景图
     */
    void delete(Long id);

}
