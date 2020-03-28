package com.liang.controller.api;

import generated.tables.pojos.Banner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@Controller
@RequestMapping("/bysj")
@Api(tags = "1. 通用接口")
@Validated
public class ApiCommonController {

    @Autowired
    private ApiBannerController mApiBannerController;

    @ApiOperation("站点首页")
    @GetMapping("/index")
    public String index(Model model) {
        List<Banner> banners = mApiBannerController.listBanners();
        model.addAttribute("banners",banners);
        return "api/index";
    }
}
