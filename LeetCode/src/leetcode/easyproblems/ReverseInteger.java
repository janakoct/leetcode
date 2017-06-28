package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/reverse-integer/#/description
 */
public class ReverseInteger {

	public int reverse(int x) {
        int returnValue = 0;
        int inputInt = x;
        while (inputInt != 0) {
            int lastDigit = inputInt % 10;
            try {
            	returnValue = Math.addExact(Math.multiplyExact(returnValue, 10), lastDigit);
            } catch (ArithmeticException e) {
            	returnValue = 0;
            	break;
            }
            inputInt /= 10;
        }
        if (returnValue > Integer.MAX_VALUE || returnValue < Integer.MIN_VALUE) {
            returnValue = 0;
        }
        if(inputInt < 0) {
            returnValue = -1 * returnValue;
        }
        System.out.println(returnValue);
        return returnValue;
    }
	
	public static void main(String[] args) {
		new ReverseInteger().reverse(152346);
	}

}
