package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/palindrome-number/#/description
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		int reverse = 0;
		boolean isPalindrome = false;
		if (!(x < 0 || x % 10 == 0)) {
			while (x > reverse) {
				reverse = (reverse * 10) + (x % 10);
				x /= 10;
			}
		}
		if (x == reverse || (x == reverse/10)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
}
