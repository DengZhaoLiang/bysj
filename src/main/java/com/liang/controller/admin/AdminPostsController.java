package com.liang.controller.admin;

import com.liang.dto.admin.posts.AdminPostsPageResponse;
import com.liang.service.admin.posts.AdminPostsService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Liang
 * Created By 2020/4/8
 **/
@Controller
@RequestMapping("/bysj/admin/posts")
@Api(tags = "8. 帖子管理")
@Validated
public class AdminPostsController {

    @Autowired
    private AdminPostsService mAdminPostsService;

    @ApiOperation("分页获取帖子列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @ApiParam("帖子状态 1-可评论 0-已完贴")
            @RequestParam(required = false) Integer type,
            @ApiParam("审核状态 0-拒绝 1-通过")
            @RequestParam(required = false) Integer check) {
        AdminPostsPageResponse response = mAdminPostsService.page(check, type, pageable);
        model.addAttribute("postsList", response.getPosts());
        model.addAttribute("page", response.getPage());

        return "posts/list";
    }

    @ApiOperation("置顶/取消置顶")
    @GetMapping("/stick/{id}/{stick}")
    public String stick(@PathVariable Long id, @PathVariable Integer stick) {
        mAdminPostsService.stick(id, stick);
        return "redirect:/bysj/admin/posts/";
    }

    @ApiOperation("通过审核")
    @GetMapping("/check/{id}")
    public String check(@PathVariable Long id) {
        mAdminPostsService.check(id);
        return "redirect:/bysj/admin/posts/";
    }

    @ApiOperation("删除帖子")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminPostsService.delete(id);
        return "redirect:/bysj/admin/posts/";
    }
}
