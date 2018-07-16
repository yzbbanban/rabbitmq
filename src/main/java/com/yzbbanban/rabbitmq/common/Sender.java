package com.yzbbanban.rabbitmq.common;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by brander on 2018/7/11
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender: " + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }
}
