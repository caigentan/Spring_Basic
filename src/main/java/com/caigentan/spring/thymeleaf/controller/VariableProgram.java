package com.caigentan.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
//放在 SpringBasicApplication.java 同级或者下层才有作用
@Controller
public class VariableProgram {
    @GetMapping("/variable")
    public String ariableProgram(Model model, HttpServletRequest request) {
        model.addAttribute("variable1", "变量1");
        request.setAttribute("variable2", "变量2");
        return "variable";
    }
}
