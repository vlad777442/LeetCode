package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

@LeetCode(
        id = 733,
        name = "Flood Fill",
        url = "https://leetcode.com/problems/flood-fill/",
        difficulty = Difficulty.EASY
)
public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                        {1,1,0},
                        {1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] res = floodFill(image, sr, sc, color);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;

//        return breadthFirstSearch(image, sr, sc, color);
        depthFirstSearch(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int[][] breadthFirstSearch(int[][] image, int sr, int sc, int color) {
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        int rows = image.length;
        int cols = image[0].length;
        boolean[][] visited = new boolean[rows][cols];

        Queue<Pair> pairs = new LinkedList<>();

        pairs.add(new Pair(sr, sc));
        visited[sr][sc] = true;
        int initColor = image[sr][sc];
        image[sr][sc] = color;

        while (!pairs.isEmpty()) {
            Pair cell = pairs.peek();
            int x = cell.first;
            int y = cell.second;

            pairs.remove();

            for (int i = 0; i < dRow.length; i++) {
                int adjx = x + dRow[i];
                int adjy = y + dCol[i];

                if (isVisited(visited, adjx, adjy) && image[adjx][adjy] == initColor) {
                    pairs.add(new Pair(adjx, adjy));
                    image[adjx][adjy] = color;
                    visited[adjx][adjy] = true;
                }
            }
        }
        return image;
    }

    public static boolean isVisited(boolean[][] visited, int row, int col) {
        if (row < 0 || col < 0 ||
                row >= visited.length || col >= visited[0].length) {
            return false;
        }
        if (visited[row][col])
            return false;
        return true;
    }

    public static int[] directions = {0, 1, 0, -1, 0};
    public static void depthFirstSearch(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || c < 0 || r == image.length || c == image[0].length || image[r][c] != oldColor) return;
        image[r][c] = newColor;
        for (int i = 0; i < 4; i++) {
            depthFirstSearch(image, r + directions[i], c + directions[i + 1], oldColor, newColor);
        }
    }
}
