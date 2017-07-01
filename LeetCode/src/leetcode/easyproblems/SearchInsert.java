package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/search-insert-position/#/description
 */
public class SearchInsert {

	public int searchInsert(int[] nums, int target) {
		if (target <= nums[0]) {
			return 0;
		} else if (target  == nums[nums.length - 1]) {
			return (nums.length - 1);
		} else if (target > nums[nums.length - 1]) {
			return nums.length;
		} else {
			return searchInsertUtil(nums, target, 0, nums.length - 1);
		}
    }
	
	private int searchInsertUtil(int[] nums, int target, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return (nums[startIndex] == target) ? startIndex : (nums[startIndex] > target) ? (startIndex) : (startIndex + 1);
		}
		int middleIndex = (startIndex + endIndex)/2;
		if (nums[middleIndex] == target) {
			return middleIndex;
		} else if (nums[middleIndex] < target) {
			if ((endIndex - startIndex) == 1 && target < nums[middleIndex + 1]) {
				return middleIndex + 1;
			} else {
				return searchInsertUtil(nums, target, middleIndex + 1, endIndex);
			}
		} else {
			if ((endIndex - startIndex) == 1 && target < nums[middleIndex + 1]) {
				return middleIndex;
			} else {
				return searchInsertUtil(nums, target, startIndex, middleIndex);
			}
		}
	}
	
	public static void main(String[] args) {
		/*int[] a = {-4, 0, 1, 2, 3, 4, 5, 60};*/
		int[] a = {3,5,7,9,10};
		long startTime = System.currentTimeMillis();
		System.out.println(new SearchInsert().searchInsert(a, 8));
		System.out.println("Run Time :: " + (System.currentTimeMillis() - startTime));
	}
}
