package com.mood.module.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;


/**
 * 模块
 *
 * @author chaiwei
 * @time 2018-04-19 15:25
 */
@Configuration
@EnableKafka
public class Consumer {

    @KafkaListener(topics = {"test2"})
    public void consumer(String message){
        System.out.println("producer监控者2接收到" + message);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
