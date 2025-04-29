package com.fobgochod.annotation.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <a href="https://docs.spring.io/spring-framework/reference/core/beans/factory-nature.html#beans-factory-lifecycle-combined-effects">Combining Lifecycle Mechanisms</a>
 * <p>
 * Multiple lifecycle mechanisms configured for the same bean, with different initialization methods, are called as follows:
 *
 * <ol>
 *     <li>Methods annotated with {@link javax.annotation.PostConstruct}</li>
 *     <li><code>afterPropertiesSet()</code> as defined by the {@link InitializingBean} callback interface</li>
 *     <li>A custom configured <code>init()</code> method</li>
 * </ol>
 * <p>
 * Destroy methods are called in the same order:
 *
 * <ol>
 *     <li>Methods annotated with {@link javax.annotation.PreDestroy}</li>
 *     <li><code>destroy()</code> as defined by the {@link DisposableBean} callback interface</li>
 *     <li>A custom configured <code>destroy()</code> method</li>
 * </ol>
 *
 * @author fobgochod
 */
public class LifecycleApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config/annotation/lifecycle.xml");

        // add a shutdown hook for the above context...
        ctx.registerShutdownHook();

        // app runs here...

        // main method exits, hook is called prior to the app shutting down...
    }
}
