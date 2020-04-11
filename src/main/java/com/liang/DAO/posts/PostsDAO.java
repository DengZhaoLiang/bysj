package com.liang.DAO.posts;

import com.liang.utils.DSLPlusUtils;
import generated.tables.records.PostsRecord;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static generated.Tables.POSTS;

/**
 * @author Liang
 * Created By 2020/4/8
 **/
@Repository
public class PostsDAO implements PostsDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public <T> List<T> list(Integer check, Integer type, RecordMapper<Record, T> mapper) {
        SelectQuery<PostsRecord> query = mDSLContext.selectQuery(POSTS);
        query.addSelect(POSTS.fields());
        DSLPlusUtils.eqIfNotNull(query, POSTS.CHECK, check);
        DSLPlusUtils.eqIfNotNull(query, POSTS.TYPE, type);
        query.addOrderBy(POSTS.STICK.desc(), POSTS.CREATED_AT.desc());
        return query.fetch(mapper);
    }

    @Override
    public void stick(Long id, Integer stick) {
        mDSLContext.update(POSTS)
                .set(POSTS.STICK, stick)
                .where(POSTS.ID.eq(id))
                .execute();
    }

    @Override
    public void check(Long id) {
        mDSLContext.update(POSTS)
                .set(POSTS.CHECK, 1)
                .where(POSTS.ID.eq(id))
                .execute();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(POSTS)
                .where(POSTS.ID.eq(id))
                .execute();
    }
}
