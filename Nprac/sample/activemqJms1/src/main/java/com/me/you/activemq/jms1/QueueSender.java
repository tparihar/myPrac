package com.me.you.activemq.jms1;


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * Hello world!
 *
 */
public class QueueSender 
{
    public static void main( String[] args ) throws JMSException, NamingException
    {
    	
    	Context ctx=new InitialContext();
    	Connection connection=((ConnectionFactory)ctx.lookup("ConnectionFactory")).createConnection();
      /* ActiveMQConnectionFactory cf=new ActiveMQConnectionFactory("tcp://localhost:61616");
       Connection connection=cf.createConnection();
       connection.start();
       
       Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
       
       Queue queue=session.createQueue("EM_TRADE.Q");*/
    	
    Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
       Queue queue=(Queue)ctx.lookup("EM_TRADE.Q");
       MessageProducer sender=session.createProducer(queue);
       TextMessage msg=session.createTextMessage(args[0]);
       msg.setStringProperty("Sender", "joker");
       sender.send(msg);
       System.out.println("message sent");
       connection.close();
       
    }
}
