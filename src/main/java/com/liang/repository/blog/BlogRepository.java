package com.liang.repository.blog;

import com.liang.DAO.blog.BlogDbStrategy;
import com.liang.dto.admin.blog.AdminBlogResponse;
import generated.tables.pojos.Blog;
import java.util.List;
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
    public List<AdminBlogResponse> list(String params, Integer type) {
        return mBlogDbStrategy.list(params, type);
    }

    @Override
    public void insert(Blog blog) {
        mBlogDbStrategy.insert(blog);
    }
}
