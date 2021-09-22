package com.fobgochod.lesson12;


import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lesson12 {

    public static void main(String[] args) {
        // 创建被观察者
        BadMan bm = new BadMan();
        // 创建观察者
        GoodMan gm = new GoodMan();
        GoodMan2 gm2 = new GoodMan2();

        //向被观察者中添加观察者
        bm.addObserver(gm);
        bm.addObserver(gm2);

        //等待罪犯触发某些行为
        bm.run();


        List<Person> beanPostProcessors = new CopyOnWriteArrayList<>();

        LocalDate now = LocalDate.now();
        beanPostProcessors.add(new Person(now));
        beanPostProcessors.add(new Person(LocalDate.now()));
        beanPostProcessors.add(new Person(now));


    }
}
