package com.liang.service.api.banner;

import java.util.List;
import generated.tables.pojos.Banner;

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
