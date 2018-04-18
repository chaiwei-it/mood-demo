package com.mood.module.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */
@Component
public class Subscriber {

    @JmsListener(destination = "sample.topic")
    public void receiveQueue1(String id) {
        System.out.println("订阅者1收到消息：" + id);
    }

    @JmsListener(destination = "sample.topic")
    public void receiveQueue2(String id) {
        System.out.println("订阅者2收到消息：" + id);
    }

}
