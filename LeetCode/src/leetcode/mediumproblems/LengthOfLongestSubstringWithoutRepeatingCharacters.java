package leetcode.mediumproblems;

import java.util.HashMap;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
 */
public class LengthOfLongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int maxLength = 1;
		if (s.length() == 0) {
			maxLength = 0;
		} else if (s.length() == 1) {
			maxLength = 1;
		} else {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			int j = 0;
			for (int i = 0; i < s.length(); i++) {
				if (map.containsKey(s.charAt(i))) {
					j = Math.max(j,map.get(s.charAt(i))+1);
				}
				map.put(s.charAt(i), i);
				maxLength = Math.max(maxLength, i - j + 1);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(
				new LengthOfLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcdabcdefgh"));

	}

}
