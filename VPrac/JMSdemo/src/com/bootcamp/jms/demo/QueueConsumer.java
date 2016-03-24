/*package com.bootcamp.jms.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueConsumer implements MessageListener {

	public static Connection con = null;

	public static void main(String[] args) throws NamingException, JMSException {
		Context ctx = new InitialContext();
		Connection connection = ((ConnectionFactory) ctx.lookup("ConnectionFactory")).createConnection();
		
	

}
*/