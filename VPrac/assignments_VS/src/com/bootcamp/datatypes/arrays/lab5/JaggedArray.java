package com.bootcamp.datatypes.arrays.lab5;

/**
 * 
 * @author vishal This class shows an example of multidimensional array
 *
 */
public class JaggedArray {

	public static void main(String[] args) {

		String[][] tutorialInfo = new String[5][4];

		tutorialInfo[0][0] = "StudentName  ";
		tutorialInfo[0][1] = "Tutorial1    ";
		tutorialInfo[0][2] = "Tutorial2    ";
		tutorialInfo[0][3] = "Tutorial3    ";

		tutorialInfo[1][0] = "Tony         ";
		tutorialInfo[1][1] = "Java         ";
		tutorialInfo[1][2] = "C            ";
		tutorialInfo[1][3] = "C++          ";

		tutorialInfo[2][0] = "Thomas       ";
		tutorialInfo[2][1] = "Java         ";
		tutorialInfo[2][2] = "Unix         ";
		tutorialInfo[2][3] = null;

		tutorialInfo[3][0] = "Dinil        ";
		tutorialInfo[3][1] = "Linux        ";
		tutorialInfo[3][2] = "Oracle       ";
		tutorialInfo[3][3] = null;

		tutorialInfo[4][0] = "Delvin       ";
		tutorialInfo[4][1] = "RDBMS        ";
		tutorialInfo[4][2] = "C#           ";
		tutorialInfo[4][3] = "Oracle       ";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print(tutorialInfo[i][j]);

			}
			System.out.println("");
		}
		System.out.println("\nDelvin details\n");
		for (int i = 0; i < 4; i++) {
			System.out.print(tutorialInfo[0][i]);
			System.out.println(tutorialInfo[4][i]);

		}
	}

}
