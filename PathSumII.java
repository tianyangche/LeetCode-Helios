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
    }
}