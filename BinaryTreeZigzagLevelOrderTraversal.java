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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> currLevel = new LinkedList<TreeNode>();
        LinkedList<TreeNode> parentLevel = new LinkedList<TreeNode>();
        int order = 1;
        if(root != null)
            currLevel.add(root);
        while( !currLevel.isEmpty() ){
            parentLevel = currLevel;
            currLevel = new LinkedList<TreeNode>();

            ArrayList<Integer> valArray = new ArrayList<Integer>();
            for(TreeNode node : parentLevel){
                valArray.add(node.val);
                if(node.left != null)
                    currLevel.add(node.left);
                if(node.right != null)
                    currLevel.add(node.right);
            }
            if(order == -1){
                Collections.reverse(valArray);
            }
            order *= -1;
            result.add(valArray);
        }
        return result;
    }
    
    
}