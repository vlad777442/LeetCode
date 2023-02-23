package main.solutions;

@LeetCode(
        id = 643,
        name = "Maximum Average Subarray I",
        url = "https://leetcode.com/problems/maximum-average-subarray-i/description/",
        difficulty = Difficulty.EASY
)
public class MaximumAverageSubarray1 {
    public static double findMaxAverage(int[] nums, int k) {

        double maxAvg = 0;
        for (int i = 0; i < k; i++)
            maxAvg += nums[i];

        double windowSum = maxAvg;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxAvg =  Math.max(maxAvg, windowSum);
        }
        return maxAvg / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
