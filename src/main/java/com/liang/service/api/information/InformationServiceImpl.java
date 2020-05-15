package com.liang.service.api.information;

import com.liang.dto.PageResponse;
import com.liang.dto.api.information.ApiInformationPageResponse;
import com.liang.dto.api.information.ApiInformationResponse;
import com.liang.repository.information.IInformationRepository;
import com.liang.utils.PageUtils;
import generated_jooq.tables.pojos.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private IInformationRepository mInformationRepository;

    @Override
    public Information detailInformation(Long id) {
        return mInformationRepository.detail(id);
    }

    @Override
    public ApiInformationPageResponse listInformation(String params, Integer type, Pageable pageable) {
        List<ApiInformationResponse> page = mInformationRepository.list(params, type, it -> it.into(ApiInformationResponse.class));

        page.forEach(it -> {
            switch (it.getType()) {
                case 1:
                    it.setTypeStr("可回收垃圾");
                    break;
                case 2:
                    it.setTypeStr("有害垃圾");
                    break;
                case 3:
                    it.setTypeStr("干垃圾");
                    break;
                case 4:
                    it.setTypeStr("湿垃圾");
                    break;
                case 5:
                    it.setTypeStr("厨余垃圾");
                    break;
                case 6:
                    it.setTypeStr("其它垃圾");
                    break;
                default:
                    it.setTypeStr(null);
            }
        });

        /*
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<ApiInformationResponse> list = page.stream()
                .sorted(Comparator.comparing(ApiInformationResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        ApiInformationPageResponse response = new ApiInformationPageResponse();
        response.setInformation(list);
        response.setPage(pageResponse);
        return response;
    }

    @Override
    public void updatePV(Long id, Long pv) {
        mInformationRepository.updatePV(id, pv);
    }
}
