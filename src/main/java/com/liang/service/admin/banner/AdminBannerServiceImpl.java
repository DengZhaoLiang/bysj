package com.liang.service.admin.banner;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.banner.AdminBannerPageResponse;
import com.liang.dto.admin.banner.AdminBannerResponse;
import com.liang.repository.banner.IBannerRepository;
import com.liang.utils.PageUtils;
import generated.tables.pojos.Banner;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Service
public class AdminBannerServiceImpl implements AdminBannerService {

    @Autowired
    private IBannerRepository mIBannerRepository;

    @Override
    public AdminBannerPageResponse page(Pageable pageable, String params) {
        List<AdminBannerResponse> page = mIBannerRepository.list(params);
        /**
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminBannerResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminBannerResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        AdminBannerPageResponse response = new AdminBannerPageResponse();
        response.setBanner(list);
        response.setPage(pageResponse);
        return response;
    }

    @Override
    public void insert(Banner banner) {
        mIBannerRepository.insert(banner);
    }

    @Override
    public Banner detail(Long id) {
        return mIBannerRepository.detail(id);
    }

    @Override
    public void update(Banner banner) {
        banner.setUpdatedAt(LocalDateTime.now());
        mIBannerRepository.update(banner);
    }

    @Override
    public void delete(Long id) {
        mIBannerRepository.delete(id);
    }
}
