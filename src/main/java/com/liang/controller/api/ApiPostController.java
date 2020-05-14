package com.liang.controller.api;

import com.liang.service.api.post.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import generated.tables.pojos.Posts;


/**
 * @author Liang
 * Created By 2020/3/25
 **/
@RestController
@RequestMapping("/bysj/api/post")
@Api(tags = "6. 帖子api")
@Validated
public class ApiPostController {

    @Autowired
    private PostService mPostService;

    @ApiOperation("新增帖子")
    @PostMapping("")
    public void insertPost(Posts posts) {
        mPostService.insertPost(posts);
    }
}
