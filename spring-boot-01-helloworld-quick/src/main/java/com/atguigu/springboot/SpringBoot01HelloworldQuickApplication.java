package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01HelloworldQuickApplication {
    /**
     * 使用Spring initializer快速创建Spring Boot项目
     *
     * 默认生成的Spring Boot项目特点：
     *     - 主程序已经生成好了，我们只需我们自己的逻辑
     *     - resources文件夹中目录结构：
     *         - static：
     *             保存所有的静态资源，js css images
     *         - templates：
     *             保存所有的模版页面；（Spring Boot默认jar包使用嵌入式的Tomcat，默认不支持
     *             JSP页面）；可以使用末班引擎（freemarker、thymeleaf）；
     *         - application.properties：
     *             spring boot应用的配置文件，可以修改默认设置，如端口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloworldQuickApplication.class, args);
    }

}
