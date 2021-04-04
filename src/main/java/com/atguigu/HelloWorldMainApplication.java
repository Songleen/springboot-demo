package com.atguigu;


import com.atguigu.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Songleen
 * @creat 03-09-20:48
 * @SpringBootApplication用来标注一个主程序类，说明这是一个Spring Boot应用
 */

@SpringBootApplication
// @ServletComponentScan("com.atguigu.listener")
public class HelloWorldMainApplication {



    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
