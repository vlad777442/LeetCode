package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 283,
        name = "Move Zeroes",
        url = "https://leetcode.com/problems/move-zeroes/",
        difficulty = Difficulty.EASY
)
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for (int i: nums)
            System.out.println(i);
    }
    public static void moveZeroes(int[] nums) {
//        int[] res = nums.clone();
//        int k = 0;
//        int count = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[k] = res[i];
//                k++;
//            }
//            else count++;
//        }
//        for (int i = 0; i < count; i++) {
//            nums[k] = 0;
//            k++;
//        }

        // using two pointers
        int slow = 0;
        int fast = 0;

        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0 && nums[slow] == 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
            if (nums[slow] != 0)
                slow++;
        }


    }
}
