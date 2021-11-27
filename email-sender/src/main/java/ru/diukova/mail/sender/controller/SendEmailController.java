package ru.diukova.mail.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.diukova.mail.sender.service.SendEmailService;

@RestController
public class SendEmailController {

    @Autowired
    SendEmailService sendEmailService;

    public SendEmailController() {
    }

    @GetMapping("/email")
    public String sendEmail() {
        return sendEmailService.sendEmail();
    }
}