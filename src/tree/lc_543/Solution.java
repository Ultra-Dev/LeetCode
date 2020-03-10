package tree.lc_543;

import tree.TreeNode;

/**
 * 543. 二叉树的直径
 * @author xiangliang
 * @time 2020/3/10 19:27
 */
public class Solution {

    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = this.dfs(root.getLeft());
        int rightDepth = this.dfs(root.getRight());
        result = Math.max(result, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {

    }


}
