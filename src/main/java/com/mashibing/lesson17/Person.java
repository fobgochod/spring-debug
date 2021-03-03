package com.mashibing.lesson17;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.Ordered;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person implements BeanClassLoaderAware, Ordered, InitializingBean {

    private ClassLoader classLoader;
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
