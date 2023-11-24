# 本章核心
- 实现aware感知容器   
- aware用于获取BeanFactory、ApplicationContext、BeanClassLoader、BeanName等这些能力
- 实现aware感知可以重写set方法，容器会调用这些方法，把容器的能力放进实现类中
- 初始化bean时，就将对应的东西放到对应aware的实现类中
- 由于初始化bean时，BeanFactory无法获取到ApplicationContext，因为 ApplicationContext 并不是在 AbstractAutowireCapableBeanFactory 中 createBean 方法下的内容
- 把 ApplicationContext 写入到一个包装的 BeanPostProcessor 中去