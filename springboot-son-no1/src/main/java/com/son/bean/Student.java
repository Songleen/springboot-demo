package com.son.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/19:38
 */
@Component
public class Student {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
