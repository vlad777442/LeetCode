package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 189,
        name = "Rotate Array",
        url = "https://leetcode.com/problems/rotate-array/",
        difficulty = Difficulty.MEDIUM
)
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);

        for (int i: nums)
            System.out.println(i);

    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = nums.clone();
        int j = len - (k % len);

        for (int i = 0; i < len; i++) {
            nums[i] = res[j % len];
            j++;
        }
    }
}
