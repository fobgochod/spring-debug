# Lesson10 spring的ConfigurationClassPostProcessor的讲解

ConfigurationClassPostProcessor.java:224

# 获取配置类
Configuration.class
Component.class
ComponentScan.class
Import.class
ImportResource.class
Bean.class

# 解析configCandidates
1、条件判断：Conditional.class、Condition.class
2、解析顺序
- @Component
- @PropertySource 
- @ComponentScan
- @Import
- @ImportResource
- @Bean
- default methods on interfaces
- superclass, if any