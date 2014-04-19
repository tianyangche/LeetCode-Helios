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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> first = new Stack<TreeNode>();
        Stack<TreeNode> second = new Stack<TreeNode>();
        first.add(p);
        second.add(q);
        while(!first.isEmpty()&&!second.isEmpty()){
            TreeNode a = first.pop();
            TreeNode b = second.pop();
            if(a == null && b == null)
                continue;
            if(a == null || b == null)
                return false;
            if(a.val != b.val)
                return false;
            first.push(a.right);
            first.push(a.left);
            second.push(b.right);
            second.push(b.left);
        }
        return true;
    }
}