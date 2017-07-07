package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/length-of-last-word/#/description
 */
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int length = 0;
        if(s.length() == 0) {
            return length;
        } else if ((s.lastIndexOf(' ') == -1) && s.length() != 0) {
            length = s.length();
        } else {
            s = s.trim();
            //String lastWord = s.substring(s.lastIndexOf(' ') + 1, s.length());
            //System.out.println(lastWord);
            length = s.length() - s.lastIndexOf(' ') - 1;
        }
        return length;
    }
}
