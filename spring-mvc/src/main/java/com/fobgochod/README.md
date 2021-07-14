# 笔记

## Lesson35 SpringMVC源码初识

- ContextLoaderListener.java:102 (初始化Spring容器)
- HttpServletBean.java:149 (初始化SpringMVC容器)

## Lesson36 SpringMVC源码初识(二)

- ServletContext
    - servlet的上下文对象
        - 包含整个web.xml文件中的配置
- ServletConfig
    - 被某个servlet持有
        - 对应servlet中配置的属性
