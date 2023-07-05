package com.kafkapi.kafkarestfulapi.service;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics ="myTopic",groupId="myTopic_group")
    public void getConsumer(String message){
        System.out.print(message);
    }
}
