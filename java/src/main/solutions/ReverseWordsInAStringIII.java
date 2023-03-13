package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 557,
        name = "Reverse Words in a String III",
        url = "https://leetcode.com/problems/reverse-words-in-a-string-iii/",
        difficulty = Difficulty.EASY
)
public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
    public static String reverseWords(String s) {
        String res = "";
        String[] words = s.split(" ");
        int left = 0;
        int right;
        char temp;
        StringBuilder stringBuilder = new StringBuilder("");
        String space = " ";

        for (int i = 0; i < words.length; i++) {
            left = 0;
            right = words[i].length() - 1;
            char[] array = words[i].toCharArray();
            while (left < right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            if (i == words.length - 1) space = "";
            stringBuilder.append(String.valueOf(array) + space);
        }

//        second solution O(n)
//        char[] chars = s.toCharArray();
//        for (right = 0; right <= s.length(); right++) {
//            if (right == s.length() || chars[right] == ' ') {
//                System.out.println();
//                reverseString(chars, left, right - 1);
//                left = right + 1;
//            }
//
//        }
//        return String.valueOf(chars);
        return String.valueOf(stringBuilder);
    }
    public static void reverseString(char[] array, int start, int end) {
        int left = start;
        int right = end;
        char temp;

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
