package com.bootcamp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		SpringDemo springDemo = ap.getBean("springDemo", SpringDemo.class);
		springDemo.getDetails();

	}

}
