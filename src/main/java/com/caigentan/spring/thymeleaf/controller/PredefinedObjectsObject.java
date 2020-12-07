package com.caigentan.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class PredefinedObjectsObject {
    @RequestMapping("predefined")
    public String predefinedObject(@RequestParam String name1, Model model, HttpServletRequest request){
        model.addAttribute("str","123");
        HttpSession session = request.getSession();
        session.setAttribute("sess","this is session information");
        return "predefined";
    }
}
