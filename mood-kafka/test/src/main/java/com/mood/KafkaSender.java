package com.mood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by chai on 2018/4/19.
 */
@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送消息到kafka,主题为test
     */
    public void sendTest(){
        kafkaTemplate.send("test","hello,kafka  ");
    }
}