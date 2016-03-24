package com.me.you.activemq.jms1;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * Hello world!
 *
 */
public class SynchronousReceiver 
{
    public static void main( String[] args ) throws JMSException
    {
    	Connection connection =new ActiveMQConnectionFactory("tcp://localhost:61616").createConnection();
       
       connection.start();
       
       Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
       
       Queue queue=session.createQueue("EM_TRADE.Q");
       MessageConsumer receiver=session.createConsumer(queue);
       TextMessage msg=(TextMessage)receiver.receive();
      // TextMessage msg=(TextMessage)receiver.receiveNoWait(); //dont wait for message and exit
    // TextMessage msg=(TextMessage)receiver.receive(1000); //wait for 100 milliseconds
     
       System.out.println(msg.getText());
       connection.close();
       
    }
}
