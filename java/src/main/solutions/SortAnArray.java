package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 912,
        name = "Sort an Array",
        url = "https://leetcode.com/problems/sort-an-array/",
        difficulty = Difficulty.MEDIUM
)
public class SortAnArray {
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pi = partition(nums, start, end);
            quickSort(nums, start, pi - 1);
            quickSort(nums, pi + 1, end);
        }
    }
    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int swaptemp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = swaptemp;
        return i + 1;

    }

    public static void main(String[] args) {
        int[] nums = {-1,2,-8,-10};
        System.out.println(sortArray(nums).toString());
        for (int i: nums)
            System.out.println(i);
    }
}
