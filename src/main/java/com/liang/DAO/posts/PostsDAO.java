package com.liang.DAO.posts;

import com.liang.dto.api.post.PostResponse;
import com.liang.utils.DSLPlusUtils;
import generated_jooq.tables.pojos.Posts;
import generated_jooq.tables.records.PostsRecord;
import org.jooq.DSLContext;
import org.jooq.JoinType;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static generated_jooq.Tables.POSTS;
import static generated_jooq.Tables.USER;

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
    public void check(Long id, Integer check) {
        mDSLContext.update(POSTS)
                .set(POSTS.CHECK, check)
                .where(POSTS.ID.eq(id))
                .execute();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(POSTS)
                .where(POSTS.ID.eq(id))
                .execute();
    }

    @Override
    public void insert(Posts posts) {
        PostsRecord record = mDSLContext.newRecord(POSTS, posts);
        record.insert();
    }

    @Override
    public List<PostResponse> page(String params) {
        SelectQuery<PostsRecord> query = mDSLContext.selectQuery(POSTS);
        query.addSelect(POSTS.fields());
        DSLPlusUtils.containsIfNotBlank(query, POSTS.NAME, params);
        query.addJoin(USER, JoinType.LEFT_OUTER_JOIN, USER.ID.eq(POSTS.USER_ID));
        query.addSelect(USER.NAME.as("user"), USER.AVATAR.as("avatar"));
        query.addOrderBy(POSTS.STICK.desc(), POSTS.CREATED_AT.desc());
        return query.fetchInto(PostResponse.class);
    }
}
