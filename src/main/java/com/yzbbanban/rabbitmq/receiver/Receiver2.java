package com.yzbbanban.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by brander on 2018/7/11
 */
@Component
@RabbitListener(queues = "hello2")
public class Receiver2 {
    @RabbitHandler
    public void process(String hello2) {
        System.out.println("Receiver2: " + hello2);
    }
}
