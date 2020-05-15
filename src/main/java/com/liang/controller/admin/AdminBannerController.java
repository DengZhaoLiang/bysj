package com.liang.controller.admin;

import com.liang.controller.supplier.UploadController;
import com.liang.dto.admin.banner.AdminBannerPageResponse;
import com.liang.service.admin.banner.AdminBannerService;
import generated_jooq.tables.pojos.Banner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Controller
@RequestMapping("/bysj/admin/banner")
@Api(tags = "4. 轮播图管理")
@Validated
public class AdminBannerController {

    @Autowired
    private AdminBannerService mAdminBannerService;

    @Autowired
    private UploadController mUploadController;

    @ApiOperation("分页获取轮播图列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params) {
        AdminBannerPageResponse response = mAdminBannerService.page(pageable, params);
        model.addAttribute("bannerList", response.getBanner());
        model.addAttribute("page", response.getPage());
        model.addAttribute("params", params);
        return "banner/list";
    }

    @ApiOperation("跳转到轮播图添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "banner/add";
    }

    @ApiOperation("添加轮播图逻辑")
    @PostMapping("/doInsert")
    public String doInsert(Banner banner, MultipartFile file) {
        String relative = mUploadController.GGupload(file);
        banner.setImg(relative);
        mAdminBannerService.insert(banner);
        return "redirect:/bysj/admin/banner/";
    }

    @ApiOperation("跳转到轮播图修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        Banner banner = mAdminBannerService.detail(id);
        model.addAttribute("this", banner);
        return "banner/update";
    }

    @ApiOperation("修改轮播图逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(Banner banner, MultipartFile file) {
        if (!ObjectUtils.nullSafeEquals(null, file)) {
            String relative = mUploadController.GGupload(file);
            banner.setImg(relative);
        }
        mAdminBannerService.update(banner);
        return "redirect:/bysj/admin/banner/";
    }

    @ApiOperation("删除轮播图逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminBannerService.delete(id);
        return "redirect:/bysj/admin/banner/";
    }
}
