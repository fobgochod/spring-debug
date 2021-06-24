# Lesson14 spring的bean创建流程二

## 流程
getBean->doGetBean->createBean->doCreateBean


- new
- 反射
- factoryMethod
- supplier

如果一个bean对象实现了FactoryBean接口
- 实现了接口的bean
- 工厂本身要创建的bean


ObjectFactory<T>

### 安全管理器

createBean()
->Class<?> resolvedClass = resolveBeanClass(mbd, beanName);
->System.getSecurityManager()

DriverManager.loadInitialDrivers()
>AccessController.doPrivileged()


lookup-method
replace-method