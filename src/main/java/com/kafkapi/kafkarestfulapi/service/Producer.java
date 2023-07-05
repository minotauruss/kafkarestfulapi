package com.kafkapi.kafkarestfulapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String,String> KafkaTemplate;



    public void getProducerService( String message){
        KafkaTemplate.send("myTopic",message);
    }
}
