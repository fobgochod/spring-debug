package com.fobgochod.controller.responseBodyAdvice;

import com.fobgochod.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ResponseBodyAdviceController {

    @RequestMapping("/no/view")
    @ResponseBody
    public String responseBodyAdvice(HttpServletRequest request, Model model) {
        model.addAttribute("msg", "go go go!");
        return "go";
    }

    @RequestMapping("/no/view2")
    @ResponseBody
    public User noView() {
        User user = new User();
        user.setAge(12);
        user.setName("zhangsan");
        return user;
    }
}
