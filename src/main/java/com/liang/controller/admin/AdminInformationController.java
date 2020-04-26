package com.liang.controller.admin;

import com.liang.controller.supplier.UploadController;
import com.liang.dto.admin.information.AdminInformationPageResponse;
import com.liang.service.admin.information.AdminInformationService;
import generated.tables.pojos.Information;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
@Controller
@RequestMapping("/bysj/admin/information")
@Api(tags = "7. 资讯管理")
@Validated
public class AdminInformationController {

    @Autowired
    private AdminInformationService mAdminInformationService;

    @Autowired
    private UploadController mUploadController;

    @ApiOperation("分页获取资讯列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(value = "资讯类型 1-可回收 2-有害 3-干 4-湿 5-厨余 6-其它",allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        AdminInformationPageResponse response = mAdminInformationService.page(params, type, pageable);
        model.addAttribute("informationList", response.getInformation());
        model.addAttribute("page", response.getPage());
        model.addAttribute("params", params);
        return "information/list";
    }

    @ApiOperation("跳转到资讯添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "information/add";
    }

    @ApiOperation("添加资讯逻辑")
    @PostMapping("/doInsert")
    public String doInsert(Information information,
                           MultipartFile file,
                           MultipartFile imgFile) {
        String relative = mUploadController.videoUpload(file);
        information.setVideo(relative);
        relative = mUploadController.GGupload(imgFile);
        information.setImg(relative);
        mAdminInformationService.insert(information);
        return "redirect:/bysj/admin/information/";
    }

    @ApiOperation("跳转到资讯修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        Information information = mAdminInformationService.detail(id);
        model.addAttribute("this", information);
        return "information/update";
    }

    @ApiOperation("修改资讯逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(Information information) {
        mAdminInformationService.update(information);
        return "redirect:/bysj/admin/information/";
    }

    @ApiOperation("删除博客背景图逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminInformationService.delete(id);
        return "redirect:/bysj/admin/information/";
    }

}
