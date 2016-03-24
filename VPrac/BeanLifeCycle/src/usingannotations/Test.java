package usingannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test {
	
	@PostConstruct
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method has been invoked by annotations");
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destory method has been invoked by annotations");

	}
}
