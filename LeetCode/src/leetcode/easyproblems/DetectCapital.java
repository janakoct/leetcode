package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/detect-capital/#/description
 */
public class DetectCapital {

	public boolean detectCapitalUse(String word) {
		if (word.length() == 1) {
			return true;
		} else {
			if (word.equals(word.toUpperCase())) {
				return true;
			} else if (word.equals(word.toLowerCase())) {
				return true;
			} else if (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) && word.substring(1, word.length()).equals(word.substring(1, word.length()).toLowerCase())) {
				return true;
			} else {
				return false;
			}
		}
    }
	
	public static void main(String[] args) {
		System.out.println(new DetectCapital().detectCapitalUse("HellO"));
	}
}
