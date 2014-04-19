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
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        if(root == null)
            return ;
        dfs(root);
        if(first != null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }
    
    public void dfs(TreeNode curr){
        if(curr.left != null)
            dfs(curr.left);
        if(prev != null && prev.val > curr.val){
            if(first == null)
                first = prev;
            second = curr;
        }
        prev = curr;
        if(curr.right != null)
            dfs(curr.right);
    }
    
}