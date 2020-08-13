package com.vikram.easy;

public class NumberPalindrome {
	public static void main(String[] args) {
		Integer num = 121;
		System.out.println(isPalindrome(num));
	}
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int result = 0;
        int temp = x;
        while (temp > 0) {
			int pop = temp % 10;
			temp /= 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return false;
			result = result * 10 + pop;
		}
        System.out.println("vikram:::"+result+":::x:::" + x);
        if (x==result) return true;
        System.out.println("vikram2:::"+result);
        return false;
    }
}
