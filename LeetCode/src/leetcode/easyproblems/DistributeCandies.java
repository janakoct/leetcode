package leetcode.easyproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/distribute-candies/#/description
 */
public class DistributeCandies {

	public int distributeCandies (int[] candies) {
		Set<Integer> kinds = new HashSet<Integer>();
		for (int i = 0; i < candies.length; i++) {
			kinds.add(candies[i]);
		}
		return kinds.size() >= candies.length/2 ? candies.length/2 : kinds.size();
	}
	public static void main(String[] args) {

	}

}
