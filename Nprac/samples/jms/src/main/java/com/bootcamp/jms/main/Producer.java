package com.bootcamp.jms.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bootcamp.jms.client.MessageSender;

public class Producer {
	
  public static void main(String[] args) {
	  ApplicationContext context = 
	             new ClassPathXmlApplicationContext("jms3-config.xml");
	MessageSender sender =(MessageSender)context.getBean("messageSender");
	Scanner scanner=new Scanner(System.in);
	String input="start";
	while(!input.equals("end")){
		System.out.print("send message:");
		input=scanner.nextLine();
	/*Map<String,String> message=new HashMap<>();
	message.put("Name", input);*/
	sender.send(input);
	}
	scanner.close();
	((ClassPathXmlApplicationContext)context).close();
}
  
}
