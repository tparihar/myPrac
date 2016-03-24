package com.bootcamp.jms.demo;

import java.util.Date;
import java.util.Hashtable;

import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueProducerjboss {
	public static void main(String[] args) throws JMSException, NamingException {

		Hashtable<String, String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

		Context cxt = new InitialContext(env);
		Queue queue = (Queue) cxt.lookup("jms/queue/PlayQueue");
		QueueConnectionFactory connectionFactory = (QueueConnectionFactory) cxt.lookup("jms/RemoteConnectionFactory");
		JMSContext jmsContext = connectionFactory.createContext("user", "user");
		/*
		 * con = connectionFactory.createQueueConnection("user", "user");
		 * QueueSession session = con.createQueueSession(false,
		 * Session.AUTO_ACKNOWLEDGE);
		 */
		JMSProducer jmsProducer = jmsContext.createProducer();
		jmsProducer.send(queue, "hi guys todays date is" + new Date());
		/*
		 * TextMessage message = session.createTextMessage(
		 * "hi guys todays date is" + new Date()); messageProducer.send(messag);
		 */
		System.out.println("Message sent successfully");
		System.out.println("Connection closed succesfully");
	}

}
