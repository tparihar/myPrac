package com.me.you.activemq.jms1.headers;


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Message;
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
    public static void main( String[] args ) throws Exception
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
       TextMessage msg=session.createTextMessage("Testting message");
      // msg.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);//this does not work
       msg.setStringProperty("Sender", "joker");
       sender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
       sender.setTimeToLive(10000);
       displayHeaders(msg);
       sender.send(msg);
       displayHeaders(msg);
       System.out.println("message sent");
       connection.close();
       
    }
    
    public static void displayHeaders(Message msg) throws Exception{
    	System.out.println("JMSDELIVERYMODE : "+msg.getJMSDeliveryMode());
    	System.out.println("JMSMESSAGEID: "+msg.getJMSMessageID());
    	System.out.println("JMSMESSAGEID: "+msg.getJMSType());//message strcuture payload type when communication wiht non messagin system
    	System.out.println("JMSEXPIRATION : "+msg.getJMSExpiration());
    	System.out.println("JMSPRIORITY : "+msg.getJMSPriority());//0-4,5-9
    }
}
