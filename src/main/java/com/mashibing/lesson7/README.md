# Lesson7 spring的bean工厂准备工作

AbstractApplicationContext.java:526
prepareBeanFactory(beanFactory);

StandardBeanExpressionResolver->SpelExpressionParser->SpelParserConfiguration

## 属性编辑器
1.自定义实现PropertyEditorSupport接口的编辑器
2.自定义实现一个属性编辑器注册器，实现PropertyEditorRegistrar接口
3.让spring能识别到对应注册器

## Aware
### ignoreAware
AbstractAutowireCapableBeanFactory.java:174

AbstractAutowireCapableBeanFactory.java:1804
private void invokeAwareMethods(String beanName, Object bean)

### ignoreAware
AbstractApplicationContext.java:654 

ApplicationContextAwareProcessor.java
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException

反射进行赋值
1、获取该属性的set方法进行赋值
2、获取该属性对象Field的set的方法赋值
Field.java:755
public void set(Object obj, Object value)