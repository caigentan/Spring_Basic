package com.caigentan.spring.bootstrap.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootstrapController {
    @RequestMapping("/bootstrap")
    public String bootstrap(Model model) {
        return "bootstrap";
    }
}
