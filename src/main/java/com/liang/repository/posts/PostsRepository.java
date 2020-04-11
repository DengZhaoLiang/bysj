package com.liang.repository.posts;

import com.liang.DAO.posts.PostsDbStrategy;
import java.util.List;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

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
    public void check(Long id) {
        mPostsDbStrategy.check(id);
    }

    @Override
    public void delete(Long id) {
        mPostsDbStrategy.delete(id);
    }
}
