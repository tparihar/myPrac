package com.me.you.activemq.jms2.queue;

import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;

import com.sun.messaging.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class SynchronousReceiver 
{
    public static void main( String[] args ) throws JMSException
    {
    	ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
    	try(JMSContext ctx=cf.createContext();){
    		Queue queue=ctx.createQueue("EM_JMS2_TRADE.Q");
    		/*String body=ctx.createConsumer(queue).receiveBody(String.class);*/
    		Message msg=ctx.createConsumer(queue).receive();
    		String body=msg.getBody(String.class);
    		String trader=msg.getStringProperty("TraderName");
    		
    		System.out.println(body);
    		System.out.println(trader);
    	}
       
    }
}
