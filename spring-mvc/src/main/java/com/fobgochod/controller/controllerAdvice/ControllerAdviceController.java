package com.fobgochod.controller.controllerAdvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用@ControllerAdvice注解的Controller是一个增强的Controller，主要有三个功能
 * <ol>
 *     <li>全局异常处理 {@link ExceptionHandler}</li>
 *     <li>全局数据绑定 {@link InitBinder}</li>
 *     <li>全局数据预处理 {@link ModelAttribute}</li>
 * </ol>
 *
 * @author Xiao
 * @date 2021/9/24 0:41
 */
@ControllerAdvice
public class ControllerAdviceController {

    //全局异常处理
    @ExceptionHandler(Exception.class)
    public ModelAndView globalException(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Global Exception Handler Error");
        mv.setViewName("error");
        return mv;
    }

    // 全局数据绑定
    @ModelAttribute(name = "gd")
    public Map<String, Object> globalData() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("password", 9999);
        map.put("gender", "男");
        return map;
    }

    @InitBinder("a")
    public void globalA(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

    @InitBinder("b")
    public void globalB(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }
}
