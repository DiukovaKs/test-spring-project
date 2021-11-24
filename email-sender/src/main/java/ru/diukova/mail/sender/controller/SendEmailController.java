package ru.diukova.mail.sender.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmailController {
    private static final Logger LOG = LoggerFactory.getLogger(SendEmailController.class);

    public SendEmailController() {
    }

    @GetMapping("/email")
    public String sendEmail() {
        LOG.info("Send E-mail");

        return "Send E-mail!";
    }
}