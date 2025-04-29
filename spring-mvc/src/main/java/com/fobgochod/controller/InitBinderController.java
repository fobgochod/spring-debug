package com.fobgochod.controller;

import com.fobgochod.bean.Student;
import com.fobgochod.bean.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * InitBinder注解作用于Controller中的方法，表示为当前控制器注册一个属性编辑器
 * 对webDataBinder进行初始化且只对当前的Controller有效
 *
 * @author fobgochod
 */
@Controller
public class InitBinderController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 类型转换
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }

    @RequestMapping("/param")
    public String getFormatDate(Date date, Map<String, Object> map) {
        map.put("name", "zhangsan");
        map.put("age", 12);
        map.put("date", date);
        return "success";
    }


    @InitBinder("user")
    public void init1(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("u.");
    }

    @InitBinder("stu")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("s.");
    }

    @RequestMapping("/param2")
    public ModelAndView getBean(User user, @ModelAttribute("stu") Student stu) {
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("user", user);
        modelAndView.addObject("student", stu);
        return modelAndView;
    }
}
