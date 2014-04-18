/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.val > l2. val){
                curr.next = l2;
                l2 = l2.next;
            } else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        
        if( l1 != null)
            curr.next = l1;
        else
            curr.next = l2;
        return dummy.next;
        
    }
}