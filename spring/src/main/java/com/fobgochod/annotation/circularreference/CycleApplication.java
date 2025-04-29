package com.fobgochod.annotation.circularreference;

import com.fobgochod.annotation.circularreference.cycle.CycleOne;
import com.fobgochod.annotation.circularreference.cycle.CycleTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * CycleApplication.java
 *
 * @author fobgochod
 */
@Configuration
@ComponentScan("com.fobgochod.annotation.circularreference")
@EnableAspectJAutoProxy
public class CycleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(CycleApplication.class);
        ac.refresh();

        CycleOne cycleOne = ac.getBean(CycleOne.class);
        System.out.printf("%s, one.two = %s\n", cycleOne.name(), cycleOne.getCycleTwo());
        CycleTwo cycleTwo = ac.getBean(CycleTwo.class);
        System.out.printf("%s, two.one = %s\n", cycleTwo.name(), cycleTwo.getCycleOne());
    }
}
