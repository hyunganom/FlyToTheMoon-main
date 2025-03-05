package com.example.study.Service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendConfirmationEmail(String email) {
        // 실제 이메일 발송 로직 (예: JavaMailSender 이용) 생략
        System.out.println("이메일 발송 시작: " + email);
        // 이메일 발송 지연을 가정한 코드 (동기적 처리)
        try {
            Thread.sleep(2000); // 2초 지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("이메일 발송 완료: " + email);
    }
}
