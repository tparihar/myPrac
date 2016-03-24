package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DemoFactory;
import beans.DemoInterface;

public class FactoryMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car.xml");
		DemoInterface demoInterface = (DemoInterface) ap.getBean("demoFactory");
		demoInterface.demo();
		/*DemoFactory demo = (DemoFactory) ap.getBean("demoFactory");
		DemoInterface demoInterface = demo.getCar();*/
		
	}
	
}
