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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length , inorder, 0, inorder.length  );
    }
    public TreeNode helper(int[] preorder, int pre_begin, int pre_length, int [] inorder, int in_begin, int in_length){
        if(pre_length == 0)
            return null;
        if(in_length == 0 )
            return null;
        TreeNode root = new TreeNode(preorder[pre_begin]);
        int pos = 0;
        for(int i= in_begin; i <  in_begin + in_length; i ++){
            if(inorder[i] == root.val){
                pos = i;
                break;
            }
        }
        int len = pos - in_begin ;
        
        root.left =  helper(preorder, pre_begin+1, len, inorder, in_begin, len );
        root.right = helper(preorder, pre_begin + len +1, pre_length - len -1 , inorder, in_begin + 1 + len, in_length - len - 1);
        return root;
    }
}