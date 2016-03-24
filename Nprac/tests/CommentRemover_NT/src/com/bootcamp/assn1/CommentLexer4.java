package com.bootcamp.assn1;

import java.util.LinkedList;

public class CommentLexer4 {

	private enum State {
		A, B, C, D
	}

	public static String stripComments(String sources) {
		LinkedList<Integer> stack1 = new LinkedList<Integer>();

		int value = -1;

		int nextIndex = 0;

		String dataToPut = "";

		while ((value = sources.indexOf("(*", nextIndex)) != -1 || (value = sources.indexOf("*)", nextIndex)) != -1) {
			if (sources.substring(value, value + 2).equals("(*")) {
				
				if (stack1.isEmpty()) {
					dataToPut = dataToPut + sources.substring(0, value);
					sources = sources.substring(value + 2);
					stack1.push(1);
					nextIndex = 0;
				} else {
					nextIndex = value + 2;

				}

			} else if (sources.substring(value, value + 2).equals("*)")) {

				if (!stack1.isEmpty()) {
					stack1.pop();
					sources = sources.substring(value + 2);
					nextIndex = 0;

				} else {

					nextIndex = value + 2;
				}

			}

		}

		if (!stack1.isEmpty()) {
			throw new UnterminatedCommentExn();
		}
		
		return dataToPut + sources;

	}

}
