package com.caigentan.spring.thymeleaf.controller;

import com.caigentan.spring.thymeleaf.mobilize.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoopProgram {
    @RequestMapping("/loop")
    public String Loop(Model model) {
        Person person1 = new Person("bill", 21, "@163");
        Person person2 = new Person(null, 0, "@139");
        Person person3 = new Person("ali", 21, "@189");
        String str = "11";
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        model.addAttribute("plist",list);
        model.addAttribute("str",str);

        return "thymeleafloop";

    }
}
