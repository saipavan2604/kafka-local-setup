package com.kafka.producer.service;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class Consumer {

    @KafkaListener(topics="mytopic",groupId="mygroup")
    public void consumeFromTopic(String message){
        System.out.println("Consumed message "+message);
    }

}
