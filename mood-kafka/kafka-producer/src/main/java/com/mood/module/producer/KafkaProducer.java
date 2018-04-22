package com.mood.module.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Date;
import java.util.UUID;


/**
 * 应用模块
 * @author chaiwei
 * @time 2017-11-25 下午08:00
 */
@Component
@EnableScheduling
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Scheduled(fixedRate = 1000)
    public void send(){
        String message = UUID.randomUUID().toString();
        kafkaTemplate.send("test", new Date().toString());
    }
}