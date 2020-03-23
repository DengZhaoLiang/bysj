package com.liang.controller;

import com.liang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @GetMapping("/login")
    public String login(String username,
                        String password,
                        HttpSession session,
                        Model model){
        String name = loginService.selectEmp(username, password);
        if (name!=null && name.length()>0){
            session.setAttribute("user",name);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","用户名或密码错误,请重新输入!");
            return "index";
        }


    }

    @GetMapping("/logout")
    public String logout(HttpSession session,
                         Model model){
        session.invalidate();
        model.addAttribute("msg","没有权限,请重新登录!");
        return "redirect:/";
    }

}
