package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DemoStaticVariable;

public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/demo.xml");
		DemoStaticVariable demo = (DemoStaticVariable) ap.getBean("demo");
		demo.show();

	}
}
