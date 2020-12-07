package com.caigentan.spring.bootstrap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/jquery/**").//所有格下面的路径都会被配置成此路径 /jquery/**
                addResourceLocations("classpath:/META-INF/resources/webjars/jquery/3.3.1-1/");

        registry.addResourceHandler("/bootstrap/**").
                addResourceLocations("classpath:/META-INF/resources/webjars/bootstrap/4.1.1/");

        registry.addResourceHandler("/popper/**").
                addResourceLocations("classpath:/META-INF/resources/webjars/popper.js/1.14.1/");
    }
}
