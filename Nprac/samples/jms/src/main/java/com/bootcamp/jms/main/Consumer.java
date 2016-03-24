package com.bootcamp.jms.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
public static void main(String[] args) {
	ApplicationContext context = 
            new ClassPathXmlApplicationContext("jms2-config.xml");
	
	// sleep for 1 second
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
   
    // close application context
    //((ClassPathXmlApplicationContext)context).close();

}
}
