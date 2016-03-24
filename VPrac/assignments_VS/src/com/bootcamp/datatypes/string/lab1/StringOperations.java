package com.bootcamp.datatypes.string.lab1;

/**
 * 
 * @author Vishal This class performs differ operations on String using String
 *         methods
 *
 */
public class StringOperations {

	public static void main(String[] args) {

		String sponge = "Hello how are you?";

		/* Number of words in above string */
		String[] numberOfWords = sponge.split("\\s");
		System.out.println("Number of words in {" + sponge + "} are " + numberOfWords.length);

		/* Length of string */
		System.out.println("Length of string {" + sponge + "} is " + sponge.length());

		/* replacing all occurrences of hello with HELLO */
		System.out.println("replacing all occurrences of hello with HELLO " + sponge.replaceAll("Hello", "HELLO"));

		/* replacing all occurrences of spaces with comma */
		System.out.println("String {" + sponge + "} after replacing occurence of space with comma(,)"
				+ sponge.replaceAll("\\s", ","));

		/* Finding first 3 character of the above string */
		System.out.println("first 3 character of the above string are " + sponge.substring(0, 3));

		StringOperations so = new StringOperations();
		so.equalsChecker();
		so.stringPalidrome();
		so.occurenceOfA();
		so.containsSubString();

	}

	public void equalsChecker() {

		/* Comparing whether the string is equal or not */
		String sponge1 = "hello";
		System.out.println("Is hello equals to HELLO ---" + sponge1.equals("HELLO"));
	}

	public void stringPalidrome() {
		/* Checking whether the string is Palindrome or not */
		String name = "nitin";
		char[] nameChar = name.toCharArray();
		char[] nameChar1 = new char[nameChar.length];

		int j = nameChar.length - 1;
		for (int i = 0; i < nameChar.length; i++) {
			while (j >= 0) {
				nameChar1[j] = nameChar[i];
				j--;
				break;
			}
		}
		String reversedName = nameChar1.toString();
		if (name.equals(reversedName)) {
			System.out.println(name + " is a palidrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}

	}

	public void occurenceOfA() {
		/* Checking occurrence of A */
		String hello = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		char[] hello1 = hello.toCharArray();
		int occurenceofA = 0;

		for (int i = 0; i < hello1.length; i++) {
			if (hello1[i] == 'A') {
				occurenceofA++;
			}
		}
		System.out.println("Occurence of A is " + occurenceofA);
	}

	public void containsSubString() {
		/* Checking for Substring */
		String sponge = "This  is a java institute of insurance and insu.";
		System.out.println("Does {" + sponge + "} contains institute ---" + sponge.contains("institute"));
		System.out.println(sponge.replace("institute", "JSStitute"));

	}
}
