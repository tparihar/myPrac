package com.me.you.activemq.jms2.sharedsubscription;

import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Topic;

public class Subscriber implements MessageListener{
	
	public Subscriber(){
		try{
			ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
			JMSContext ctx=cf.createContext();
			Topic topic=ctx.createTopic("EM_JMS2_TRADE.T");
			JMSConsumer consumer=ctx.createConsumer(topic);
			consumer.setMessageListener(this);
			System.out.println("wating on messages");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void onMessage(Message message) {
		try{
			System.out.println(message.getBody(String.class));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Subscriber sub=new Subscriber();
	}

}
