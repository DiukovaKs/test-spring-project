package ru.diukova.message.sender.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.diukova.message.sender.service.SendMessageService;

@Slf4j
@RestController
public class MessageSenderController {

    @Autowired
    public SendMessageService sendMessageService;

    @GetMapping("/{param}")
    String sendMessage(@PathVariable String param) {
        return sendMessageService.sendMessage(param);
    }
}