package com.mood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 应用模块
 * @author chaiwei
 * @time 2017-11-25 下午08:00
 */
@SpringBootApplication
@EnableScheduling
public class KafkaTestApplication {

    @Autowired
    private KafkaProducer kafkaProducer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestApplication.class, args);
    }

    @Scheduled(fixedRate = 1000)
    public void testKafka() throws Exception {
        kafkaProducer.send();
    }
}
