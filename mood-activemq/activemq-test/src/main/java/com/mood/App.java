package com.mood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */

@SpringBootApplication
@EnableJms
public class App {

//    @Bean
//    public Queue queue() {
//        return new ActiveMQQueue("sample.queue");
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
