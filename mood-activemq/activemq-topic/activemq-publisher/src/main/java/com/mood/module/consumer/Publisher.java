package com.mood.module.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */

@Component
@EnableScheduling
public class Publisher {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    public void release(String id) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, id);
    }

}
