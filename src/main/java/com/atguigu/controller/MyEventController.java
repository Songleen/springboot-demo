package com.atguigu.controller;

import com.atguigu.bean.Student;
import com.atguigu.event.MyEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/11:53
 */
@RestController
public class MyEventController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @RequestMapping("sec")
    public String set(){
        Student s = new Student();
        s.setName("lisonglin");
        s.setAge(28);
        MyEvent myEvent = new MyEvent(this,s);
        // 发布事件
        System.out.println("这里发布了事件……");
        applicationContext.publishEvent(myEvent);
        return "sucess";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
