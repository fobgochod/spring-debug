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

## Lesson37 SpringMVC源码请求执行流程

- DispatcherServlet.java:503
- DispatcherServlet.java:1000

## Lesson38 SpringMVC源码之MultipartResolverHandlerMapping

- HandlerMapping
    - Controller
    - HttpRequestHandler
    - @Controller

- BeanNameUrlHandlerMapping
    - Controller
    - HttpRequestHandler
- RequestMappingInfoHandlerMapping
    - @Controller
    - @RequestMapping

## Lesson39 SpringMVC源码之HandlerMappingHandlerAdapter

- HandlerAdapter

## Lesson40 SpringMVC源码之HandlerAdapter具体执行流程

查看字节码文件 javap -verbose xxx.class

## Lesson41 SpringMVC源码之HandlerAdapter具体执行流程2

## Lesson42 SpringMVC源码之HandlerAdapter具体执行流程3

HandlerMethodArgumentResolver HandlerMethodReturnValueHandler

### 转发

> 由服务器端进行页面跳转，称为转发

由服务器进行页面跳转，不需要客户端重新发送请求：

- 特点如下：
    - 地址栏的请求不会发生变化，显示的还是第一次请求的地址
    - 请求的次数，有且仅有一次请求
    - 请求域中的数据不会丢失
    - 根目录：localhost:8080/项目地址/，包含了项目的访问地址

### 重定向

> 由客户端进行页面跳转，称为重定向

在浏览器端进行页面跳转，需要发送两次请求（第一次是人为的，第二次是自动的）

- 特点如下：
    - 地址栏的地址发生变化，显示最新发送请求的地址
    - 请求次数：2次
    - 请求域中的数据会丢失，因为是不同的请求
    - 根目录：localhost:8080/ 不包含项目的名称

