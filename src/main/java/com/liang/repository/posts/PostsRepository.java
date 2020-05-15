package com.liang.repository.posts;

import com.liang.DAO.posts.PostsDbStrategy;
import com.liang.dto.api.post.PostResponse;
import generated_jooq.tables.pojos.Posts;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/4/8
 **/
@Repository
@Primary
public class PostsRepository implements IPostsRepository{

    @Autowired
    private PostsDbStrategy mPostsDbStrategy;

    @Override
    public <T> List<T> list(Integer check, Integer type, RecordMapper<Record, T> mapper) {
        return mPostsDbStrategy.list(check, type, mapper);
    }

    @Override
    public void stick(Long id, Integer stick) {
        mPostsDbStrategy.stick(id, stick);
    }

    @Override
    public void check(Long id, Integer check) {
        mPostsDbStrategy.check(id, check);
    }

    @Override
    public void delete(Long id) {
        mPostsDbStrategy.delete(id);
    }

    @Override
    public void insert(Posts posts) {
        mPostsDbStrategy.insert(posts);
    }

    @Override
    public List<PostResponse> page(String params) {
        return mPostsDbStrategy.page(params);
    }
}
