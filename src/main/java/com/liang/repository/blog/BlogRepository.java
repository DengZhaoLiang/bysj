package com.liang.repository.blog;

import com.liang.DAO.blog.BlogDbStrategy;
import generated.tables.pojos.Blog;
import java.util.List;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
@Repository
@Primary
public class BlogRepository implements IBlogRepository {

    @Autowired
    private BlogDbStrategy mBlogDbStrategy;


    @Override
    public <T> List<T> list(String params, Integer type, Integer articleType, RecordMapper<Record, T> mapper) {
        return mBlogDbStrategy.list(params, type, articleType, mapper);
    }

    @Override
    public void insert(Blog blog) {
        mBlogDbStrategy.insert(blog);
    }

    @Override
    public Blog detail(Long id) {
        return mBlogDbStrategy.detail(id);
    }

    @Override
    public void update(Blog blog) {
        mBlogDbStrategy.update(blog);
    }

    @Override
    public void delete(Long id) {
        mBlogDbStrategy.delete(id);
    }

    @Override
    public void updatePV(Long id, Long pv) {
        mBlogDbStrategy.updatePV(id, pv);
    }
}
