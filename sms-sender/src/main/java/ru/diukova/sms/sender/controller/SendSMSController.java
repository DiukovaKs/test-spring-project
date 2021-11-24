package ru.diukova.sms.sender.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendSMSController {
    private static final Logger LOG = LoggerFactory.getLogger(SendSMSController.class);

    public SendSMSController() {
    }

    @GetMapping("/sms")
    public String sendSms() {
        LOG.info("Send SMS");

        return "Send SMS!";
    }
}