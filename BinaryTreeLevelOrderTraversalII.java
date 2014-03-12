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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        helper(root, 0, result);
        Collections.reverse(result);
        return result;
    }
    
    public void helper(TreeNode root, int level, ArrayList<ArrayList<Integer>> result){
        if(root == null)
            return;
        ArrayList<Integer> curr = new ArrayList<Integer>();
        if(level == result.size() ){
            result.add(curr);
        } else{
            curr = result.get(level);
        }
        curr.add(root.val);
        helper(root.left, level + 1, result);
        helper(root.right, level + 1, result);
    }
    
}