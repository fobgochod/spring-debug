package com.fobgochod.annotation.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:config/application.properties"})
public class PropertyPojo {

    @Value("${customer.name}")
    private String name;
    @Value("${customer.address}")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ApplicationProperty{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
