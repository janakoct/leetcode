package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/reshape-the-matrix/#/description
 */
public class ReshapeMatrix {


	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int numberOfRowsInOriginalMatrix = nums.length;
		int numberOfColumnsInOriginalMatrix = nums[0].length;
		int dimensionOfNewMatrix = r * c;
		int[][] returnMatrix = new int[r][c];
		if ((numberOfRowsInOriginalMatrix * numberOfColumnsInOriginalMatrix) != dimensionOfNewMatrix) {
			return nums;
		} else {
			for (int i = 0; i < dimensionOfNewMatrix; i++) {
				returnMatrix[i/c][i%c] = nums[i/numberOfColumnsInOriginalMatrix][i%numberOfColumnsInOriginalMatrix];
			}
		}
		return returnMatrix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2,3,4},
		{1,2,3,4}};
		System.out.println(nums.length);
	}

}
