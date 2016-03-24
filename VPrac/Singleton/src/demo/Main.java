package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/single.xml");
		/*
		 * Singleton s1 = (Singleton)ap.getBean("single"); Singleton s2 =
		 * (Singleton)ap.getBean("single");
		 * 
		 * System.out.println(s1==s2);
		 */

		/*
		 * Singleton single = (Singleton)ap.getBean("single");
		 * single.getSingleton();
		 */
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);

	}
}
