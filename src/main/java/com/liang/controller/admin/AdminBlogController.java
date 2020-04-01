package com.liang.controller.admin;

import com.liang.dto.admin.blog.AdminBlogPageResponse;
import com.liang.service.admin.blog.AdminBlogService;
import generated.tables.pojos.Blog;
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

/**
 * @author Liang
 * Created By 2020/3/28
 **/
@Controller
@RequestMapping("/bysj/admin/blog")
@Api(tags = "5. 博客管理")
@Validated
public class AdminBlogController {

    @Autowired
    private AdminBlogService mAdminBlogService;

    @ApiOperation("分页获取博客列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        AdminBlogPageResponse response=mAdminBlogService.page(params,type,pageable);
        model.addAttribute("blogList",response.getBlog());
        model.addAttribute("page",response.getPage());
        return "blog/list";
    }

    @ApiOperation("跳转到博客详情页面")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id,
                         Model model) {
        Blog blog = mAdminBlogService.detail(id);
        model.addAttribute("this", blog);
        return "blog/detail";
    }

    @ApiOperation("跳转到博客添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "blog/add";
    }

    @ApiOperation("添加博客逻辑")
    @PostMapping("/doInsert")
    public String doInsert(Blog blog) {
        mAdminBlogService.insert(blog);
        return "redirect:/bysj/admin/blog/";
    }

    @ApiOperation("跳转到博客修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        Blog blog = mAdminBlogService.detail(id);
        model.addAttribute("this", blog);
        return "blog/update";
    }

    @ApiOperation("修改博客逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(Blog blog) {
        mAdminBlogService.update(blog);
        return "redirect:/bysj/admin/blog/";
    }

    @ApiOperation("删除博客逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminBlogService.delete(id);
        return "redirect:/bysj/admin/blog/";
    }
}
