package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
 */
public class ReverseWordsInAString3 {

	public String reverseWords(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {   // when i is a non-space
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; } // move j to the end of the word
                reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    private void reverse(char[] ca, int i, int j) {
        for (; i < j; i++, j--) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }
	public static void main(String[] args) {
		System.out.println(new ReverseWordsInAString3().reverseWords("Let's take leetcode test"));
	}

}
