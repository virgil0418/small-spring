# 章节核心
- 之前的newInstance只能通过无参构造创建实例
- 在这一章中要支持有参构造创建实例
- 获取时传入bean参数
- [小傅哥文章地址](https://bugstack.cn/md/spring/develop-spring/2021-05-30-%E7%AC%AC4%E7%AB%A0%EF%BC%9A%E5%B4%AD%E9%9C%B2%E5%A4%B4%E8%A7%92%EF%BC%8C%E5%9F%BA%E4%BA%8ECglib%E5%AE%9E%E7%8E%B0%E5%90%AB%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0%E7%9A%84%E7%B1%BB%E5%AE%9E%E4%BE%8B%E5%8C%96%E7%AD%96%E7%95%A5.html)

# 两个问题
- 什么时候把构造函数的入参信息传递到实例化操作
    - getBean的时候
- 怎么创建含有构造函数的 Bean 对象
    - DeclaredConstructor
    - Cglib
    
# 通过策略模式，可以自由选择实例化方式