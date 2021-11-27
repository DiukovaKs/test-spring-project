package ru.diukova.push.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.diukova.push.sender.service.SendPushService;

@RestController
public class SendPushController {

    @Autowired
    SendPushService sendPushService;

    public SendPushController() {
    }

    @GetMapping("/push")
    public String sendSms() {
        return sendPushService.sendPush();
    }
}