package com.bootcamp.introduction.lab3;

/**
 * @author Vishal This class generates FightSong output in a single method using
 *         one print statement.
 *
 */
public class FightSong {

	public static void main(String[] args) {
		
		printLine1();
		
	}
	
	public static void printLine1() {

		String firstline = "\nGo, team, go!\nYou can do it.\n";
		String secondLine = "\nGo, team, go!\nYou can do it.\n" + "You're the best,\nIn the West.\n"
				+ "Go, team, go!\nYou can do it.\n";

		System.out.println(firstline + secondLine + secondLine + firstline);
	}

}
