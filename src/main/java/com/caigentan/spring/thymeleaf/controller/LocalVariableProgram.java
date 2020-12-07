package com.caigentan.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocalVariableProgram {
    @RequestMapping("localVar")
    public String localVariable(Model model) {
        String[] countries = new String[]{"中国", "越南", "古巴", "朝鲜"};
        model.addAttribute("countries", countries);
        return "localvariable";
    }
}
