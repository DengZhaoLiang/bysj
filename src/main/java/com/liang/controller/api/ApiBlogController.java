package com.liang.controller.api;

import com.liang.dto.api.blog.ApiBlogPageResponse;
import com.liang.service.api.blog.BlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import generated.tables.pojos.Blog;

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
    public ApiBlogPageResponse listBlog(
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type,
            @ApiParam(allowableValues = "1,2,3")
            @RequestParam(required = false) Integer articleType) {
        return mBlogService.listBlog(params, type, articleType, pageable);
    }

    @ApiOperation("获取博客详情")
    public Blog detailBlog(@PathVariable Long id) {
        return mBlogService.detailBlog(id);
    }
}
