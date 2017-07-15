package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/single-number/#/description
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		int returnValue = 0;
		for (int i = 0; i < nums.length; i++) {
			returnValue ^= nums[i];
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		/*int[] nums = new int[10000];
		for (int i = 0; i < 10000; i++) {
			nums[i] = i;
		}
		System.out.println(new SingleNumber().singleNumber(nums));*/
	}
}
