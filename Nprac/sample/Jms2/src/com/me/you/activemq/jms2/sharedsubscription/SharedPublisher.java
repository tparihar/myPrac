package com.me.you.activemq.jms2.sharedsubscription;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Topic;

public class SharedPublisher {
	
	public static void main(String[] args) {
		ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
		try(JMSContext ctx=cf.createContext();){
			Topic topic=ctx.createTopic("EM_JMS2_TRADE.T");
			DecimalFormat df=new DecimalFormat("##.00");
			String price;
			JMSProducer producer=ctx.createProducer();
			
			Scanner s=new Scanner(System.in);
			
			while(s.next()!="end"){
				price=df.format(98.0+Math.random());
				producer.send(topic, price);
				System.out.println("Message published");
			}
			s.close();
			
		}
	}

}
