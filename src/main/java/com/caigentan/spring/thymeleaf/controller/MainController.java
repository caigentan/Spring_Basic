package com.caigentan.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/execinfo")
    public String execinfoProgram(){
        return "execinfo";
    }

    @RequestMapping("/uris")
    public String urisProgram(){
        return "uris";
    }

    @RequestMapping("/dates")
    public String datesProgram(){
        return "dates";
    }

    @RequestMapping("/numbers")
    public String numbersProgram(){
        return "numbers";
    }

    @RequestMapping("/objects")
    public String objectsProgram(Model model){
        String[] countries = {"China", "Korea", "Vietnam", null, "Japan", "America"};
        model.addAttribute("countries", countries);
        return "objects";
    }
}
