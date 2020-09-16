package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：
 *     告诉SpringBoot将本类中的所有属性和配置文件中的相关配置进行绑定；
 *     prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *     默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 *
 * @PropertySource：
 *     加载指定的配置文件
 *
 * @ImportResource：
 *     导入Spring的配置文件，让配置文件里面的内容生效；
 *     Spring Boot里面没有Spring的配置文件，我们自己编写的配置文件也不能识别；
 *     想让Spring的配置文件生效，加载进来，需要将@ImportResource标注在一个配置类上，注意是
 *     配置类，所以@ImportResource要放在主配置类SpringBoot02ConfigApplication上；
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
