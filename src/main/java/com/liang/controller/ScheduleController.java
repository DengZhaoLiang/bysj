package com.liang.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Liang
 * @Description ScheduleCtroller  2020/1/30 0030 16:58 Liang
 */
@Controller
public class ScheduleController {

    /**
     * 定时任务调度示例
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
}
