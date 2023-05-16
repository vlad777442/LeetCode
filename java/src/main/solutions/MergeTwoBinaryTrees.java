package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import main.common.TreeNode;

@LeetCode(
        id = 617,
        name = "Merge Two Binary Trees",
        url = "https://leetcode.com/problems/merge-two-binary-trees/",
        difficulty = Difficulty.EASY
)
public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(5);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);

        TreeNode res = mergeTrees(root1, root2);
        System.out.println(res.val);
        System.out.println(res.right.val);

    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode res = new TreeNode(root1.val + root2.val);
        res.left = mergeTrees(root1.left, root2.left);
        res.right = mergeTrees(root1.right, root2.right);
        return res;
    }


}
