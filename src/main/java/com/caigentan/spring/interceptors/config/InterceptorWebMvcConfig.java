package com.caigentan.spring.interceptors.config;

import com.caigentan.spring.interceptors.mobilize.AdminInterceptor;
import com.caigentan.spring.interceptors.mobilize.LogInterceptor;
import com.caigentan.spring.interceptors.mobilize.OldLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor());
        registry.addInterceptor(new OldLoginInterceptor())
                .addPathPatterns("/admin/oldLogin");
        registry.addInterceptor(new AdminInterceptor())
                .addPathPatterns("/admin/*") //拦截所有以/admin/*的访问路径，当preHandle返回为false时生效
                .excludePathPatterns("/admin/oldLogin");
    }
}
