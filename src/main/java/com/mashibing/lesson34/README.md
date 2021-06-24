# Lesson34 spring全体系总结4

AOP
事物

- 责任链->使用AOP在进行通知调用的时候
- 工厂模式->BeanFactory、ProxyFactory
- 适配器模式->通知的时候有AdvisorAdapter
- 代理模式->使用Cglib、Jdk进行动态代理
- 模版方法->initPropertySources()、postProcessBeanFactory、onRefresh()
- 观察者模式->监听器，监听事件，广播器（多播器）
- 单例->Spring中所有的bean对象默认都是单例的
- 原型模式->可以通过作用域方式来改变bean为prototype
- 策略模式
  - AbstractApplicationContext
    - ClassPathXmlApplicationContext
    - FileSystemXmlApplicationContext
  - BeanDefinitionReader
    - XmlBeanDefinitionReader
    - PropertiesBeanDefinitionReader
- 构建者模式->BeanDefinitionBuilder
- 访问者模式->BeanDefinitionVisitor
- 装饰者模式->BeanWrapper
- 委托者模式->BeanDefinitionParserDelegate


servlet->server applet
struts1、struts2
springmvc

