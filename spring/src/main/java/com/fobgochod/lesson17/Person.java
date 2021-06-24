package com.fobgochod.lesson17;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Person {

    private Integer id;
    private String name;
    @Resource
    private Seven seven;

    public Person() {
        System.out.println("构造方法");
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("init ......");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    public Person(String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seven getSeven() {
        return seven;
    }

    public void setSeven(Seven seven) {
        this.seven = seven;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seven=" + seven +
                '}';
    }
}
