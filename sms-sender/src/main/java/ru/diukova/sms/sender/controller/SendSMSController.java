package ru.diukova.sms.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.diukova.sms.sender.service.SendSMSService;

@RestController
public class SendSMSController {

    @Autowired
    private SendSMSService sendSMSService;

    public SendSMSController() {
    }

    @GetMapping("/sms")
    public String sendSms() {
       return sendSMSService.sendSMS();
    }
}