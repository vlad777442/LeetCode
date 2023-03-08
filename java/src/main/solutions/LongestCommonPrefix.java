package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

@LeetCode(
        id = 14,
        name = "Longest Common Prefix",
        url = "https://leetcode.com/problems/longest-common-prefix/",
        difficulty = Difficulty.EASY
)
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder stringBuilder = new StringBuilder("");
        int count = 0;
        boolean correct = true;

        for (int i = 0; i < strs[0].length(); i++) {
            count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    count++;
                }
                else {
                    correct = false;
                    break;
                }
            }
            if (count == strs.length - 1 && correct) {
                stringBuilder.append(strs[0].charAt(i));
            }
            else break;
        }
        return stringBuilder.toString();
    }
}
