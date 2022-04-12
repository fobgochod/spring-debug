package com.fobgochod.annotation.methodoverride.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Human {

    @Autowired
    private Car car;

    @Lookup
    public abstract Fruit eatFruit();

    public Car driveCar() {
        return car;
    }
}
