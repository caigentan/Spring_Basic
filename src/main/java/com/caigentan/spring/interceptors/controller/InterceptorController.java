package com.caigentan.spring.interceptors.controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping(value = {"/interceptorTest"})
    public String test(Model model) {
        System.out.println("\n-------- MainController.test --- ");
        System.out.println(" ** You are in Controller ** ");
        return "interceptorTest";
    }

    @Deprecated
    @RequestMapping("/admin/oldLogin")
    public String oldLogin(Model model) {
         return "interceptorOldLogin";
    }

    @RequestMapping("admin/login")
    public String login(Model model) {
        System.out.println("\n-------- MainController.login --- ");
        System.out.println(" ** You are in Controller ** ");
        return "interceptorLogin";
    }

    @RequestMapping("admin/adminPage")
    public String adminPage(){
        return "interceptorAdmin";
    }
}
