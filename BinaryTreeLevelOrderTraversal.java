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
    // iterative method
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return result;
        Queue<TreeNode> curr = new LinkedList<TreeNode>();
        ArrayList<Integer> valArray = new ArrayList<Integer>();
        curr.add(root);
        while(!curr.isEmpty() ){
            Queue<TreeNode> parent = curr;
            curr = new LinkedList<TreeNode>();
            valArray = new ArrayList<Integer>();
            for( TreeNode node : parent ){
                valArray.add(node.val);
                if(node.left != null)
                    curr.add(node.left);
                if(node.right != null)
                    curr.add(node.right);
            }
            result.add(valArray);
        }
        
        return result;
    }  
  
  
  
    // recursive method
    public void helper(TreeNode root, int level, ArrayList<ArrayList<Integer>> lists){
        if(root == null)
            return;
        ArrayList<Integer> curr;
        if(level == lists.size() ){
            curr = new ArrayList<Integer>();
            lists.add(curr);
        } else{
            curr = lists.get(level);
        }
        curr.add(root.val);
        helper(root.left, level + 1, lists);
        helper(root.right, level + 1, lists);
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return result;
        
        helper(root, 0, result);
        return result;
        
    }
}