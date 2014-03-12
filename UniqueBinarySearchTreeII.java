/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
        // if(n == 0) {
        //     ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        //     result.add(null);    
        //     return result;
        // }
        return helper(1, n);
    }
    
    public ArrayList<TreeNode> helper(int start, int end){
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        if(end < start){
            result.add(null);
            return result;
        }
        TreeNode root = null;
        for(int i = start; i <= end; i ++){

            ArrayList<TreeNode> leftList = helper(start, i -1 );
            ArrayList<TreeNode> rightList = helper(i + 1, end);
            for(int j = 0; j < leftList.size(); j ++ ){
                for(int k = 0; k < rightList.size(); k ++){
                    root = new TreeNode(i);
                    root.left = leftList.get(j);
                    root.right = rightList.get(k);
                    result.add(root);
                }
               
            }
        }
        return result;
    }
}