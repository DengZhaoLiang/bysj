package com.liang.controller.api;

import com.liang.dto.api.post.PostPageResponse;
import com.liang.service.api.post.PostService;
import generated_jooq.tables.pojos.Posts;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

    @ApiOperation("获取所有的帖子")
    @GetMapping("")
    public PostPageResponse page(String params, Long userId, Pageable pageable) {
        return mPostService.page(params, userId, pageable);
    }

    @ApiOperation("新增帖子")
    @PostMapping("")
    public void insertPost(Posts posts) {
        mPostService.insertPost(posts);
    }
}
