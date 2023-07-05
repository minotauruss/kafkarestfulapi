package com.kafkapi.kafkarestfulapi.controller;

import com.kafkapi.kafkarestfulapi.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class Controller {


    @Autowired
    Producer producer;
    @GetMapping("/producer")
    public void getMessageProducer(@RequestParam("message") String message){
        producer.getProducerService(message);

    }
}
