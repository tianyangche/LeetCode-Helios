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
    public int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        if(root == null)
            return 0;
        int currSum = root.val;
        int left = helper(root.left);
        if(left > 0)
            currSum += left;
        int right = helper(root.right);
        if(right > 0)
            currSum += right;
        max = Math.max(max, currSum);
        return Math.max(left,right) > 0 ? Math.max(left,right) + root.val : root.val;        
    }
    

}