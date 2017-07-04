package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/count-and-say/#/description
 */
public class CountAndSay {

	public String countAndSay(int n) {
		String result = "1";
		int i = 1;
		if (n <= 0) {
			return null;
		}else if (n == 1) {
			return "1";
		} else {
			while (i < n) {
				StringBuilder sb = new StringBuilder();
				int count = 1;
				for (int j = 1; j < result.length(); j++) {
					if (result.charAt(j) == result.charAt(j - 1)) {
						count++;
					} else {
						sb.append(count);
						sb.append(result.charAt(j - 1));
						count = 1;
					}
				}
				sb.append(count);
				sb.append(result.charAt(result.length() - 1));
				result = sb.toString();
				i++;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(4));
	}

}
