package com.liang.service.api.banner;

import generated.tables.pojos.Banner;
import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
public interface BannerService {
    /**
     * 获取所有的轮播图
     */
    List<Banner> listBanners();
}
