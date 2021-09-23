package com.fobgochod.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import java.io.IOException;

/**
 * MyListener.java
 *
 * @author Xiao
 * @date 2021/9/23 23:14
 */
public class MyListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent event) throws IOException {
        System.out.println("任务完成了。");
    }

    @Override
    public void onTimeout(AsyncEvent event) throws IOException {
        System.out.println("任务超时了。");
    }

    @Override
    public void onError(AsyncEvent event) throws IOException {
        System.out.println("任务出错了。");
    }

    @Override
    public void onStartAsync(AsyncEvent event) throws IOException {
        System.out.println("任务开始了。");
    }
}
