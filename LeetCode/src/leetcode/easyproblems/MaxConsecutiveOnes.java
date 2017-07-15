package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/max-consecutive-ones/#/description
 */
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				if (count > maxOnes) {
					maxOnes = count;
				}
				count = 0;
			}
		}
		if (count > maxOnes) {
			maxOnes = count;
		}
        return maxOnes;
    }
	public static void main(String[] args) {
		int[] nums = {1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1};
		System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
	}

}
