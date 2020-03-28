package com.liang.service.api.banner;

import com.liang.repository.banner.IBannerRepository;
import generated.tables.pojos.Banner;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    private IBannerRepository mIBannerRepository;

    @Override
    public List<Banner> listBanners() {
        return mIBannerRepository.list();
    }
}
