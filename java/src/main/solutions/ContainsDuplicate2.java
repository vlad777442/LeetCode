package main.solutions;

//@LeetCode(
//        id = 219,
//        name = "Contains Duplicate II",
//        url = "https://leetcode.com/problems/contains-duplicate-ii/",
//        difficulty = Difficulty.EASY
//)
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                    return true;
//                    count++;
            }
        }
        return false;
    }
}
