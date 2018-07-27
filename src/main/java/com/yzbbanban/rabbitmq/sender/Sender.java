package com.yzbbanban.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by brander on 2018/7/11
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(int i) {
        String context = "hello: " + i ;
        System.out.println("Sender: " + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }


}
