package com.liang.controller.admin;

import com.liang.dto.admin.user.AdminUserPageResponse;
import com.liang.service.admin.user.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import generated.tables.pojos.User;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
@Controller
@RequestMapping("/bysj/admin/user")
@Api(tags = "3. 用户管理")
@Validated
public class UserController {

    @Autowired
    private AdminUserService mAdminUserService;

    @ApiOperation("分页获取用户列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params) {
        AdminUserPageResponse response = mAdminUserService.page(pageable, params);
        model.addAttribute("userList", response.getUser());
        model.addAttribute("page", response.getPage());
        return "user/list";
    }

    @ApiOperation("跳转到用户添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "user/add";
    }

    @ApiOperation("添加用户逻辑")
    @PostMapping("/doInsert")
    public String doInsert(User user) {
        mAdminUserService.insert(user);
        return "redirect:/bysj/admin/user/";
    }

    @ApiOperation("跳转到用户修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        User user = mAdminUserService.detail(id);
        model.addAttribute("this", user);
        return "user/update";
    }

    @ApiOperation("修改用户逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(User user) {
        mAdminUserService.update(user);
        return "redirect:/bysj/admin/user/";
    }

    @ApiOperation("删除用户逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminUserService.delete(id);
        return "redirect:/bysj/admin/user/";
    }

    @ApiOperation("重置用户密码")
    @GetMapping("/reset/{id}")
    public String reset(@PathVariable Long id) {
        mAdminUserService.reset(id);
        return "redirect:/bysj/admin/user/";
    }
}
