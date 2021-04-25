# Lesson11

ConfigurationClassParser.java:311


ConfigurationClassPostProcessor.java:319
->parser.parse(candidates);
->this.deferredImportSelectorHandler.process();
->handler.processGroupImports()
->grouping.getImports()
->this.group.process


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