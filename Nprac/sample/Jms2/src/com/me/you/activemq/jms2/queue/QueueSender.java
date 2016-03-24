package com.me.you.activemq.jms2.queue;




import javax.jms.DeliveryMode;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



import com.sun.messaging.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class QueueSender 
{
    public static void main( String[] args ) throws JMSException, NamingException
    {
    	
    	
    	ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
    
    	try(JMSContext ctx=cf.createContext()){
    		Queue queue=ctx.createQueue("EM_JMS2_TRADE.Q");
    		ctx.createProducer().setProperty("TraderName", "Police").
    		setDeliveryMode(DeliveryMode.NON_PERSISTENT).
    		send(queue, "SELLING APPL 100 SHARES");
    		System.out.println("message sent");
    	}
   /* 	Context ctx=new InitialContext();
    	Connection connection=((ConnectionFactory)ctx.lookup("ConnectionFactory")).createConnection();*/
      /* ActiveMQConnectionFactory cf=new ActiveMQConnectionFactory("tcp://localhost:61616");
       Connection connection=cf.createConnection();
       connection.start();
       
       Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
       
       Queue queue=session.createQueue("EM_TRADE.Q");*/
    	
    
       
    }
}
