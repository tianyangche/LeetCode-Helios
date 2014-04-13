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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        pathSum(result, root, sum, curr);
        return result;
    }
    public void pathSum(ArrayList<ArrayList<Integer>> result, TreeNode root, int sum, ArrayList<Integer> curr){
        if(root == null)
            return ;
        if(root.left == null && root.right == null){
            if( sum == root.val){
                curr.add(root.val);
                result.add(new ArrayList<Integer>(curr));
                curr.remove(curr.size() - 1);
            }
            return ;
        } 
        curr.add(root.val);
        pathSum(result, root.left, sum - root.val, curr );
        pathSum(result, root.right, sum - root.val, curr);
        curr.remove(curr.size()-1);
    }
}