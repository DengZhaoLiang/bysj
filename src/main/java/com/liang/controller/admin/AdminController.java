package com.liang.controller.admin;


import com.liang.dto.admin.admin.AdminPageResponse;
import com.liang.service.admin.admin.AdminService;
import generated_jooq.tables.pojos.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Liang
 * com.liang.controller.admin AdminLoginController  2020/3/8 0008  Liang
 */
@Controller
@RequestMapping("/bysj/admin")
@Api(tags = "2. 管理员管理")
@Validated
public class AdminController {

    @Autowired
    private AdminService mAdminService;

    @ApiOperation("管理员登录逻辑")
    @GetMapping("/doLogin")
    public String doLogin(String username,
                          String password,
                          HttpSession session,
                          Model model) {
        Admin admin = mAdminService.login(username, password);
        if (!ObjectUtils.nullSafeEquals(null, admin)) {
            session.setAttribute("Admin", admin);
            return "redirect:/bysj/admin/index";
        } else {
            model.addAttribute("loginMSG", "用户名或密码错误,请重新输入!");
            return "admin/login";
        }
    }

    @ApiOperation("分页获取管理员列表")
    @GetMapping("")
    public String page(
            Model model,
            Pageable pageable,
            @RequestParam(required = false) String params) {
        AdminPageResponse response = mAdminService.page(pageable, params);
        model.addAttribute("adminList", response.getAdmin());
        model.addAttribute("page", response.getPage());
        model.addAttribute("params", params);
        return "admin/list";
    }

    @ApiOperation("跳转到管理员添加页面")
    @GetMapping("/insert")
    public String insert() {
        return "admin/add";
    }

    @ApiOperation("添加管理员逻辑")
    @PostMapping("/doInsert")
    public String doInsert(Admin admin) {
        mAdminService.insert(admin);
        return "redirect:/bysj/admin/";
    }

    @ApiOperation("跳转到管理员修改页面")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         Model model) {
        Admin admin = mAdminService.detail(id);
        model.addAttribute("this", admin);
        return "admin/update";
    }

    @ApiOperation("修改管理员逻辑")
    @PostMapping("/doUpdate")
    public String doUpdate(Admin admin) {
        mAdminService.update(admin);
        return "redirect:/bysj/admin/";
    }

    @ApiOperation("删除管理员逻辑")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        mAdminService.delete(id);
        return "redirect:/bysj/admin/";
    }

    @ApiOperation("管理员退出登录")
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("Admin");
        return "admin/login";
    }
}
