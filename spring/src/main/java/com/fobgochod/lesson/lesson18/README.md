# Lesson18 spring的bean创建流程六

填充属性
- 基本数据类型(4类8种)
  - 数组
  - list
  - set 
  - map
  - properties
- 引用类型

注入方式(AutowireCapableBeanFactory.java)
- 不注入
- 类型
- 名称
- 构造器

- Aware 普通对象获取到容器对象的时候设置一些系统容器中的属性值
- Register 增删改查
- Resolver 处理器 解析工作
- Handler


AutowiredAnnotationBeanPostProcessor
