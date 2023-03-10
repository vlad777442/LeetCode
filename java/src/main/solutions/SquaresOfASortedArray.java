package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 977,
        name = "Squares of a Sorted Array",
        url = "https://leetcode.com/problems/squares-of-a-sorted-array/",
        difficulty = Difficulty.EASY
)
public class SquaresOfASortedArray {
    public static void main(String[] args) {
//        System.out.println(sortedSquares(new int[]{-4,-1,0,3,10}).toString());
        int[] res = sortedSquares(new int[]{-7,-3,2,3,11});
        for (int i:res) System.out.println(i);
    }
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int temp1 = 0;
        int temp2 = 0;
        int i = nums.length - 1;

//        while (start <= end) {
//            temp1 = (int) Math.pow(nums[start], 2);
//            temp2 = (int) Math.pow(nums[end], 2);
//
//            if (temp2 > temp1) {
//                res[i] = temp2;
//                end--;
//                i--;
//            }
//            else if (temp2 < temp1) {
//                res[i] = temp1;
//                start++;
//                i--;
//            }
//            else if (start != end) {
//                res[i] = temp1;
//                res[i - 1] = temp1;
//                start++;
//                end--;
//                i -= 2;
//            }
//            else {
//                res[i] = temp1;
//                start++;
//                end--;
//            }
//        }
        while (start <= end) {
            temp1 = (int) Math.pow(nums[start], 2);
            temp2 = (int) Math.pow(nums[end], 2);
            if (temp1 > temp2) {
                res[i] = temp1;
                start++;
            }
            else {
                res[i] = temp2;
                end--;
            }
            i--;
        }
        return res;
    }
}
