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
    public int total = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        helper(root, 0);
        return total;
    }
    
    public void helper(TreeNode root, int sum){
        if(root == null)
            return ;
        if(root.left == null && root.right == null)
            total += 10 * sum + root.val;
        helper(root.left, 10 * sum + root.val);
        helper(root.right, 10 * sum + root.val);
    }
    
}