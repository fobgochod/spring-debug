package com.fobgochod.controller.async;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;

@Controller
public class AsyncController {

    @ResponseBody
    @RequestMapping(value = "/webasynctask", produces = "text/html; charset=UTF-8")
    public WebAsyncTask<String> webAsyncTask() {
        System.out.println("WebAsyncTask处理器主线程进入");
        WebAsyncTask<String> task = new WebAsyncTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5 * 1000L);
                System.out.println("WebAsyncTask处理执行中。。。");
                return "久等了";
            }
        });
        System.out.println("WebAsyncTask处理器主线程退出");
        return task;
    }

    @ResponseBody
    @RequestMapping(value = "/callable", produces = "text/plain; charset=UTF-8")
    public Callable<String> callable() {
        System.out.println("Callable处理器主线程进入");
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5 * 1000L);
                System.out.println("Callable处理执行中。。。");
                return "久等了";
            }
        };
        System.out.println("Callable处理器主线程退出");
        return callable;
    }
}
