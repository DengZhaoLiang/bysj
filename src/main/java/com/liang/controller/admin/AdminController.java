package com.liang.controller.admin;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.admin.AdminPageResponse;
import com.liang.dto.admin.admin.AdminResponse;
import com.liang.service.admin.admin.AdminService;
import generated.tables.pojos.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Liang
 * com.liang.controller.admin AdminLoginController  2020/3/8 0008  Liang
 */
@Controller
@RequestMapping("/bysj/admin")
@Api(tags = "1. 管理员管理")
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
    public String page(Model model, Pageable pageable) {
        AdminPageResponse response = mAdminService.page(pageable);
        model.addAttribute("adminList", response.getAdmin());
        model.addAttribute("page", response.getPage());
        return "admin/list";
    }
}
