package leetcode.easyproblems;

/**
 * 
 * @author Janak Mehta
 * @link : https://leetcode.com/problems/island-perimeter/#/description
 */
public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {
		int islandCount = 0;
		int neighborCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islandCount++;
					//check if this island has a right neighbor
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
						neighborCount++;
					}
					
					//check is this island has a neighbor below it
					if (i < grid.length - 1 && grid[i + 1][j] == 1) {
						neighborCount++;
					}
				}
			}
		}
		return (islandCount * 4) - (neighborCount * 2);
	}
}
