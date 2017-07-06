package leetcode.mediumproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/container-with-most-water/#/description
 */
public class MaxArea {
	
	public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxMin = 0;
        int area = 0;
        int maxArea = 0;
        
        
        while(i < j){
            maxMin = Math.min(height[i],height[j]);
            area = maxMin*(j-i);
            if(area > maxArea){
                maxArea = area; 
                //System.out.print(String.valueOf(maxArea) + "\n");
            }
            while(height[i] <= maxMin && i < j){ i++; }
            while(height[j] <= maxMin && i < j){j--;}
        }
        return maxArea;
    }
	
	public static void main(String[] args) {
		int[] height = {2, 1};
		System.out.println(new MaxArea().maxArea(height));
	}
}
