package com.liang.DAO.blogBg;

import com.liang.utils.DSLPlusUtils;
import generated.tables.pojos.BlogBg;
import generated.tables.records.BlogBgRecord;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static generated.Tables.BLOG_BG;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
@Repository
public class BlogBgDAO implements BlogBgDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public <T> List<T> list(String params, Integer type, RecordMapper<Record, T> mapper) {
        SelectQuery<BlogBgRecord> query = mDSLContext.selectQuery(BLOG_BG);
        query.addSelect(BLOG_BG.fields());
        DSLPlusUtils.containsIfNotBlank(query, BLOG_BG.NAME, params);
        DSLPlusUtils.eqIfNotNull(query, BLOG_BG.TYPE, type);
        return query.fetch(mapper);
    }

    @Override
    public void insert(BlogBg blogBg) {
        BlogBgRecord record = mDSLContext.newRecord(BLOG_BG, blogBg);
        record.insert();
    }

    @Override
    public BlogBg detail(Long id) {
        return mDSLContext.selectFrom(BLOG_BG)
                .where(BLOG_BG.ID.eq(id))
                .fetchOneInto(BlogBg.class);
    }

    @Override
    public BlogBg detail(Integer type) {
        return mDSLContext.selectFrom(BLOG_BG)
                .where(BLOG_BG.TYPE.eq(type))
                .fetchOneInto(BlogBg.class);
    }

    @Override
    public void update(BlogBg blogBg) {
        BlogBgRecord record = mDSLContext.newRecord(BLOG_BG, blogBg);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(BLOG_BG)
                .where(BLOG_BG.ID.eq(id))
                .execute();
    }
}
