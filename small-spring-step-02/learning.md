# 章节核心
- 注册时只会注册类信息BeanDefinition，而不是直接注册对象
- 之后通过工厂核心实现类注册bean、创建bean、获取bean
- [小傅哥文章地址](https://bugstack.cn/md/spring/develop-spring/2021-05-23-%E7%AC%AC3%E7%AB%A0%EF%BC%9A%E5%88%9D%E6%98%BE%E8%BA%AB%E6%89%8B%EF%BC%8C%E8%BF%90%E7%94%A8%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8C%E5%AE%9E%E7%8E%B0%20Bean%20%E7%9A%84%E5%AE%9A%E4%B9%89%E3%80%81%E6%B3%A8%E5%86%8C%E3%80%81%E8%8E%B7%E5%8F%96.html#_5-%E5%AE%9E%E4%BE%8B%E5%8C%96bean%E7%B1%BB-abstractautowirecapablebeanfactory)

# 接口BeanDefinitionRegistry
- 提供注册BeanDefinition的方法registerBeanDefinition()
- 注册bean就是注册BeanDefinition
- 注册BeanDefinition与创建bean分离

# 接口BeanFactory
- 提供获取bean的方法getBean()

# 接口SingletonBeanRegistry
- 提供获取单例bean的方法
- 将获取**单例**bean与获取bean分离

# 抽象类AbstractBeanFactory
- 实现获取bean方法getBean()
- 模板模式构建获取bean的流程
    - 获取单例bean
    - 获取BeanDefinition  
    - 创建bean
    
# 抽象类AbstractAutowireCapableBeanFactory
- 实现createBean
- 创建时添加进单例addSingleton

# 实现类DefaultSingletonBeanRegistry
- 实现getSingleton
- 实现addSingleton

# 核心实现类DefaultListableBeanFactory
- 实现registerBeanDefinition
- 实现getBeanDefinition
- 拥有所有能力
