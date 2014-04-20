/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int sum){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 10*sum + root.val;
        return dfs(root.left, 10*sum + root.val) + dfs(root.right, 10*sum + root.val);
    }

    
}