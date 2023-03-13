package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 344,
        name = "Reverse String",
        url = "https://leetcode.com/problems/reverse-string/",
        difficulty = Difficulty.EASY
)
public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] c= s.toCharArray();
        reverseString(c);
        for (char k: c)
            System.out.println(k);
    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;

        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
