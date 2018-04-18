package com.mood;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */
@Component
public class Consumer {

    @JmsListener(destination = "sample.queue")
    public void receiveQueue1(String text) {
        System.out.println("接受者1激活");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接受者1" + text);
    }

    @JmsListener(destination = "sample.queue")
    public void receiveQueue2(String text) {
        System.out.println("接受者2激活");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接受者2" + text);
    }

    @JmsListener(destination = "sample.queue")
    @SendTo("out.queue")
    public String receiveQueue3(String text) {
        System.out.println("接受者3激活");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接受者3" + text);
        return "消费者3返回的信息";
    }

}
