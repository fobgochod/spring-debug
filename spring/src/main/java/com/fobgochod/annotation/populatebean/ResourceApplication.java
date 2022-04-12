package com.fobgochod.annotation.populatebean;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.populateService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * ResourceApplication.java
 * <p>
 * 1、按名称匹配
 * <p>
 * 如果没有：
 * 2、按照@Autowired流程处理
 *
 * @author Xiao
 * @date 2022/4/9 13:37
 * @see CommonAnnotationBeanPostProcessor
 */
@Configuration
@ComponentScan("com.fobgochod.annotation.populatebean.populate")
public class ResourceApplication {

    @Resource
    @Qualifier("qualifierServiceImpl")
    private populateService byNameServiceImpl;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(ResourceApplication.class);
        ac.refresh();

        ResourceApplication app = ac.getBean(ResourceApplication.class);
        PopulatePojo populatePojo = app.byNameServiceImpl.info(Resource.class.getSimpleName());
        System.out.println("populatePojo = " + populatePojo);
    }
}
