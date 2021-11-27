package ru.diukova.mail.sender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendEmailService {

    public String sendEmail() {
        log.info("Send SMS");

        return "E-mail was sent!";
    }
}
