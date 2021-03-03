package com.mashibing.lesson16;

public class Person2 {

    private Integer id;
    private String name;

    public Person2() {
        System.out.println("构造方法");
    }

    public Person2(Integer id) {
        this.id = id;
    }

    public Person2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person2(String name, Integer id) {
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
