package ru.diukova.message.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.diukova.message.sender.MessageSenderClient;

@RestController
public class MessageSenderController {

    @Autowired
    private MessageSenderClient messageSenderClient;

    @GetMapping("/{param}")
    String sendMessage(@PathVariable String param) {
        String result = "No such sender application";

        switch (param) {
            case "email":
                result = messageSenderClient.sendEmail();
                break;
            case "push":
                result = messageSenderClient.sendPush();
                break;
            case "sms":
                result = messageSenderClient.sendSms();
                break;
            default: break;
        }

        return result;
    }
}