package com.liang.controller.api;

import com.liang.controller.supplier.UploadController;
import com.liang.service.LoginService;
import generated_jooq.tables.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/bysj")
@Validated
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UploadController mUploadController;

    @GetMapping("/doLogin")
    public String login(String username,
                        String password,
                        HttpSession session,
                        Model model) {
        User user = loginService.login(username, password);
        if (!ObjectUtils.nullSafeEquals(null, user)) {
            session.setAttribute("user", user);
            //设置最近登录时间
            loginService.setLastLoginTime(user);
            return "redirect:/bysj/community/";
        } else {
            model.addAttribute("loginMSG", "用户名或密码错误,请重新输入!");
            return "api/login";
        }
    }

    @PostMapping("/doRegister")
    public String register(User user, MultipartFile file, Model model) {
        String relative = mUploadController.GGupload(file);
        user.setAvatar(relative);
        if (loginService.existByPhone(user.getPhone())) {
            model.addAttribute("registerMSG", "该手机号已被使用注册！");
            return "api/register";
        }
        if (loginService.existByEmail(user.getEmail())) {
            model.addAttribute("registerMSG", "该邮箱已被使用注册！");
            return "api/register";
        }
        loginService.register(user);
        return "api/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session,
                         Model model) {
        session.invalidate();
        model.addAttribute("msg", "没有权限,请重新登录!");
        return "redirect:/bysj/login";
    }

}
