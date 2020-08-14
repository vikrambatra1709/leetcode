package com.vikram.easy;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
	
	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isClosing(c)) {
				if(stack.isEmpty()) return false;
				if(!isPair(stack.lastElement().charValue(), c)) return false;
				stack.pop();
				continue;
			}
			stack.push(Character.valueOf(c));
		}
		if (stack.isEmpty()) return true;
        return false;
    }
	
	private static boolean isClosing(char c) {
		return (c == '}' || c == ']' || c == ')');
	}

	private static boolean isPair(char a, char b) {
		return ((a=='{' && b == '}') || (a=='[' && b == ']') || (a=='(' && b == ')'));
	}

}

