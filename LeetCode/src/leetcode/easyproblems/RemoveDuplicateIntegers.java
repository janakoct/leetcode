package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/
 *        description
 */
public class RemoveDuplicateIntegers {

	public int removeDuplicates(int[] nums) {
		int j = 1;
		if (nums.length == 0) {
			return 0;
		} else {
			for (int i = 1; i < nums.length; ++i) {
				if (nums[i] != nums[i - 1]) {
					nums[j++] = nums[i];
				}
			}
		}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveDuplicateIntegers().removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3, 4, 5 }));
	}

}
