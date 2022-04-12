package com.fobgochod.annotation.propertyeditor;

import com.fobgochod.annotation.propertyeditor.editor.AddressPropertyEditorRegistrar;
import com.fobgochod.annotation.propertyeditor.editor.Customer;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fobgochod.annotation.propertyeditor.editor")
public class PropertyEditorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(PropertyEditorApplication.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(Customer.class));
    }

    @Bean
    public static CustomEditorConfigurer editorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        customEditorConfigurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new AddressPropertyEditorRegistrar()});
        return customEditorConfigurer;
    }
}
