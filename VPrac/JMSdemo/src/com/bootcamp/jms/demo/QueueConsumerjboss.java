package com.bootcamp.jms.demo;

import java.util.Hashtable;

import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueConsumerjboss implements MessageListener {

	/* public static QueueConnection con = null; */

	public static void main(String[] args) throws NamingException, JMSException {

		Hashtable<String, String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

		Context cxt = new InitialContext(env);
		Queue queue = (Queue) cxt.lookup("jms/queue/PlayQueue");
		QueueConnectionFactory connectionFactory = (QueueConnectionFactory) cxt.lookup("jms/RemoteConnectionFactory");
		JMSContext jmsContext = connectionFactory.createContext("user", "user");
		JMSConsumer jmsConsumer = jmsContext.createConsumer(queue);
		jmsConsumer.setMessageListener(new QueueConsumerjboss());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * con = connectionFactory.createQueueConnection("user", "user");
		 * QueueSession session = con.createQueueSession(false,
		 * Session.AUTO_ACKNOWLEDGE); MessageConsumer messageConsumer =
		 * session.createConsumer(queue); messageConsumer.setMessageListener(new
		 * QueueConsumerjboss()); con.start();
		 */
		System.out.println("Recieveing msg.......");
	}

	@Override
	public void onMessage(Message message) {
		try {
			String incomingMsg = ((TextMessage) message).getText();
			System.out.println(incomingMsg);
			/*
			 * con.close(); System.out.println("Connection successfully closed"
			 * );
			 */
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
