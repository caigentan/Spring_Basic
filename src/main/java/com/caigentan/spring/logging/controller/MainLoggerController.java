package com.caigentan.spring.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MainLoggerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainLoggerController.class);

    @ResponseBody
    @RequestMapping("/logger")
    public String home(){
        LOGGER.trace("this is trace");
        LOGGER.debug("this is debug");
        LOGGER.info("this is info");
        LOGGER.warn("this is warn");
        LOGGER.error("this is error");

        return "Hi,Show loggings in the console or file!";
    }
}
