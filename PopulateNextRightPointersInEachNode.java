/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return ;
        Queue<TreeLinkNode> currLevel = new LinkedList<TreeLinkNode>();
        Queue<TreeLinkNode> nextLevel = new LinkedList<TreeLinkNode>();
        currLevel.add(root);
        while( !currLevel.isEmpty() ){
            TreeLinkNode currNode = currLevel.poll();
            if(!currLevel.isEmpty() )
                currNode.next = currLevel.peek();
            else
                currNode.next = null;
            if(currNode.left != null)
                nextLevel.add(currNode.left);
            if(currNode.right != null)
                nextLevel.add(currNode.right);
            if(currLevel.isEmpty() ){
                currLevel = nextLevel;
                nextLevel = new LinkedList<TreeLinkNode>();
            }
        }
        
    }
}


// recursive way.
public class Solution {
    public void connect(TreeLinkNode root) {
        connect(root, null);
    }
    public void connect(TreeLinkNode root, TreeLinkNode next){
        if(root == null)
            return ;
        root.next = next;
        connect(root.left, root.right);
        if(next != null)
            connect(root.right, next.left);
        else
            connect(root.right, null);
    }
}