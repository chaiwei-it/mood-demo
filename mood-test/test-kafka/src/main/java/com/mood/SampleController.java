package com.mood;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-04-19 22:58
 */
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

/**
 * @author liuzh
 * @since 2017/6/17.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    public static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    @RequestMapping("/send")
    @ResponseBody
    String send(String topic, String key, String data) {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "http://192.168.31.231:9092");
//        //The "all" setting we have specified will result in blocking on the full commit of the record, the slowest but most durable setting.
//        //“所有”设置将导致记录的完整提交阻塞，最慢的，但最持久的设置。
//        props.put("acks", "all");
//        //如果请求失败，生产者也会自动重试，即使设置成０ the producer can automatically retry.
//        props.put("retries", 0);
//
//        //The producer maintains buffers of unsent records for each partition.
//        props.put("batch.size", 16384);
//        //默认立即发送，这里这是延时毫秒数
//        props.put("linger.ms", 1);
//        //生产者缓冲大小，当缓冲区耗尽后，额外的发送调用将被阻塞。时间超过max.block.ms将抛出TimeoutException
//        props.put("buffer.memory", 33554432);
//        //The key.serializer and value.serializer instruct how to turn the key and value objects the user provides with their ProducerRecord into bytes.
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        //创建kafka的生产者类
//        Producer<String, String> producer = new KafkaProducer<String, String>(props);
//        producer.send(new ProducerRecord<String, String>("test", "测试Kafka"));
//
//        producer.close();
        template.send(topic, key, data);
        return "success";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @KafkaListener(id = "t1", topics = "t1")
    public void listenT1(ConsumerRecord<?, ?> cr) throws Exception {
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

    @KafkaListener(id = "t2", topics = "t2")
    public void listenT2(ConsumerRecord<?, ?> cr) throws Exception {
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

}
