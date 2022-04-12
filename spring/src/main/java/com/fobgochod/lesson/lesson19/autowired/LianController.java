package com.fobgochod.lesson.lesson19.autowired;

import org.springframework.stereotype.Controller;

@Controller
public class LianController {

    @Lian
    private LianService lianService;

    public void show(){
        lianService.show();
    }
}
