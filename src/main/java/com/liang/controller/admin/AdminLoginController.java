package com.liang.controller.admin;

import com.liang.dto.admin.admin.AdminResponse;
import com.liang.service.admin.admin.AdminService;
import generated.tables.pojos.Admin;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
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
        Admin admin = mAdminService.login(username, password);
        if (!ObjectUtils.nullSafeEquals(null,admin)){
            session.setAttribute("Admin",admin);
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

    /**
     * 获取管理员列表
     */
    @GetMapping("")
    public String list(Model model){
        List<AdminResponse> list=mAdminService.list();
        model.addAttribute("adminList",list);
        return "admin/list";
    }
}
