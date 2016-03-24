package com.bootcamp.datatypes.string.lab4;

/**
 * 
 * @author Vishal This class splits the string into substring and performs
 *         string operations
 *
 */
public class StringSplitOperation {

	public static void main(String[] args) {

		String sponge = "324, 457, 112, 259, 323, 222";
		int[] spongeArray = new int[6];
		int regex = 0;
		int limit = 3;
		for (int i = 0; i < 6; i++) {
			spongeArray[i] = Integer.parseInt(sponge.substring(regex, limit));
			if (i >= 1) {
				regex = regex + 5;
				limit = limit + 5;
				spongeArray[i] = Integer.parseInt(sponge.substring(regex, limit));
			}
		}

		StringSplitOperation sso = new StringSplitOperation();
		sso.splitDigits(spongeArray);
	}

	public void splitDigits(int[] spongeArray) {

		int[] digitArray = new int[18];
		int j = 0;
		for (int i = 0; i < 6; i++) {
			digitArray[j] = spongeArray[i] / 100;
			j = j + 1;
			digitArray[j] = ((spongeArray[i] / 10) % 10);
			j = j + 1;
			digitArray[j] = ((spongeArray[i] / 1) % 10);
			j = j + 1;
		}

		int[] maxArray = new int[18];
		int max = 0;
		int p = 0;
		int[] a = new int[6];
		for (int k = 0; k < 6; k++) {
			a[k] = (int) (digitArray[p] + digitArray[p + 1] + digitArray[p + 2]);
			p = p + 3;
			if (max <= a[k]) {
				max = a[k];
			}
		}
		int k = 0;
		for (int i = 0; i < 6; i++) {
			if (a[i] == max) {
				maxArray[k] = spongeArray[i];
				k++;
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(maxArray[i]);
		}

	}
}
