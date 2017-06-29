package leetcode.easyproblems;

/**
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/remove-element/#/description
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int j = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
					nums[j] = nums[i];
					j++;
				}
			}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveElement().removeElement(new int[] {3,2,3,2,3}, 3));
	}

}
