package ru.diukova.message.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MessageSenderClient {
    private static final Logger LOG = LoggerFactory.getLogger(MessageSenderClient.class);

    private final RestTemplate loadBalancedTemplate;

    MessageSenderClient(@LoadBalanced RestTemplate loadBalancedTemplate) {
        this.loadBalancedTemplate = loadBalancedTemplate;
    }

    public String sendEmail() {
        LOG.debug("Sending  request for email {}");

        return loadBalancedTemplate.getForObject("http://proxy/email", String.class);
    }

    public String sendPush() {
        LOG.debug("Sending  request for push {}");

        return loadBalancedTemplate.getForObject("http://proxy/push", String.class);
    }

    public String sendSms() {
        LOG.debug("Sending  request for sms {}");

        return loadBalancedTemplate.getForObject("http://proxy/sms", String.class);
    }
}