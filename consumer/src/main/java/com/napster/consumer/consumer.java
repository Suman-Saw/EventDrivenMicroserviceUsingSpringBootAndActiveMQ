package com.napster.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class consumer {
    @JmsListener(destination = "standalone.queue",containerFactory = "jmsListenerContainerFactory")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
