package com.liang.controller.api;

import com.liang.dto.api.blog.ApiBlogPageResponse;
import com.liang.service.api.banner.BannerService;
import com.liang.service.api.blog.BlogService;
import generated.tables.pojos.Banner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@RestController
@RequestMapping("/bysj/blog")
@Api(tags = "3. 博客api")
@Validated
public class ApiBlogController {

    @Autowired
    private BlogService mBlogService;

    @ApiOperation("获取博客列表")
    @GetMapping("/list")
    public ApiBlogPageResponse listBlog(
            Pageable pageable,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        return mBlogService.listBlog(type,pageable);
    }
}
