# Lesson11 注册BeanPostProcessor

ConfigurationClassParser.java:311

processImports()
# 导入一些额外的配置类，同时完成了具体类的一个实例化工作


ConfigurationClassPostProcessor.java:319
->parser.parse(candidates);
->this.deferredImportSelectorHandler.process();
->handler.processGroupImports()
->grouping.getImports()
->this.group.process
->AutoConfigurationImportSelector.java:123


SpringBoot

AutoConfigurationImportSelector.java
->getAutoConfigurationEntry(AnnotationMetadata annotationMetadata)
->getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes)
->getSpringFactoriesLoaderFactoryClass
->EnableAutoConfiguration.class


# yml解析
PropertySourceLoader

# 下半场
# SpringBoot启动Tomcat

SpringApplication.java
->refresh(ConfigurableApplicationContext applicationContext)

ServletWebServerApplicationContext.java
->onRefresh()->createWebServer();


# BPP
registerBeanPostProcessors(beanFactory);

BeanPostProcessor
->DestructionAwareBeanPostProcessor
->MergedBeanDefinitionPostProcessor
->InstantiationAwareBeanPostProcessor->SmartInstantiationAwareBeanPostProcessor
