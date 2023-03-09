package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 278,
        name = "First Bad Version",
        url = "https://leetcode.com/problems/first-bad-version/",
        difficulty = Difficulty.EASY
)
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle;

        while (left <= right) {
            middle = left + (right - left) / 2;

            if (isBadVersion(middle) == false)
                left = middle + 1;
            else right = middle - 1;
        }
        return left;
    }
    public static boolean isBadVersion(int n) {
        if (n == 4 || n == 1) return true;
        return false;
    }
}
