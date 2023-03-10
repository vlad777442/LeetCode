package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 35,
        name = "Search Insert Position",
        url = "https://leetcode.com/problems/search-insert-position/",
        difficulty = Difficulty.EASY
)
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
    public static int searchInsert(int[] nums, int target) {
        int middle = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] < target)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return left;
    }
}
