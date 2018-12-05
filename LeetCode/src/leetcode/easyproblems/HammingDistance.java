package leetcode.easyproblems;

/**
 * @author Janak Mehta
 * @link : https://leetcode.com/submissions/detail/109018829/
 */
public class HammingDistance {

	public int hammingDistance(int x, int y) {
		int exor = x ^ y;
		int oneCount = Integer.bitCount(exor);
        return oneCount;
    }
	
	//this is an alternative solution where we use ANDing continuously till
	//a zero is encountered and count the number of times we can do ANDing
	//before facing a zero answer. The count is the number of 1s
	public int hammingDistanceWithAnd(int x, int y) {
		int exor = x ^ y;
		int oneCount = 0;
		for (; exor > 0; oneCount++) {
			exor &= exor - 1;
		}
        return oneCount;
    }
	
	public static void main(String[] args) {

	}

}
