package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/implement-strstr/#/description
 */
public class ImplementStrStr {

	public int strStr(String haystack, String needle) {
		int needleLength = needle.length();
		int indexOfNeedle = 0;
		if(needle.length() > haystack.length()) {
			indexOfNeedle = -1;
		} else if (needleLength == haystack.length()) {
			indexOfNeedle = needle.equals(haystack) ? 0 : -1;
		} else {
			for (int i = 0; i < haystack.length(); i++) {
				if (haystack.substring(i).length() >= needleLength) {
					/*if (haystack.substring(i, i + needleLength).equals(needle)) {*/
					if(needle.equals(haystack.substring(i, i + needleLength))) {
						indexOfNeedle = i;
						break;
					} else {
						indexOfNeedle = -1;
					}
				} else {
					indexOfNeedle = -1;
				}
			}
		}
		return indexOfNeedle;
    }
	public static void main(String[] args) {
		System.out.println(new ImplementStrStr().strStr("mississippi", "a"));
	}

}
