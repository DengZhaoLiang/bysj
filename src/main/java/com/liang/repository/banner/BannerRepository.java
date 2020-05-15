package com.liang.repository.banner;

import com.liang.DAO.banner.BannerDbStrategy;
import com.liang.dto.admin.banner.AdminBannerResponse;
import generated_jooq.tables.pojos.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Repository
@Primary
public class BannerRepository implements IBannerRepository {

    @Autowired
    private BannerDbStrategy mBannerDbStrategy;

    @Override
    public List<AdminBannerResponse> list(String params) {
        return mBannerDbStrategy.list(params);
    }

    @Override
    public void insert(Banner banner) {
        mBannerDbStrategy.insert(banner);
    }

    @Override
    public Banner detail(Long id) {
        return mBannerDbStrategy.detail(id);
    }

    @Override
    public void update(Banner banner) {
        mBannerDbStrategy.update(banner);
    }

    @Override
    public void delete(Long id) {
        mBannerDbStrategy.delete(id);
    }

    @Override
    public List<Banner> list() {
        return mBannerDbStrategy.list();
    }
}
