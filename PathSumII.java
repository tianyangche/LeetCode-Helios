<<<<<<< HEAD
public class Solution {
    
    public void pathSum(TreeNode root, int sum, ArrayList<ArrayList<Integer>> allPath, ArrayList<Integer> curPath)
    {
        if (root == null) return;
        if (sum == root.val && root.left == null && root.right == null){
            curPath.add(root.val);
            allPath.add(new ArrayList<Integer>(curPath));
            curPath.remove(curPath.size()-1);
            return;
        }
    
        curPath.add(root.val);
        pathSum(root.left, sum-root.val, allPath, curPath);
        pathSum(root.right, sum-root.val, allPath, curPath);
        curPath.remove(curPath.size()-1);

    }
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        pathSum(root, sum, res, cur);
        return res;
=======
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
>>>>>>> FETCH_HEAD
    }
}