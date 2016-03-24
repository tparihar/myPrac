package com.bootcamp.jms.demo;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Messenger implements MessageListener {

	Connection connection;
	Context ctx;

	public Messenger() {
		try {
			ctx = new InitialContext();
			connection = ((ConnectionFactory) ctx.lookup("ConnectionFactory")).createConnection();
			connection.start();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws NamingException, JMSException {
		Messenger que = new Messenger();

		new Thread() {
			public void run() {
				try {
					que.producer();
				} catch (NamingException | JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();

		new Thread() {
			public void run() {
				try {
					que.reciever();
				} catch (NamingException | JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}

	@SuppressWarnings("resource")
	private void producer() throws NamingException, JMSException {
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue = (Queue) ctx.lookup("jmstest");
		MessageProducer producer = session.createProducer(queue);
		Scanner sc = null;
		while (true) {
			sc = new Scanner(System.in);
			String msg1 = "From vishal :" + sc.nextLine();
			TextMessage msg = session.createTextMessage(msg1);
			producer.send(msg);

		}
	}

	public void reciever() throws NamingException, JMSException {
		Queue queue = (Queue) ctx.lookup("queue");
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		MessageConsumer messageConsumer = session.createConsumer(queue);

		messageConsumer.setMessageListener(new Messenger());
	}

	@Override
	public void onMessage(Message message) {
		try {
			String incomingMsg = ((TextMessage) message).getText();
			System.out.println("From Norbu --" + incomingMsg);

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}

