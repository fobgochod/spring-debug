# Lesson6 spring自定义标签解析过程

自定义一个<animal:animeInfo id="zero" name="university" kind="muppet"/>,完成整个标签的处理工作

## 命名空间

DefaultNamespaceHandlerResolver.java:117
NamespaceHandler resolve(String namespaceUri)

## 标签解析
AbstractSingleBeanDefinitionParser.java:62
parseInternal(Element element, ParserContext parserContext)

## 自定义documentReaderClass
AbstractXmlApplicationContext.java:93
initBeanDefinitionReader(beanDefinitionReader);
