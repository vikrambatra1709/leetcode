package com.vikram.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] input = {"flower","flow","flight"};
		char [] result = new char[input[0].length()];
		//StringBuilder result = new StringBuilder("");
		int match = 0;
		for (int i = 0; i < input[0].length(); i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[j].length() == i || input[j].charAt(i) != input[0].charAt(i)) {
					break;
				}
				if (j == input.length -1)
					match = 1;
			}
			if (match == 0) break;
			result[i] = (input[0].charAt(i));
			match = 0;
		}
		System.out.println(String.valueOf(result));
	}

}
