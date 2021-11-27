package ru.diukova.message.sender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.diukova.message.sender.MessageSenderClient;

@Slf4j
@Service
public class SendMessageService {

    @Autowired
    private MessageSenderClient messageSenderClient;

    public String sendMessage(String param) {
        String result = "No such sender application";
        log.info("get request");

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
