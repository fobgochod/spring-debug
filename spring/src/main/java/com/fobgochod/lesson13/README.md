# Lesson13 spring的bean创建流程一

### 转换服务

ConversionService
[Spring Type Conversion](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#core-convert)

Converter<S, T>

GenericConverter

ConverterFactory<S, R>

ConversionService->DefaultConversionService


### 内置值处理器

embeddedValueResolvers

PropertyPlaceholderConfigurer BFPP

PlaceholderConfigurerSupport.java:237
beanFactoryToProcess.addEmbeddedValueResolver(valueResolver);


取法其上,得乎其中；取法其中,得乎其下;取法其下,法不得也!----吕氏春秋

取法其上，得乎法中；取法其中，得乎法下；取法面试，面试不得

### BeanFactory FactoryBean

都是对象工厂，用来创建对象
BeanFactory接口，严格遵守spring bean的生命周期


FactoryBean->isSingleton方法返回true，Spring才会缓存，
缓存数据放入factoryBeanObjectCache，
不在singletonObjects中

