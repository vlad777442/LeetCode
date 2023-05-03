package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 695,
        name = "Max Area of Island",
        url = "https://leetcode.com/problems/max-area-of-island/",
        difficulty = Difficulty.MEDIUM
)
public class MaxAreaOfIsland {
//    public static int[] dRow = {-1, 0, 1, 0};
//    public static int[] dCol = {0, 1, 0, -1};
    public static int max = 0;
    public static int count = 0;

    public static void main(String[] args) {
        int[][] arr = {
                        {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maxAreaOfIsland(arr));

        int[][] arr2 = {{0,0,0,0,0,0,0,0}};
        System.out.println(maxAreaOfIsland(arr2));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid.length < 1) return 0;
        count = 0;
        max = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    depthFirstSearch(grid, i, j, visited);
                    if (count > max) max = count;
                    count = 0;
                }
            }
        }
        return max;
    }

//    public int breadthFirstSearch(int[][] grid) {
//        int[] dRow = {1, 0, -1, 0};
//        int[] dCol = {0, -1, 0, 1};
//
//        int max = 0;
//        int rows = grid.length;
//        int cols = grid[0].length;
//
//        Queue
//    }

    public static int[] directions =  {0, 1, 0, -1, 0};
    public static void depthFirstSearch(int[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || visited[r][c] == true) return;
        count++;
        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            depthFirstSearch(grid, r + directions[i], c + directions[i + 1], visited);
        }

    }
}
