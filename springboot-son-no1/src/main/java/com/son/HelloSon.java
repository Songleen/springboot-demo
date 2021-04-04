package com.son;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/17:31
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HelloSon {

    public static void main(String[] args) {
        SpringApplication.run(HelloSon.class, args);
    }
}
