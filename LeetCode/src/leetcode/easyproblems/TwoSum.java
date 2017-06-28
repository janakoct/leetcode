package leetcode.easyproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/two-sum/#/description
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] returnArray = {-1, -1};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) == null) {
				map.put(nums[i], i);
			} else {
				returnArray[0] = map.get(target - nums[i]);
				returnArray[1] = i;
			}
		}
		System.out.print(returnArray[0]);
		System.out.println(" " + returnArray[1]);
		return returnArray;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 8, 9, 11, 43, 89, 46};
		new TwoSum().twoSum(array, 89);
	}

}
