
# Spring Boot与Web开发
Thymeleaf、web定制、容器定制

## 零. 使用SpringBoot：
1. 创建SpringBoot应用，选择需要模块
2. SpringBoot已经默认将这些场景配置好了，只需要在配置文件中指定少量配置就可以运行起来
3. 自己编写业务代码

## 一.自动配置原理：

这个场景SpringBoot帮我们配置了什么？能修改哪些值？能不能扩展？xxx
```
xxxAutoConfiguration：帮我们给容器自动配置组件
xxxProperties：配置类来封装配置文件的内容
```

## 二.SpringBoot对静态资源的映射规则：
1. 所有```/webjars/**```，都去```classpath:/META-INF/resources/webjars/```找资源；
```webjars：```以jar报的方式引入静态资源
2. ```/**```访问当前项目的任何资源（静态资源的文件夹）
```
"classpath:/META-INF/resources/",
"classpath:/resources/",
"classpath:/static/",
"classpath:/public/",
"/"：当前项目的根路径
```
localhost:8080/abc ==> 去静态资源文件夹中找abc

3.欢迎页：静态资源文件夹下的所有```index.html```页面，被```/**```映射
localhost:8080/

4.所有的```××、favicon.ico```都是在静态资源下找

## 三.模版引擎
JSP, Velocity, Freemarker, Thymeleaf

SpringBoot推荐的Thymeleaf：语法更简单，功能更强大

1. 引入thymeleaf