package com.mood;

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
public class KafkaConsumer {

    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        System.out.println(message);
    }
}
