package com.fobgochod.controller.strategy;

import com.fobgochod.controller.exception.MyHttpStatusException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * HandlerExceptionResolversController.java
 *
 * @author fobgochod
 * @see org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver
 * @see org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver
 * @see org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver
 */
@Controller
public class HandlerExceptionResolversController {

    @RequestMapping("/exception/handler")
    public ModelAndView exception(ModelAndView view) throws ClassNotFoundException {
        view.setViewName("success");
        throw new ClassNotFoundException("class not found");
    }

    @ExceptionHandler(ClassNotFoundException.class)
    public ModelAndView error(ClassNotFoundException error, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        mav.addObject("msg", "ClassNotFoundException");
        return mav;
    }

    @RequestMapping("/response/status")
    public ModelAndView responseStatus(ModelAndView view) {
        view.setViewName("error");
        throw new MyHttpStatusException();
    }

    @RequestMapping("/default/handler")
    public ModelAndView defaultHandler(ModelAndView view, HttpServletRequest request) throws NoHandlerFoundException {
        view.setViewName("error");
        throw new NoHandlerFoundException(null, null, null);
    }
}
