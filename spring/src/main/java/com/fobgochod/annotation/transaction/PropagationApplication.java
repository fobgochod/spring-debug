package com.fobgochod.annotation.transaction;

import com.fobgochod.annotation.transaction.config.TxConfiguration;
import com.fobgochod.annotation.transaction.service.PropagationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  TransactionApplication.java
 *
 * @author Xiao
 * @date 2022/4/13 0:20
 */
public class PropagationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TxConfiguration.class);
        applicationContext.refresh();
        PropagationService propagationService = applicationContext.getBean(PropagationService.class);


        propagationService.nested2();
    }
}
