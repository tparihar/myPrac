package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Cars;

public class Service {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		 Cars car = (Cars)ap.getBean("cars");
		 car.printCarData();
	}
}
