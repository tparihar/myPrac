package com.bootcamp.assn1;


/**
 * 
 * @author Bootcamp User 03
 * This class contains method to remove commented sections from the string
 *
 */
public class CommentLexer {

	private enum State {
		A, B, C, D
	}
	

	public static String stripComments(String sources) {
		
		

		int value = -1;

		int nextIndex = 0;

		String dataToPut = "";
		
		boolean foundFirstFlag=false;

		while ((value = sources.indexOf("(*", nextIndex)) != -1 || (value = sources.indexOf("*)", nextIndex)) != -1) {
			if (sources.substring(value, value + 2).equals("(*")) {
				/* if this is the first time we are seeing '/*' symbol
				 * copy all the value till this index to the data to print
				 * and generate a new string containing all the values after the index of '/*'
				 * and set foundFirstFlag to true
				 */
				 
				if (!foundFirstFlag) {
					dataToPut = dataToPut + sources.substring(0, value);
					sources = sources.substring(value + 2);
					foundFirstFlag=true;
					nextIndex = 0;
				} else {
					nextIndex = value + 2;

				}

			} else if (sources.substring(value, value + 2).equals("*)")) {
				/* if   '/*' symbol has been found already then
				 *  generate a new string containing all the values after the index of '\*\/'
				 * and set foundFirstFlag to false
				 */
				if (foundFirstFlag) {
					
					sources = sources.substring(value + 2);
					nextIndex = 0;
					foundFirstFlag=false;
				} else {

					nextIndex = value + 2;
				}

			}

		}

		if (foundFirstFlag) {
			
			throw new UnterminatedCommentExn();
		}
		
		return dataToPut + sources;

	}
	
	

}
