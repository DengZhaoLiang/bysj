package com.liang.controller.api;

import com.liang.service.api.blogBg.BlogBgService;
import generated_jooq.tables.pojos.BlogBg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/bysj/api/blog/bg")
@Api(tags = "4. 博客背景图api")
@Validated
public class ApiBlogBgController {

    @Autowired
    private BlogBgService mBlogBgService;

    @ApiOperation("获取博客背景图详情")
    @GetMapping("")
    public BlogBg detailBlogBg(
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        return mBlogBgService.detailBlogBg(type);
    }
}
