package leetcode.easyproblems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		
		//4ms Solution
		/*List<String> fizzBuzzList = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i > 2 && i % 3 == 0) {
				if (i % 5 == 0 ) {
					fizzBuzzList.add("FizzBuzz");
				} else {
					fizzBuzzList.add("Fizz");
				}
			} else if (i > 4 && i % 5 == 0) {
				fizzBuzzList.add("Buzz");
			} else {
				fizzBuzzList.add(String.valueOf(i));
			}
		}
        return fizzBuzzList;*/
		
		//this was a sample 3ms solution on LeetCode
		List<String> fizzBuzzList = new ArrayList<String>();
		int fizz = 1;
		int buzz = 1;
		for (int i = 1; i <= n; i++) {
			if (fizz == 3 && buzz == 5) {
				fizzBuzzList.add("FizzBuzz");
				fizz = 1;
				buzz = 1;
			} else if (fizz == 3) {
				fizzBuzzList.add("Fizz");
				fizz = 1;
				buzz++;
			} else if (buzz == 5) {
				fizzBuzzList.add("Buzz");
				fizz++;
				buzz = 1;
			} else {
				fizzBuzzList.add(String.valueOf(i));
				fizz++;
				buzz++;
			}
		}
		return fizzBuzzList;
    }
	public static void main(String[] args) {
		List<String> fizzBuzz = new ArrayList<String>();
		fizzBuzz = new FizzBuzz().fizzBuzz(15);
		for (String s : fizzBuzz) {
			System.out.println(s);
		}
	}

}
