package com.bootcamp.ssn.generator;

import java.util.Scanner;
/**
 * 
 * @author Bootcamp User 03
 * This class contains method  to display the initial message and take user's input.
 *
 */
public class SsnForm {
	
	Scanner userInput=null;
	
	private int generateSSN(int optionSelected) {
		int gotoMainMenu = 1;
		

		SSN ssnInfo = SSNGenerator.generateSSN(optionSelected);
		System.out.println("");
		if(ssnInfo!=null){
			System.out.println("Your SSN Number is >>" + ssnInfo.toString());
	    }else{
	    	System.out.println("Oops Something went wrong please try agin");
	    	return gotoMainMenu;
	    }
		
		
		
		while (true) {
			System.out.println("Please enter 1 to continue or 0 to exit");
			System.out.printf(">"); 

			try {
				userInput=new Scanner(System.in);
				gotoMainMenu = userInput.nextInt();
				if (gotoMainMenu == 1 || gotoMainMenu == 0) {
					break;
					
				}
			} catch (Exception e) {
					System.out.println("Please enter valid numbers only\n");
			}

		}
		
		return gotoMainMenu;
	}
	
	public void getSsnGenerationForm() {
		
		boolean keepRunning = true;
		int chosenOption = -1;
		
		while (keepRunning) {
			System.out.println("\n\n");
			System.out.println("---------------------------------------------------");
			System.out.println("SSN Generation Tool");
			System.out.println("---------------------------------------------------");
			System.out.println("1.EAD");
			System.out.println("2.Green Card");
			System.out.println("3.H1B");
			System.out.println("Please choose any option between 1-3");
			System.out.printf(">");
			try {
				userInput=new Scanner(System.in);
				chosenOption = userInput.nextInt();
				if (chosenOption>0 && chosenOption<=3) {
					if (generateSSN(chosenOption) != 1) {
						keepRunning = false;
					}
					
				}else{
					throw new Exception("jk");
				}
			} catch (Exception e) {
				
				System.out.println("Please enter valid options only");
				
			} 
		}
		
		userInput.close();
		
		
	}

}
