package com.liang.controller.api;

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
@RequestMapping("/bysj/api")
@Api(tags = "1. 通用接口")
@Validated
public class ApiCommonController {

    @ApiOperation("站点首页")
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
