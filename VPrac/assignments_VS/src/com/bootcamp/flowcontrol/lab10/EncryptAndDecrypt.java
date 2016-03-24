package com.bootcamp.flowcontrol.lab10;

import java.util.Scanner;

/**
 * 
 * @author vishal, This class encrypts and decrypt the content entered by user
 *         in the console
 *
 */
public class EncryptAndDecrypt {

	public static void main(String[] args) {

		EncryptAndDecrypt ead = new EncryptAndDecrypt();
		int[] processedUserInput = ead.userInput();
		int[] userDigit1 = ead.encryptDigits(processedUserInput);

		int[] processedUserInput1 = ead.userInput();
		ead.decryptDigits(processedUserInput1);

	}

	public int[] encryptDigits(int[] userDigits1) {

		for (int i = 0; i < userDigits1.length; i++) {
			userDigits1[i] = ((userDigits1[i] + 7) % 10);
		}
		int temp = userDigits1[0];
		userDigits1[0] = userDigits1[2];
		userDigits1[2] = temp;
		int temp1 = userDigits1[1];
		userDigits1[1] = userDigits1[3];
		userDigits1[3] = temp1;
		for (int i = 0; i < 4; i++) {
			System.out.print(userDigits1[i]);
		}
		return userDigits1;
	}

	public void decryptDigits(int[] decryptDigit) {

		for (int i = 0; i < 4; i++) {
			if (decryptDigit[i] <= 6 && decryptDigit[i] >= 0)
				decryptDigit[i] = ((decryptDigit[i] + 10) - 7);
			else {
				decryptDigit[i] = (decryptDigit[i] - 7);
			}

		}
		int temp = decryptDigit[0];
		decryptDigit[0] = decryptDigit[2];
		decryptDigit[2] = temp;

		int temp1 = decryptDigit[1];
		decryptDigit[1] = decryptDigit[3];
		decryptDigit[3] = temp1;

		for (int i = 0; i < 4; i++) {
			System.out.print(decryptDigit[i]);
		}
	}

	public int[] userInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the digits");
		int userDigits = sc.nextInt();

		int firstDigit = userDigits / 1000;
		int secondDigit = userDigits / 100 % 10;
		int thirdDigit = userDigits / 10 % 10;
		int fourthDigit = userDigits / 1 % 10;
		int[] digitArray = { firstDigit, secondDigit, thirdDigit, fourthDigit };

		return digitArray;
	}
}
