package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/reverse-string/#/description
 */
public class ReverseString {

	public String reverseString(String s) {
        int stringLength = s.length();
        char[] stringAsChar = s.toCharArray();
        for (int i = 0; i < stringLength/2; i++) {
            char temp = stringAsChar[i];
            stringAsChar[i] = stringAsChar[stringLength - 1 - i];
            stringAsChar[stringLength - 1 - i] = temp;
        }
        return new String(stringAsChar);
    }
}
