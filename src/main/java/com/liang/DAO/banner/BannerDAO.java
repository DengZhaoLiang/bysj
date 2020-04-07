package com.liang.DAO.banner;

import com.liang.dto.admin.banner.AdminBannerResponse;
import com.liang.utils.DSLPlusUtils;
import generated.tables.pojos.Banner;
import generated.tables.records.BannerRecord;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static generated.Tables.BANNER;

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
