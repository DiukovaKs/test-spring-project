package ru.diukova.push.sender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendPushService {

    public String sendPush() {
        log.info("Send Push");

        return "Push was sent!";
    }
}
