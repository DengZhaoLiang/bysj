package com.liang.service.api.blogBg;
import generated.tables.pojos.BlogBg;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
public interface BlogBgService {
    /**
     * 获取博客背景图
     */
    BlogBg detailBlogBg(Integer type);
}
