package usingxml;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("usingxml/lifecyc.xml");
		ap.close();
	}
}
