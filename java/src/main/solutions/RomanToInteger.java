package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import java.util.HashMap;
import java.util.Map;

@LeetCode(
        id = 13,
        name = "Roman to Integer",
        url = "https://leetcode.com/problems/roman-to-integer/",
        difficulty = Difficulty.EASY
)
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (numbers.get(s.charAt(i)) >= numbers.get(s.charAt(i + 1)))
                sum += numbers.get(s.charAt(i));
            else
                sum -= numbers.get(s.charAt(i));
        }
        sum += numbers.get(s.charAt(s.length() - 1));

        return sum;
    }
}
