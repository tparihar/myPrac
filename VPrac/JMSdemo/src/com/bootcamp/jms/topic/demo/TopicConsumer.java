package com.bootcamp.jms.topic.demo;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TopicConsumer implements MessageListener {

	static TopicConnection connection;

	public static void main(String[] args) throws NamingException, JMSException {
		Hashtable<String, String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		env.put(Context.PROVIDER_URL, "t3://localhost:7001");

		Context context = new InitialContext(env);
		Topic topic = (Topic) context.lookup("jms/demotopic");
		TopicConnectionFactory connectionFactory = (TopicConnectionFactory) context.lookup("jms/demo");
		connection = connectionFactory.createTopicConnection();
		TopicSession session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		session.createSubscriber(topic).setMessageListener(new TopicConsumer());
		connection.start();
		System.out.println("Reciveing......");
	}

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("hi");
			String incomingMsg = ((TextMessage) message).getText();
			System.out.println("Incoming message" + incomingMsg);
			connection.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
