package leetcode.mediumproblems;

import java.util.ArrayList;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/string-to-integer-atoi/#/description
 */
public class StringToInteger {

	public int myAtoi(String str) {
		String trimmedStr = str.trim();
		boolean firstCharIsSign = false;
		boolean isPositive = true;
		int previousSum = 0;
		if (trimmedStr.length() == 0 || (!(trimmedStr.charAt(0) != '+' || trimmedStr.charAt(0) != '-') && trimmedStr.charAt(0) < 48 || trimmedStr.charAt(0) > 57)) {
			return 0;
		} else {
			if (trimmedStr.charAt(0) == '-') {
				isPositive = false;
				firstCharIsSign = true;
			} else if (trimmedStr.charAt(0) == '+') {
				isPositive = true;
				firstCharIsSign = true;
			}
			ArrayList<Character> charArray = new ArrayList<Character>();
			if (firstCharIsSign) {
				for (int i = 1; i < trimmedStr.length(); i++) {
					if (trimmedStr.charAt(i) < 48 || trimmedStr.charAt(i) > 57) {
						break;
					} else {
						charArray.add(trimmedStr.charAt(i));
					}
				}
			} else {
				for (int i = 0; i < trimmedStr.length(); i++) {
					if (trimmedStr.charAt(i) < 48 || trimmedStr.charAt(i) > 57) {
						break;
					} else {
						charArray.add(trimmedStr.charAt(i));
					}
				}
			}
			for (int i = charArray.size() - 1; i > -1; i--) {
				try {
					previousSum = Math.addExact(previousSum, Math.multiplyExact(charArray.get(i) - 48, (int)Math.pow(10, charArray.size() - 1 - i)));
				} catch (ArithmeticException e) {
					previousSum = isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
					break;
				}
			}
		}
		return isPositive ? previousSum : -1 * previousSum;
	}

	public static void main(String[] args) {
		System.out.println(new StringToInteger().myAtoi(""));
	}

}
