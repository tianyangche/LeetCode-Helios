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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, 0, n -1, postorder, 0, n -1 );
    }
    
    public TreeNode helper(int[] inorder, int a, int b, int [] postorder, int c, int d){
        if( a > b || c > d)
            return null;
        TreeNode root = new TreeNode(postorder[d]);
        int index = -1;
        for(int i = a; i <= b; i ++){
            if(inorder[i] == postorder[d]){
                index = i;
                break;
            }
        }
        int length = index - a;
        root.left = helper(inorder, a, index - 1, postorder, c, c + length - 1);
        root.right = helper(inorder, index + 1, b, postorder, c + length, d - 1);
        return root;
        
        
        
    }
}