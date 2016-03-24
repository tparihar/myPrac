package com.bootcamp.jms.client;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MessageReceiver implements MessageListener{

	@Override
	public void onMessage(Message message) {
		final TextMessage mapMessage = (TextMessage) message;
		try {
			System.out.println("Got Message:"+mapMessage.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
