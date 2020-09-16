package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller 使得这个类可以处理请求
 */
@Controller
public class HelloController {

    @ResponseBody                // 把Hello，World写给浏览器
    @RequestMapping("/hello")    // 接受来自浏览器的hello请求
    public String hell() {
        return "Hello, World!";
    }
}
