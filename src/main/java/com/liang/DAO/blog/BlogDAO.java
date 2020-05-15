package com.liang.DAO.blog;

import com.liang.utils.DSLPlusUtils;
import generated_jooq.tables.pojos.Blog;
import generated_jooq.tables.records.BlogRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static generated_jooq.Tables.BLOG;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
@Repository
public class BlogDAO implements BlogDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public <T> List<T> list(String params, Integer type, Integer articleType, RecordMapper<Record, T> mapper) {
        SelectQuery<BlogRecord> query = mDSLContext.selectQuery(BLOG);
        query.addSelect(BLOG.fields());
        DSLPlusUtils.containsIfNotBlank(query, BLOG.NAME, params);
        DSLPlusUtils.eqIfNotNull(query, BLOG.TYPE, type);
        DSLPlusUtils.eqIfNotNull(query, BLOG.ARTICLE_TYPE, articleType);
        return query.fetch(mapper);
    }

    @Override
    public void insert(Blog blog) {
        BlogRecord record = mDSLContext.newRecord(BLOG, blog);
        record.insert();
    }

    @Override
    public Blog detail(Long id) {
        return mDSLContext.selectFrom(BLOG)
                .where(BLOG.ID.eq(id))
                .fetchOneInto(Blog.class);
    }

    @Override
    public void update(Blog blog) {
        BlogRecord record = mDSLContext.newRecord(BLOG, blog);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(BLOG)
                .where(BLOG.ID.eq(id))
                .execute();
    }

    @Override
    public void updatePV(Long id, Long pv) {
        mDSLContext.update(BLOG)
                .set(BLOG.PV, pv)
                .where(BLOG.ID.eq(id))
                .execute();
    }
}
