package com.cqu.store_admin.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;


@Configuration  //加载当前的拦截器并进行注册
//处理器拦截器的注册
public class LoginInterceptorConfigurer implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOriginPatterns("*").allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS").allowCredentials(true).maxAge(3600);
    }

}
