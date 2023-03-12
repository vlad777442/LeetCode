package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 167,
        name = "Two Sum II - Input Array Is Sorted",
        url = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/",
        difficulty = Difficulty.MEDIUM
)
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int[] res = twoSum(numbers, 9);
        for (int i: res)
            System.out.println(i);

//        numbers = new int[]{2,3,4};
//        res = twoSum(numbers, 6);
//        for (int i: res)
//            System.out.println(i);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length - 1;
        int sum;

        while (pointer1 < pointer2) {
            sum = numbers[pointer1] + numbers[pointer2];
            if (sum == target) {
                return new int[]{pointer1 + 1, pointer2 + 1};
            }
            else if (sum > target) {
                pointer2--;
            }
            else
                pointer1++;
        }
        return new int[2];
    }

}
