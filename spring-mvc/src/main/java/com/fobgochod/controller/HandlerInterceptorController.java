package com.fobgochod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 拦截器
 *
 * @author fobgochod
 */
@Controller
public class HandlerInterceptorController {

    @RequestMapping("/interceptor")
    public String getFormatDate() {
        return "success";
    }
}
