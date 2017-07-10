package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/number-complement/#/description
 */
public class NumberComplement {
	
	public int findComplement(int num) {
		int returnValue = 0;
		int mask = Integer.highestOneBit(num) << 1;
		int invert = ~num;
		returnValue = invert & (mask - 1);
        return returnValue;
    }
	
	public static void main(String[] args) {
		System.out.println(new NumberComplement().findComplement(5));
	}
}
