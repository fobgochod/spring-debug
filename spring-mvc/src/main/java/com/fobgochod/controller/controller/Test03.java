package com.fobgochod.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test03 {

    @RequestMapping("/test03")
    public ModelAndView test03() {
        return new ModelAndView("success", "message", "@Controller注解");
    }
}
