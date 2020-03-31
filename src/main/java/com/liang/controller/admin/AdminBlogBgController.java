package com.liang.controller.admin;

import com.liang.controller.supplier.UploadController;
import com.liang.dto.admin.blogBg.AdminBlogBgPageResponse;
import com.liang.service.admin.blogBg.AdminBlogBgService;
import generated.tables.pojos.BlogBg;
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
 * Created By 2020/3/28
 **/
@Controller
@RequestMapping("/bysj/admin/blog/bg")
@Api(tags = "6. 博客背景图背景图管理")
@Validated
public class AdminBlogBgController {

    @Autowired
    private AdminBlogBgService mAdminBlogBgService;

    @Autowired
    private UploadController mUploadController;

    @ApiOperation("分页获取博客背景图列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        AdminBlogBgPageResponse response=mAdminBlogBgService.page(params,type,pageable);
        model.addAttribute("blogBgList",response.getBlogBg());
        model.addAttribute("page",response.getPage());
        return "blogBg/list";
    }

    @ApiOperation("跳转到博客背景图添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "blogBg/add";
    }

    @ApiOperation("添加博客背景图逻辑")
    @PostMapping("/doInsert")
    public String doInsert(BlogBg blogBg, MultipartFile file) {
        String relative = mUploadController.GGupload(file);
        blogBg.setImg(relative);
        mAdminBlogBgService.insert(blogBg);
        return "redirect:/bysj/admin/blog/bg/";
    }

    @ApiOperation("跳转到博客背景图修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        BlogBg blogBg = mAdminBlogBgService.detail(id);
        model.addAttribute("this", blogBg);
        return "blogBg/update";
    }

    @ApiOperation("修改博客背景图逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(BlogBg blogBg) {
        mAdminBlogBgService.update(blogBg);
        return "redirect:/bysj/admin/blog/bg/";
    }

    @ApiOperation("删除博客背景图逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminBlogBgService.delete(id);
        return "redirect:/bysj/admin/blog/bg/";
    }
}
