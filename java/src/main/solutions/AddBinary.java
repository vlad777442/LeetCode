package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;

@LeetCode(
        id = 67,
        name = "Add Binary",
        url = "https://leetcode.com/problems/add-binary/",
        difficulty = Difficulty.EASY
)
public class AddBinary {
    public static String addBinary(String a, String b) {
        int lena = a.length() - 1;
        int lenb = b.length() - 1;
        int sum, carry = 0;
        StringBuilder res = new StringBuilder();
        while (lena >= 0 || lenb >= 0) {
            sum = carry;
            if (lena >= 0) {
                if (a.charAt(lena) == '1')
                    sum += 1;
                lena--;
            }
            if (lenb >= 0) {
                if (b.charAt(lenb) == '1')
                    sum += 1;
                lenb--;
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);

        }
        if (carry == 1) {
            res.append(carry);
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        addBinary("11", "1");
    }

}
