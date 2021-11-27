package ru.diukova.sms.sender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendSMSService {

    public String sendSMS() {
        log.info("Send SMS");

        return "SMS was sent!";
    }
}
