package main.solutions;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        id = 219,
        name = "Contains Duplicate II",
        url = "https://leetcode.com/problems/contains-duplicate-ii/",
        difficulty = Difficulty.EASY
)
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
////        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
//                    return true;
////                    count++;
//            }
//        }
//        return false;
        if (nums == null || nums.length== 0 || k == 0)
            return false;
        Map<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mymap.containsKey(nums[i])) {
                int prev = mymap.get(nums[i]);
                if (i - prev <= k)
                    return true;
            }
            mymap.put(nums[i], i);
        }
        return false;
    }
}
