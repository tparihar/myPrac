package com.me.you.activemq.jms2.asyncsend;

import java.util.concurrent.CountDownLatch;

import javax.jms.CompletionListener;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.Queue;

public class AyncSender {
	public static void main(String[] args) throws Exception {
		ConnectionFactory cf=new com.sun.messaging.ConnectionFactory();
		try(JMSContext ctx=cf.createContext();){
			Queue queue=ctx.createQueue("EM_JMS2_TRADE.Q");
			
			CountDownLatch latch=new CountDownLatch(1);
			MyCompletionListener cl=new MyCompletionListener(latch);
			
			
			ctx.createProducer().setAsync(cl).send(queue, "Test Message");
			System.out.println("Message Sent");
			for(int i=0;i<5;i++){
				System.out.println("processing.........");
				Thread.sleep(1000);
			}
			latch.await();
			System.out.println("end processing");
		}
		
	}

}

class MyCompletionListener implements CompletionListener{
	public CountDownLatch latch=null;
	
	 public MyCompletionListener(CountDownLatch latch) {
		this.latch=latch;
	}

	@Override
	public void onCompletion(Message arg0) {
		latch.countDown();
		System.out.println("message acknowledged by server");
		
	}

	@Override
	public void onException(Message arg0, Exception arg1) {
		latch.countDown();
		System.out.println("unable to send message "+arg1);
		
	}
	
}
