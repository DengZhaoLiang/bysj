package com.liang.controller.api;

import com.liang.dto.api.blog.ApiBlogPageResponse;
import generated.tables.pojos.Banner;
import generated.tables.pojos.Blog;
import generated.tables.pojos.BlogBg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Autowired
    private ApiBlogController mApiBlogController;

    @Autowired
    private ApiBlogBgController mApiBlogBgController;

    @ApiOperation("站点首页")
    @GetMapping("/index")
    public String index(Model model) {
        List<Banner> banners = mApiBannerController.listBanners();
        model.addAttribute("banners",banners);
        return "api/index";
    }

    @ApiOperation("博客列表")
    @GetMapping("/blog")
    public String listBlog(
            Model model,
            HttpServletRequest request,
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type,
            @ApiParam(allowableValues = "1,2,3")
            @RequestParam(required = false) Integer articleType) {
        BlogBg blogBg = mApiBlogBgController.detailBlogBg(type);
        model.addAttribute("blogBg",blogBg);

        ApiBlogPageResponse response = mApiBlogController.listBlog(pageable,params,type,articleType);
        model.addAttribute("listBlog",response.getBlog());
        model.addAttribute("page",response.getPage());
        model.addAttribute("all",response.getAll());
        model.addAttribute("news",response.getNews());
        model.addAttribute("teaching",response.getTeaching());
        model.addAttribute("information",response.getInformation());
        model.addAttribute("latest",response.getLatest());

        request.getSession().setAttribute("blogType",type);
        return "api/blog-list";
    }

    @ApiOperation("博客")
    @GetMapping("/blog/{id}")
    public String blog(
            Model model,
            @PathVariable Long id) {
        Blog blog = mApiBlogController.detailBlog(id);
        model.addAttribute("blog",blog);
        return "api/blog";
    }

    @ApiOperation("垃圾分类知识")
    @GetMapping("/knowledge")
    public String knowledge() {
        return "api/knowledge";
    }
}
