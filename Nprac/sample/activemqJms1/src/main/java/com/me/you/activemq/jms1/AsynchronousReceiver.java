package com.me.you.activemq.jms1;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * Hello world!
 *
 */
public class AsynchronousReceiver implements MessageListener
{
	
	public AsynchronousReceiver() throws JMSException{
		Connection connection=new ActiveMQConnectionFactory().createConnection();
		connection.start();
		Session session =connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue=session.createQueue("EM_TRADE.Q");
		MessageConsumer receiver=session.createConsumer(queue);
		receiver.setMessageListener(this);
		System.out.println("wait for message");
	}
    public static void main( String[] args ) throws JMSException
    {
    	AsynchronousReceiver obj=new AsynchronousReceiver();
       
    }

	public void onMessage(Message message) {
		TextMessage msg=(TextMessage)message;
		try {
			System.out.println(msg.getText());
			System.out.println("Sender: "+msg.getStringProperty("Sender"));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
