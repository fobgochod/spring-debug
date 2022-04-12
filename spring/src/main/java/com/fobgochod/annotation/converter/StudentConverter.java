package com.fobgochod.annotation.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter implements Converter<String, Student> {

    @Override
    public Student convert(String source) {
        String[] splits = source.split("_");
        Student student = new Student();
        student.setId(splits[0]);
        student.setName(splits[1]);
        return student;
    }
}
