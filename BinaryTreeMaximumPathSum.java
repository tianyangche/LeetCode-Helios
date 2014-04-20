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
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        dfs(root);
        return max;
    }
    
    public int dfs(TreeNode root){
        if(root == null)
            return 0;
        int tempSum = root.val;
        int left = dfs(root.left);
        if(left > 0)
            tempSum += left;
        int right = dfs(root.right);
        if(right > 0)
            tempSum += right;
        max = Math.max(max, tempSum);
        return Math.max(left,right) >0? root.val + Math.max(left,right):root.val;
        
    }
    

}