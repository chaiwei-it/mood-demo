package com.mood;

import javax.jms.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */

@Component
@EnableScheduling
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    int num = 1;

    @Scheduled(fixedDelay=2000)//每3s执行1次
    public void send() {
//        int num = 1;
        this.jmsMessagingTemplate.convertAndSend(this.queue, "hi,activeMQ" + num);
        System.out.println("send finish" + num++);
    }

    @JmsListener(destination = "out.queue")
    public void receiveQueue3(String text) {
        System.out.println("生产者接受消费者3返回的信息" + text);
    }

}
