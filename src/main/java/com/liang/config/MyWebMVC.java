package com.liang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMVC implements WebMvcConfigurer {

    /**
     * admin 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new AdminIntreceptor())
               .addPathPatterns("/bysj/admin/**")
               .excludePathPatterns("/bysj/admin/login")
               .excludePathPatterns("/bysj/admin/doLogin")
               .excludePathPatterns("/login","/css/*","/img/*","/js/*");
    }

    //视图跳转控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/bysj/admin/login").setViewName("admin/login");
    }




}
