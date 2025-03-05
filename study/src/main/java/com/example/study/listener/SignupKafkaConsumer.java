package com.example.study.listener;

import com.example.study.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SignupKafkaConsumer {

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "user-email", groupId = "signup-email-group")
    public void consume(String email) {
        System.out.println("Kafka에서 메시지 수신: " + email);
        emailService.sendConfirmationEmail(email);
    }
}
