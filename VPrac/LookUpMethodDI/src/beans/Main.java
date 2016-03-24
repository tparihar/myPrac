package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car.xml");
	Car car = (Car)ap.getBean("myCar");
	System.out.println(car.getClass());
	System.out.println(car.drive().getMyCar());
	
	
	Hello hello = (Hello)ap.getBean("hello");
	System.out.println(hello.getClass());
	System.out.println(hello.truckEngine().getMyCar());
}
}
