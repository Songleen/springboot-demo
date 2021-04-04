package com.atguigu.listener;

import com.atguigu.event.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/10:54
 */
@Component
public class MySpringListener implements ApplicationListener<MyEvent> { // 泛型决定要监听的事件

    // 监听器要把被监听过的事件对象传递过来
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("监听到了");
        // 监听到了事件对象，可以选择处理，也可以忽略
        System.out.println(event.getInfo());
    }
}
