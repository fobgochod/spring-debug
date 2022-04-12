package com.fobgochod.annotation.converter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:config/application.properties"})
public class User {

    @Value("${customer.name}")
    private String name;
    @Value("${customer.student}")
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
