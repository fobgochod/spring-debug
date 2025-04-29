package com.fobgochod.lesson.lesson13;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User zhangsan = new User("zhangsan");
        Student student = new Student();
        student.setId(2);
        student.setName("zhangsan");
        zhangsan.setStudent(student);
        return zhangsan;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
