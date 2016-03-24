package com.me.you.activemq.jms2.deliverydelay;

import java.util.concurrent.CountDownLatch;

import javax.jms.CompletionListener;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.Queue;

public class DelaySender {
	public static void main(String[] args) throws Exception {
		ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
		try(JMSContext ctx=cf.createContext();){
			Queue queue=ctx.createQueue("EM_JMS2_TRADE.Q");
			
		
			
			
			ctx.createProducer().setDeliveryDelay(5000).send(queue, "Test Message");
			System.out.println("Message Sent");
		
			
			
		}
		
	}

}

