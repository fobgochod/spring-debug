# Lesson24 jdk和cglib动态代码实现原理

### JDK

```java
/*
 * Look up or generate the designated proxy class.
 */
Class<?> cl = getProxyClass0(loader, intfs);
```

Supplier
BiFunction



### Cglib

FastClass是一个抽象类，CGlib在运行时通过FastClass内的Generator这个内部类将其
子类动态生成出来，然后再利用ClassLoader将生成的子类加载进JVM里面去。