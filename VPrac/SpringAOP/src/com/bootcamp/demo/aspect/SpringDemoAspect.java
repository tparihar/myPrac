package com.bootcamp.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SpringDemoAspect {

	@Before("allGetters()")
	public void before() {
		System.out.println("before");
	}

	@After("allGetters()")
	public void after() {
		System.out.println("after");
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {}

	public String around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before");
		String str = (String) joinPoint.proceed();
		System.out.println("after");
		return str;
	}

}
