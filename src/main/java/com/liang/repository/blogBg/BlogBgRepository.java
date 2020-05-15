package com.liang.repository.blogBg;

import com.liang.DAO.blogBg.BlogBgDbStrategy;
import generated_jooq.tables.pojos.BlogBg;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
@Repository
@Primary
public class BlogBgRepository implements IBlogBgRepository {

    @Autowired
    private BlogBgDbStrategy mBlogBgDbStrategy;

    @Override
    public <T> List<T> list(String params, Integer type, RecordMapper<Record, T> mapper) {
        return mBlogBgDbStrategy.list(params, type, mapper);
    }

    @Override
    public void insert(BlogBg blogBg) {
        mBlogBgDbStrategy.insert(blogBg);
    }

    @Override
    public BlogBg detail(Long id) {
        return mBlogBgDbStrategy.detail(id);
    }

    @Override
    public BlogBg detail(Integer type) {
        return mBlogBgDbStrategy.detail(type);
    }

    @Override
    public void update(BlogBg blogBg) {
        mBlogBgDbStrategy.update(blogBg);
    }

    @Override
    public void delete(Long id) {
        mBlogBgDbStrategy.delete(id);
    }
}
