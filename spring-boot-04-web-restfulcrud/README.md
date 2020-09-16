
# 四、Spring Boot与Web开发
Thymeleaf、web定制、容器定制

使用SpringBoot：
1. 创建SpringBoot应用，选择需要模块
2. SpringBoot已经默认将这些场景配置好了，只需要在配置文件中指定少量配置就可以运行起来
3. 自己编写业务代码

自动配置原理：
这个场景SpringBoot帮我们配置了什么？能修改哪些值？能不能扩展？xxx
```
xxxAutoConfiguration：帮我们给容器自动配置组件
xxxProperties：配置类来封装配置文件的内容
```