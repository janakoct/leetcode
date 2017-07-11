package leetcode.easyproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/keyboard-row/#/description
 */
public class KeyboardRow {

	public String[] findWords(String[] words) {
		List<String> answer = new ArrayList<String>();
		Map <Integer, String> keyboardRows = new HashMap<Integer, String>();
		keyboardRows.put(1, "QWERTYUIOP");
		keyboardRows.put(2, "ASDFGHJKL");
		keyboardRows.put(3, "ZXCVBNM");
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toUpperCase();
			int rowOfTheFirstCharacter = 1;
			for (int j = 1; j < 4; j++) {
				String row = keyboardRows.get(j);
				if (row.contains(((Character)word.charAt(0)).toString())) {
					rowOfTheFirstCharacter = j;
					break;
				}
			}
			String rowToBeCompared = keyboardRows.get(rowOfTheFirstCharacter).toUpperCase();
			int count = 0;
			for (Character c : word.toCharArray()) {
				if (!rowToBeCompared.contains(c.toString())) {
					break;
				} else {
					count++;
					if (count == word.length()) {
						answer.add(words[i]);
					}
				}
			}
		}
		String[] returnArray = new String[answer.size()];
		answer.toArray(returnArray);
        return returnArray;
    }
	public static void main(String[] args) {
		String[] words = {"QWERTY", "HELLO", "alka"};
		String[] answer = new KeyboardRow().findWords(words);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
