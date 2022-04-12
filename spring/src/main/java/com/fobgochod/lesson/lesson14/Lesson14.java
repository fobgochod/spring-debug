package com.fobgochod.lesson.lesson14;

import com.fobgochod.util.CGlibUtils;
import com.fobgochod.lesson.lesson14.lookup.Apple;
import com.fobgochod.lesson.lesson14.replace.OriginalDog;
import com.fobgochod.lesson.lesson14.lookup.FruitPlate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring中默认的对象都是单例的，spring会在一级缓存中持有该对象，方便下次直接获取，
 * 那么如果是原型作用域的话，会创建一个新的对象
 * 如果想在一个单例模式的bean下引用一个原型模式的bean,怎么办？
 * 在此时就需要引用lookup-method标签来解决此问题
 * <p>
 * 通过拦截器的方式每次需要的时候都去创建最新的对象，而不会把原型对象缓存起来，
 */
public class Lesson14 {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("lookup");
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson14.xml");

        Apple bean = ac.getBean(Apple.class);
        System.out.println("property:banana1 = " + bean.getBanana());
        System.out.println("property:banana2 = " + bean.getBanana());

        FruitPlate fruitplate1 = (FruitPlate) ac.getBean("fruitplate1");
        System.out.println("lookup-method:apple1 = " + fruitplate1.getFruit());
        System.out.println("lookup-method:apple2 = " + fruitplate1.getFruit());

        FruitPlate fruitplate2 = (FruitPlate) ac.getBean("fruitplate2");
        System.out.println("lookup-method:banana1 = " + fruitplate2.getFruit());
        System.out.println("lookup-method:banana2 = " + fruitplate2.getFruit());

        OriginalDog dog = (OriginalDog) ac.getBean("originalDog");
        dog.sayHello();
        dog.sayHello("woof woof");

    }
}
