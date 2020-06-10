package com.example.demo.config;

import com.example.demo.handler.LoginHandler;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration loginHandlerConfig = registry.addInterceptor(new LoginHandler());
        loginHandlerConfig.addPathPatterns("/**")
                .excludePathPatterns("/toLogin", "/login");

    }
}
