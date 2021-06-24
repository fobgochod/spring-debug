# Lesson33 spring全体系总结3

AbstractAutowireCapableBeanFactory.java
createBean(beanName, mbd, args)



MergedBeanDefinitionPostProcessor
- AutowiredAnnotationBeanPostProcessor
  - @Autowired
  - @Value  
- CommonAnnotationBeanPostProcessor
  - @Resource
  - @PostConstruct
  - @PreDestroy  