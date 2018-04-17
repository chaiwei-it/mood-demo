package com.mood;

import javax.jms.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
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



}
