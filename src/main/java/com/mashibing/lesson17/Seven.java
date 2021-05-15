package com.mashibing.lesson17;

import org.springframework.stereotype.Component;

@Component
public class Seven {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seven{" +
                "name='" + name + '\'' +
                '}';
    }
}
