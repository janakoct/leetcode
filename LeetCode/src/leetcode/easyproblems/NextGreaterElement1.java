package leetcode.easyproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/next-greater-element-i/#/description
 */
public class NextGreaterElement1 {

	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}
		
		for (int i = 0; i < findNums.length; i++) {
			findNums[i] = map.getOrDefault(findNums[i], -1);
		}
		return findNums;
    }
}
