package com.bootcamp.demo;

public class SpringDemo {

	private String name;
	private int age;

	public SpringDemo() {

	}

	public SpringDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getDetails() {
		System.out.println("Name is  " + this.name + " and age is " + this.age);
	}
}
