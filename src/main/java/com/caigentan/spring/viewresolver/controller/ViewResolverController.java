package com.caigentan.spring.viewresolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolverController {
    @RequestMapping("/testJsp")
    public String testJspView(){
        return "testJsp";
    }

    @RequestMapping("/testThymeleaf")
    public String testThymeleafView() {
        return "th_page1";
    }

    @RequestMapping("/testFreeMarker")
    public String testFreeMarkerView() {
        return "testFreeMarker";
    }
}
