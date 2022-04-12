package com.fobgochod.lesson.lesson16;

import org.springframework.beans.factory.annotation.Autowired;

public class Person3 {

    private Integer id;
    private String name;

    public Person3() {
        System.out.println("构造方法");
    }

    @Autowired(required = false)
    public Person3(Integer id) {
        this.id = id;
    }

    @Autowired(required = false)
    public Person3(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person3(String name, Integer id) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "{"
                + "\"id\":"
                + id
                + ",\"name\":\""
                + name + '\"'
                + "}";
    }
}
