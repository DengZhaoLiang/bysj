package com.liang.DAO.banner;

import com.liang.dto.admin.banner.AdminBannerResponse;
import com.liang.utils.DSLPlusUtils;
import generated.tables.pojos.Banner;
import generated.tables.records.BannerRecord;
import org.jooq.DSLContext;
import org.jooq.JoinType;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static generated.Tables.BANNER;
import static generated.Tables.BLOG;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Repository
public class BannerDAO implements BannerDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public List<AdminBannerResponse> list(String params) {
        SelectQuery<BannerRecord> query = mDSLContext.selectQuery(BANNER);
        query.addSelect(BANNER.fields());
        DSLPlusUtils.containsIfNotBlank(query, BANNER.NAME, params);
        //左联博客表
        query.addJoin(BLOG, JoinType.LEFT_OUTER_JOIN, BLOG.ID.eq(BANNER.BLOG_ID));
        query.addSelect(BLOG.NAME.as("blog"));
        return query.fetchInto(AdminBannerResponse.class);
    }

    @Override
    public void insert(Banner banner) {
        BannerRecord record = mDSLContext.newRecord(BANNER, banner);
        record.insert();
    }

    @Override
    public Banner detail(Long id) {
        return mDSLContext.selectFrom(BANNER)
                .where(BANNER.ID.eq(id))
                .fetchOneInto(Banner.class);
    }

    @Override
    public void update(Banner banner) {
        BannerRecord record = mDSLContext.newRecord(BANNER, banner);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(BANNER)
                .where(BANNER.ID.eq(id))
                .execute();
    }

    @Override
    public List<Banner> list() {
        return mDSLContext.selectFrom(BANNER)
                .fetchInto(Banner.class);
    }
}
