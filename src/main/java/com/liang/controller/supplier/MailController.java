package com.liang.controller.supplier;

import com.liang.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang
 * MailController  2020/1/30 0030 15:22 Liang
 */
@RestController
public class MailController {

    @Autowired
    private SendMailService mail;

    @GetMapping("/simpleSend")
    public String simpleSend() {
        mail.simpleSend(
                "@Async注解",
                "异步任务测试邮件",
                "386229680@qq.com",
                "386229680@qq.com");
        return "OK";
    }
}
