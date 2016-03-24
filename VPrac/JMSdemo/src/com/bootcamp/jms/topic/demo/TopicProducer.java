package com.bootcamp.jms.topic.demo;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TopicProducer {

	public static void main(String[] args) throws NamingException, JMSException {

		Hashtable<String, String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		env.put(Context.PROVIDER_URL, "t3://localhost:7001");

		Context context = new InitialContext(env);
		Topic topic = (Topic) context.lookup("jms/demotopic");
		TopicConnectionFactory connectionFactory = (TopicConnectionFactory) context.lookup("jms/demo");
		TopicConnection connection = connectionFactory.createTopicConnection();
		TopicSession session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicPublisher topicPublisher = session.createPublisher(topic);
		TextMessage textMessage = session.createTextMessage("Hi guys how are you??");
		topicPublisher.publish(textMessage);
		System.out.println("message succesfully sent!!!!");
		topicPublisher.close();
		session.close();
		connection.close();
		System.out.println("connection closed successfully");

	}
}
