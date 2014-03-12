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
    public TreeNode helper(int[] num, int start, int end){
        if(start > end)
            return null;
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(num[middle] );
        root.left = helper(num, start, middle - 1);
        root.right = helper(num, middle + 1, end);
        return root;
    }
    
    
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
            return null;
        return helper(num, 0, num.length - 1);
        
    }
}