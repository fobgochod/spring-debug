package com.fobgochod.controller.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NullPointerController {

    @RequestMapping("/nullpointer")
    public ModelAndView nullpointer(ModelAndView view) {
        view.setViewName("success");
        String str = null;
        str.length();
        return view;
    }

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView error(RuntimeException error, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        mav.addObject("message", "Runtime Exception Error");
        return mav;
    }

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView error(ModelAndView mav) {
        mav.setViewName("error");
        mav.addObject("message", "NullPointer Exception Error");
        return mav;
    }
}
