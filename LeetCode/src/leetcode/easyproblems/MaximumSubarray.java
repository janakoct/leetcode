package leetcode.easyproblems;

public class MaximumSubarray {

	public static void main(String[] args) {
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {5, 4, -1, 7, 8};
		int maxSum = maximumSubarray(nums);
		System.out.println("Max Sum of Subarray is :: " + maxSum);
	}
	
	private static int maximumSubarray (int[] nums) {
		int largestSum = nums[0];
		int localLargestSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			localLargestSum = Math.max(nums[i], localLargestSum + nums[i]);
			if (localLargestSum > largestSum) {
				largestSum = localLargestSum;
			}
		}
		return largestSum;
	}

}
