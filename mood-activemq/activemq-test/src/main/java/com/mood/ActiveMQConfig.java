package com.mood;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */
@Configuration
public class ActiveMQConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("sample.queue");
    }
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("sample.topic");
    }
    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory("admin", "admin", "tcp://192.168.31.231:61616");
    }
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ActiveMQConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(connectionFactory);
        return bean;
    }
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ActiveMQConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(connectionFactory);
        return bean;
    }
    @Bean
    public JmsMessagingTemplate jmsMessagingTemplate(ActiveMQConnectionFactory connectionFactory){
        return new JmsMessagingTemplate(connectionFactory);
    }
}
