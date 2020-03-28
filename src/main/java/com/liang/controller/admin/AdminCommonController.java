package com.liang.controller.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@Controller
@RequestMapping("/bysj/admin")
@Api(tags = "1. 通用接口")
@Validated
public class AdminCommonController {

    @ApiOperation("后台管理首页")
    @GetMapping("/index")
    public String index() {
        return "admin/index";
    }
}
