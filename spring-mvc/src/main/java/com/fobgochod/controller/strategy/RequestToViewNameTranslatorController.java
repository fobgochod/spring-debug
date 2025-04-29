package com.fobgochod.controller.strategy;

import com.fobgochod.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RequestToViewNameTranslatorController.java
 *
 * @author fobgochod
 * @see org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator
 */
@Controller
public class RequestToViewNameTranslatorController {

    @RequestMapping("/noview")
    public void noview() {
        System.out.println("no view.......");
        User user = new User();
        user.setAge(12);
        user.setName("zhangsan");
    }
}
