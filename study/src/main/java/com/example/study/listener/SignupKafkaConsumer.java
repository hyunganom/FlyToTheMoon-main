package com.example.study.listener;

import com.example.study.Service.EmailService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SignupKafkaConsumer {

   // @Autowired
   // private EmailService emailService;

    @KafkaListener(topics = "user-email", groupId = "study-group", containerFactory = "kafkaConsumerFactory")
    public void consume(ConsumerRecord<String, String> consumerRecord) {
        System.out.println("Kafka에서 메시지 수신: " + consumerRecord.toString());
        //emailService.sendConfirmationEmail(email);
    }
}
