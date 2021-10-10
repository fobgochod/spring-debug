package com.fobgochod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 拦截器
 *
 * @author Xiao
 * @date 2021/9/28 21:48
 */
@Controller
public class HandlerInterceptorController {

    @RequestMapping("/interceptor")
    public String getFormatDate() {
        return "success";
    }
}
