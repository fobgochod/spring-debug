# Lesson8 spring的beanFactoryPostProcessor的执行

AnnotationConfigUtils.java

internalConfigurationAnnotationProcessor

BeanFactoryPostProcessor->BeanDefinitionRegistryPostProcessor

## 开启component-scan 会添加internal的BPP BFPP

> 重要：ConfigurationClassPostProcessor.java

ComponentScanBeanDefinitionParser.java:152
AnnotationConfigUtils.registerAnnotationConfigProcessors(readerContext.getRegistry(), source)
