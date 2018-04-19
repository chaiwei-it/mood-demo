package com.mood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 模块
 *
 * @author chaiwei
 * @time 2018-04-19 15:27
 */
@SpringBootApplication
@EnableScheduling
public class App {

    @Autowired
    private KafkaSender kafkaSender;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //然后每隔1分钟执行一次
    @Scheduled(fixedRate = 1000)
    public void testKafka() throws Exception {
        kafkaSender.sendTest();
    }
}
