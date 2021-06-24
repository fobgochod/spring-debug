# Lesson5 spring配置文件加载过程

initBeanDefinitionReader(beanDefinitionReader); 适配器模式？


ClassPathXmlApplicationContext.java:142
setConfigLocations(configLocations);

AbstractXmlApplicationContext.java:127
String[] configLocations = getConfigLocations();