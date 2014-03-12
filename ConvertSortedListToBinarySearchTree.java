/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public class Element{
        ListNode list;
        TreeNode tree;
        public Element(ListNode l, TreeNode t){
            list = l;
            tree = t;
        }
    }
    
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        // get the list's length
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length ++;
            temp = temp.next;
        }
        
        return helper(head, 0, length - 1).tree;
    }
    
    public Element helper(ListNode head, int start, int end){
        if(start > end)
            return new Element(head, null);
        int middle = (start + end) / 2;
        
        
        // List in element always points to the list corresponding to the current tree's parent
        Element left = helper(head, start, middle - 1);
        head = left.list;
        TreeNode root = new TreeNode(head.val);
        head = head.next;
        Element right = helper(head, middle + 1, end);
        root.left = left.tree;
        root.right = right.tree;
        return new Element(right.list, root );
        
    }
}