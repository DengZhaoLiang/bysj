package com.liang.controller.admin;

import com.liang.service.admin.admin.AdminService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Liang
 * com.liang.controller.admin AdminLoginController  2020/3/8 0008  Liang
 */
@Controller
@RequestMapping("/bysj/admin")
public class AdminLoginController {

    @Autowired
    private AdminService mAdminService;

    @GetMapping("/doLogin")
    public String doLogin(String username,
                        String password,
                        HttpSession session,
                        Model model){
        String name = mAdminService.login(username, password);
        if (name!=null && name.length()>0){
            session.setAttribute("Admin",name);
            return "redirect:/bysj/admin/index";
        }else {
            model.addAttribute("loginMSG","用户名或密码错误,请重新输入!");
            return "admin/login";
        }
    }

    @GetMapping("/index")
    public String index(){
        return "admin/index";
    }
}
