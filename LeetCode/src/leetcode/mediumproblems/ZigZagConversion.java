package leetcode.mediumproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/zigzag-conversion/#/description
 */
public class ZigZagConversion {
	
	public String convert(String s, int numRows) {
		if (numRows == 1 || s.length() == 0) {
			return s;
		}
		StringBuilder[] sbArray = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			sbArray[i] = new StringBuilder();
		}		
		int i = 0;
		int rowIndex = 0;
		boolean isIncrement = true;
		while(i < s.length()) {
			if (isIncrement) {
				sbArray[rowIndex].append(s.charAt(i));
				if ((rowIndex + 1) == numRows) {
					isIncrement = false;
					rowIndex--;
				} else {
					rowIndex++;
				}
			} else {
				sbArray[rowIndex].append(s.charAt(i));
				if ((rowIndex - 1) == -1) {
					isIncrement = true;
					rowIndex++;
				} else {
					rowIndex--;
				}
			}
			i++;
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < numRows; j++) {
			sb.append(sbArray[j]);
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(new ZigZagConversion().convert("A", 2));
	}

}
