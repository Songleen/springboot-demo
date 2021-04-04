package com.son.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/19:32
 */
@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {
    private List<User> users;
    private List<Student> students;
    private String dogs;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getDogs() {
        return dogs;
    }

    public void setDogs(String dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "users=" + users +
                ", students=" + students +
                ", dogs='" + dogs + '\'' +
                '}';
    }
}
