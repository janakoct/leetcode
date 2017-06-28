package leetcode.easyproblems;

import java.util.Stack;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/valid-parentheses/#/description
 * The commented code is my first attempt at the solution. The uncommented code is a
 * more efficient solution
 */
public class ValidParantheses {

	public boolean isValid(String s) {
		/*Stack<Character> stackForIndividualCharacters = new Stack<Character>();
		if (s.length() == 1 || s.length() % 2 != 0) {
			return false;
		} else if (s.length() > 0 && (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				char currentCharacter = s.charAt(i);
				if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
					stackForIndividualCharacters.push(currentCharacter);
				} else {
					if (currentCharacter == ')' && stackForIndividualCharacters.peek() == '(') {
						stackForIndividualCharacters.pop();
					} else if (currentCharacter == ']' && stackForIndividualCharacters.peek() == '[') {
						stackForIndividualCharacters.pop();
					} else if (currentCharacter == '}' && stackForIndividualCharacters.peek() == '{') {
						stackForIndividualCharacters.pop();
					} else {
						return false;
					}
				}
			}
		}
		if (!stackForIndividualCharacters.isEmpty()) {
			return false;
		}
		return true;*/
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ValidParantheses vp = new ValidParantheses();
		System.out.println(vp.isValid("(){[[]](){"));
		System.out.println(vp.isValid(""));
	}

}
