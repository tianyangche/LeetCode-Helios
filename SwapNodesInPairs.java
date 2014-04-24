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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode next;
        
        while(curr.next!= null && curr.next.next != null){
            prev = curr;
            curr = curr.next;
            next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
        }
        return dummy.next;
    }
}