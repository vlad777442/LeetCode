package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 567,
        name = "Permutation in String",
        url = "https://leetcode.com/problems/permutation-in-string/",
        difficulty = Difficulty.MEDIUM
)
public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
        System.out.println(checkInclusion("abc", "bbbca"));
        System.out.println(checkInclusion("adc", "dcda"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
        }
//        for (int i = 0; i < count.length; i++)
//            System.out.print(count[i] + " ");
//        System.out.println();
        for (int i = 0; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            if (i - len1 >= 0)
                count[s2.charAt(i - len1) - 'a']++;
//            for (int j = 0; j < count.length; j++)
//                System.out.print(count[j] + " ");
//            System.out.println();
            if (isAllZero(count))
                return true;
        }

        return false;
    }
    public static boolean isAllZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }

}
