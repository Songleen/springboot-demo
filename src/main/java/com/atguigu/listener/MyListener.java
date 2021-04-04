package com.atguigu.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/11:37
 */
// @Component
public class MyListener {

    // 这里需要一个参数，就是感兴趣的事件
    @EventListener
    public void test(){
        System.out.println("监听到了");
    }
}
