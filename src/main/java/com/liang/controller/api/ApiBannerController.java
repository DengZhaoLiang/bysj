package com.liang.controller.api;

import com.liang.service.api.banner.BannerService;
import generated.tables.pojos.Banner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@RestController
@RequestMapping("/bysj/api/banner")
@Api(tags = "2. 轮播图api")
@Validated
public class ApiBannerController {

    @Autowired
    private BannerService mBannerService;

    @ApiOperation("获取轮播图列表")
    @GetMapping("")
    public List<Banner> listBanners() {
        return mBannerService.listBanners();
    }
}
