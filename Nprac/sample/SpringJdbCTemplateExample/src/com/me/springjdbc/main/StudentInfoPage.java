package com.me.springjdbc.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.me.springjdbc.dao.IStudentDao;
import com.me.springjdbc.dao.StudentDao;
import com.me.springjdbc.dao.StudentDao2;
import com.me.springjdbc.entities.Student;

public class StudentInfoPage {
	Scanner inputScanner=null;
	
  public static void main(String[] args) {
	
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("magicbeans.xml");
	//StudentDao studentDao=(StudentDao)ctx.getBean("studentDao");
	IStudentDao studentDao=(IStudentDao)ctx.getBean("studentDao2");
	while(true){
	displayStudents(studentDao);
	System.out.println("\n");
	
	
	boolean runOperation=takeUserAction(ctx,studentDao);
	if(!runOperation){
		break;
	}
	
		
	}
}
  
  public static boolean takeUserAction(ApplicationContext ctx,IStudentDao studentDao){
	  UserInputTaker inputTaker=(UserInputTaker)ctx.getBean("inputTaker");
	  String userinput=inputTaker.getScannerInput("Please select one of the actions \n 1.Add Student \n 2.Get Student record \n 3.Update Student record"
	  		+ "\n 4.Delete Student record. \n 5.Exit");
	  try{
		  if(userinput.equals("1")){
			  Student s=createStudent(ctx,studentDao);
		  }else if(userinput.equals("2")){
			  getStudentDetail(ctx, studentDao);
		  }else if(userinput.equals("3")){
			  
		  }else if(userinput.equals("4")){
		  }else if(userinput.equals("5")) {
			  return false;
		  }else{
		  }
			  
		  
	  }catch(Exception e){
		  System.out.println(e.getMessage());
		  System.out.println("Please Try again");
	  }
	  return true;
  }
  public static boolean  ContinueOrExit(ApplicationContext ctx) {
	 
	  UserInputTaker inputTaker=(UserInputTaker)ctx.getBean("inputTaker");
	  if(inputTaker.getScannerInput("\nWould like to add another student? Y/N").equals("Y")){
		  return true;
	  }else{
		  return false;
	  }
  }
  
  public  static boolean updateStudent(ApplicationContext ctx,IStudentDao studentDao){
	  	Student s=new Student();
	  	UserInputTaker inputTaker=(UserInputTaker)ctx.getBean("inputTaker");
	    String id=inputTaker.getScannerInput("Please enter student id:");
	    String name=inputTaker.getScannerInput("Please enter sutdent Name:");
	    String age=inputTaker.getScannerInput("Please enter sutdent age:");
	    
	    return true;
}
  public  static Student createStudent(ApplicationContext ctx,IStudentDao studentDao){
	  	Student s=new Student();
	  	UserInputTaker inputTaker=(UserInputTaker)ctx.getBean("inputTaker");
	    s.setName(inputTaker.getScannerInput("Please enter sutdent Name:"));
	    s.setAge(Integer.parseInt(inputTaker.getScannerInput("Please enter sutdent age:")));
	    s.setGender(inputTaker.getScannerInput("Please enter sutdent gender:").charAt(0));
	    studentDao.saveStudent(s);
	    return s;
  }
  
  public  static void getStudentDetail(ApplicationContext ctx,IStudentDao studentDao){
	  	Student s=new Student();
	  	UserInputTaker inputTaker=(UserInputTaker)ctx.getBean("inputTaker");
	    String id=inputTaker.getScannerInput("Please enter sutdent's id:");
	    Student student=studentDao.getDetail(id);
	    if(student==null){
	    	System.out.println("No student detail found for that student id.");
	    }else{
	    	System.out.printf("\n%s \t %-10.10s \t\t %s \t %s","Id","Name","Age","Gender");
	    		
	  		System.out.printf("\n %d \t %-10.10s \t\t %d \t %c",student.getId(),student.getName(),student.getAge(),student.getGender());
	  	
	    }
	    inputTaker.hasNext("\n\nEnter to Continue");
	   
}
  
  public  static void displayStudents(IStudentDao studentDao){
	  	List<Student> studentList=studentDao.getAllStudents();
	  	System.out.printf("\n%s \t %-10.10s \t\t %s \t %s","Id","Name","Age","Gender");
	  	studentList.forEach((x)->{
	  		System.out.printf("\n %d \t %-10.10s \t\t %d \t %c",x.getId(),x.getName(),x.getAge(),x.getGender());
	  	});
}
  
	
}
