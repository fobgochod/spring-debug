package com.fobgochod.lesson.lesson10.bean;

import com.fobgochod.lesson.lesson10.cond.LinuxCondition;
import com.fobgochod.lesson.lesson10.cond.WindowsCondition;
import com.fobgochod.lesson.lesson10.scan.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional({WindowsCondition.class})
public class MyBean {

    @Bean(name = "jack")
    public Person person() {
        return new Person("Jack Ma", 57);
    }

    @Conditional({WindowsCondition.class})
    @Bean(name = "bill")
    public Person person1() {
        return new Person("Bill Gates", 66);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person2() {
        return new Person("Linus Benedict Torvalds", 52);
    }
}
