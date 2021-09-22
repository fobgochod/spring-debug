package com.fobgochod.lesson12;

import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @auther: Xiao
 * @date: 2021/9/11 13:26
 * @description: 功能描述
 */
public class Person {

    private String id;
    private String name;

    private final transient LocalDate applicationContext;

    public LocalDate getApplicationContext() {
        return applicationContext;
    }

    public Person(LocalDate applicationContext) {
        this.applicationContext = applicationContext;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return (this == other || (other instanceof Person &&
                this.applicationContext == ((Person) other).applicationContext));
    }


    @Override
    public int hashCode() {
        return Objects.hash(applicationContext);
    }
}
