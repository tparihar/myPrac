package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/bank.xml");
		Bank bank = (Bank) ap.getBean("bank");
		bank.calculateInt();
		bank.deposite();
		bank.withdraw();
	}
}
