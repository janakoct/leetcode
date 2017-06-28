package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/roman-to-integer/#/description
 * Correctnes of Solutions can 
 * be checked here: http://www.rapidtables.com/math/symbols/roman_numerals.htm
 */
public class RomanNumerals {

	public int romanToInt(String s) {
		int answer = 0;
		if (s.indexOf("IV") > -1) {
			answer -= 2;
		}
		
		if (s.indexOf("IX") > -1) {
			answer -= 2;
		}
		
		if (s.indexOf("XL") > -1) {
			answer -= 20;
		}
		
		if (s.indexOf("XC") > -1) {
			answer -= 20;
		}
		
		if (s.indexOf("CD") > -1) {
			answer -= 200;
		}
		
		if (s.indexOf("CM") > -1) {
			answer -= 200;
		}
		
		char[] charactersInTheString = s.toCharArray();
		
		for(int i = 0; i < charactersInTheString.length; i++) {
			if (charactersInTheString[i] == 'I') {
				answer += 1;
			}
			if (charactersInTheString[i] == 'V') {
				answer += 5;
			}
			if (charactersInTheString[i] == 'X') {
				answer += 10;
			}
			if (charactersInTheString[i] == 'L') {
				answer += 50;
			}
			if (charactersInTheString[i] == 'C') {
				answer += 100;
			}
			if (charactersInTheString[i] == 'D') {
				answer += 500;
			}
			if (charactersInTheString[i] == 'M') {
				answer += 1000;
			}
		}		
		return answer;        
    }

	public static void main(String[] args) {

	}

}
