package com.son.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/17:34
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("请求过来了！");
        return "hello son";
    }
}
