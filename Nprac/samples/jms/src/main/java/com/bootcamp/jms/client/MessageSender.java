package com.bootcamp.jms.client;

import java.util.Map;

import org.springframework.jms.core.JmsTemplate;

public class MessageSender {
	   private final JmsTemplate jmsTemplate;

	    public MessageSender(final JmsTemplate jmsTemplate) {
	        this.jmsTemplate = jmsTemplate;
	    }

	    public void send(final String txt) {
	        jmsTemplate.convertAndSend(txt);
	    }
}
