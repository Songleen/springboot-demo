package com.atguigu.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2020/07/14/18:08
 */
// @Component
public class TempClass implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("来到这里了……");
    }
}
