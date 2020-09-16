package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类（主入口类、主配置类），说明这是一个Spring Boot应用，
 * Spring Boot就应该运行这个类的main方法来启动spring boot应用
 *
 * @SpringBootApplication的源代码：
 *----------------------------------------------------------------
 * @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 * public @interface SpringBootApplication {
 * --------------------------------------------------------------
 *
 * @SpringBootConfiguration：
 *     Spring Boot的配置类，标注在某个类上，表示这是一个Spring Boot的配置类，
 *     @Configuration：配置类上来标注这个注解，配置类<==>配置文件；配置类也是容器中的一个组件；@Component
 *
 * @EnableAutoConfiguration：
 *     开启自动配置功能； 以前我们需要配置的东西，Spring Boot帮我们自动配置；@EnableAutoConfiguration告诉Spring
 *     Boot开启自动配置功能；这样自动配置才能生效；
 *
 *     @AutoConfigurationPackage
 *     @Import(EnableAutoConfigurationImportSelector.class)
 *     public @interface EnableAutoConfiguration {
 *
 *        @AutoConfigurationPackage:
 *            自动配置包
 *
 *            @Import(AutoConfigurationPackages.Register.class):
 *                Spring的底层柱姐@Import，给容器中导入一个组件；导入的组件由AutoConfigurationPackages.Register.class；
 *                将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器；
 *
 *
 *        @Import(EnableAutoConfigurationImportSelector.class)
 *            EnableAutoConfigurationImportSelector：
 *                导入哪些组建的选择器，将所有需要导入的组件以全类明名的方式返回，这些组件就会被添加到容器中；会给容器中导入非常多的
 *                自动配置类(xxxAutoConfiguration)；就是给容器中导入这个场景所需要的所有组件，并配置好这些组件；有了自动配置类，
 *                免去了我们手动编写配置注入功能组件等的工作；
 *                Spring Boot在启动的时候从类路径下的META-INF/spring.factories中获取EnableAutoConfiguration指定的值，
 *                将这些值作为自动配置类导入容器中，自动配置类就生效，以前我们需要自己配置的东西，自动配置类都帮我们配好了；
 *                J2EE的整体整合解决方案和自动配置都在spring-boot-autoconfigure-2.3.3.RELEASE；
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
