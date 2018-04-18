package com.mood.module.produce;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

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

    @Autowired
    private Topic topic;

    public void send(String id) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, id);
    }

    public void release(String id) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, id);
    }

}
