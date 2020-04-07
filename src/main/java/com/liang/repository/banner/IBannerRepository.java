package com.liang.repository.banner;

import com.liang.dto.admin.banner.AdminBannerResponse;
import generated.tables.pojos.Banner;
import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
public interface IBannerRepository {
    /**
     * 搜索轮播图标题获取列表
     */
    List<AdminBannerResponse> list(String params);

    /**
     * 新增轮播图
     */
    void insert(Banner banner);

    /**
     * 获取轮播图详情
     */
    Banner detail(Long id);

    /**
     * 修改轮播图
     */
    void update(Banner banner);

    /**
     * 删除轮播图
     */
    void delete(Long id);

    /**
     * 获取所有的轮播图
     */
    List<Banner> list();
}
