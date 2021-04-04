package com.atguigu.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2020/07/14/18:06
 */

// @Component
public class TempDemo implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("执行了这段代码……");
    }
}
