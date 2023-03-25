package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@LeetCode(
        id = 3,
        name = "Longest Substring Without Repeating Characters",
        url = "https://leetcode.com/problems/longest-substring-without-repeating-characters/",
        difficulty = Difficulty.MEDIUM
)
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("ohomm"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
//        ArrayList<Character> characters = new ArrayList<>();
        Map<Character, Integer> characters = new HashMap<>();

        while (right < s.length()) {
            if (characters.containsKey(s.charAt(right))) {
                left = Math.max(left, characters.get(s.charAt(right)) + 1);
            }
            characters.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
//        if (diff > max) {
//            max = characters.size();
//        }

//        while (right < s.length()) {
//            if (!characters.contains(s.charAt(right))) {
//                characters.add(s.charAt(right));
//            }
//            else {
//                left = characters.indexOf(s.charAt(right));
//
//                if (characters.size() > max) {
//                    max = characters.size();
//                }
//                characters.add(s.charAt(right));
//
//                for (int i = 0; i <= left; i++)
//                    characters.remove(0);
//
//            }
//            right++;
//        }
//        if (characters.size() > max) {
//            max = characters.size();
//        }


    }
}
