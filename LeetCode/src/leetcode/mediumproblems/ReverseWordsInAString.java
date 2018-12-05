package leetcode.mediumproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInAString {

	public String reverseWords(String s) {
		String[] individualWords = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = individualWords.length - 1; i >=0; i--) {
			if (!individualWords[i].equals(" ") && !individualWords[i].equals("")) {
				sb.append(individualWords[i] + " ");
			}
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		ReverseWordsInAString r = new ReverseWordsInAString();
		String reversed = r.reverseWords("   a   b ");
		System.out.println(reversed);
	}

}
