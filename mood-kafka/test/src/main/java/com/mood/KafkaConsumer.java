package com.mood;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * 模块
 *
 * @author chaiwei
 * @time 2018-04-19 15:25
 */
public class KafkaConsumer {
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        System.out.println(message);
    }
}
