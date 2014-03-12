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
    public int checkHeight(TreeNode node){
        if(node == null)
            return 0;
        int h1 = checkHeight(node.left);
        if(h1 == -1)
            return -1;
        int h2 = checkHeight(node.right);
        if(h2 == -1)
            return -1;
        if( Math.abs(h1-h2) >1 )
            return -1;
        return Math.max(h1, h2) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(checkHeight(root) == -1 )
            return false;
        return true;
    }
}