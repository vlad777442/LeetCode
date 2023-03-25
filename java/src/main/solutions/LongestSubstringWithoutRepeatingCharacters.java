package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import java.util.ArrayList;

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
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left;
        int right = 0;
        ArrayList<Character> characters = new ArrayList<>();

        while (right < s.length()) {
            if (!characters.contains(s.charAt(right))) {
                characters.add(s.charAt(right));
            }
            else {
                left = characters.indexOf(s.charAt(right));

                if (characters.size() > max) {
                    max = characters.size();
                }
                characters.add(s.charAt(right));

                for (int i = 0; i <= left; i++)
                    characters.remove(0);

            }
            right++;
        }
        if (characters.size() > max) {
            max = characters.size();
        }

        return max;
    }
}
