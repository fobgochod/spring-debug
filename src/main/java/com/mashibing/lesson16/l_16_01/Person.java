package com.mashibing.lesson16.l_16_01;

public class Person {

    private Integer id;
    private String name;

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
