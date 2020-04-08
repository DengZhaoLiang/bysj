package com.liang.service.admin.banner;

import com.liang.dto.admin.banner.AdminBannerPageResponse;
import generated.tables.pojos.Banner;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
public interface AdminBannerService {
    /**
     * 分页获取轮播图列表
     */
    AdminBannerPageResponse page(Pageable pageable, String params);

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
}
