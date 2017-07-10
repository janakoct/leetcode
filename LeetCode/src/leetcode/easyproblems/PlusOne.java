package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/plus-one/#/description
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i > -1; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] newArray = new int[digits.length + 1];
		newArray[0] = 1;
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
