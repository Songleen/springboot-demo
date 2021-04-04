package com.atguigu.event;

import com.atguigu.bean.Student;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/11:49
 */
public class MyEvent extends ApplicationEvent {
    // 事件源
    private Student student;

    // 父类没有无参构造，所有子类必须要实现父类的一个有参构造
    public MyEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    // 事件行为
    public String getInfo(){
        return student.toString();
    }
}
