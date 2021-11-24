package ru.diukova.push.sender.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendPushController {
    private static final Logger LOG = LoggerFactory.getLogger(SendPushController.class);

    public SendPushController() {
    }

    @GetMapping("/push")
    public String sendSms() {
        LOG.info("Send push");

        return "Send Push!";
    }
}