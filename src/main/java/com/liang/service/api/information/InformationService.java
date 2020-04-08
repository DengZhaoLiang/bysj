package com.liang.service.api.information;

import com.liang.dto.api.information.ApiInformationPageResponse;
import generated.tables.pojos.Information;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
public interface InformationService {

    /**
     * 获取资讯详情
     */
    Information detailInformation(Long id);

    /**
     * 分页获取资讯列表
     */
    ApiInformationPageResponse listInformation(String params, Integer type, Pageable pageable);

    /**
     * 更新浏览量
     */
    void updatePV(Long id, Long pv);
}
