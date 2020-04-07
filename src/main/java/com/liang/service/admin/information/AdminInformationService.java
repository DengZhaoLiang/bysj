package com.liang.service.admin.information;

import com.liang.dto.admin.information.AdminInformationPageResponse;
import generated.tables.pojos.Information;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
public interface AdminInformationService {

    /**
     * 分页获取资讯列表
     */
    AdminInformationPageResponse page(String params, Integer type, Pageable pageable);

    /**
     * 新增资讯
     */
    void insert(Information information);

    /**
     * 获取资讯详情
     */
    Information detail(Long id);

    /**
     * 修改资讯
     */
    void update(Information information);

    /**
     * 删除资讯
     */
    void delete(Long id);
}
