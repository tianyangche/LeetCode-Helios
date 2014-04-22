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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m >= n || head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode prev = dummy;
        for(int i = 1; i < m; i ++)
            prev = prev.next;
        ListNode curr = prev.next, next = curr.next;
        for(int i = m; i < n && curr != null; i ++){
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = curr.next;
        }
        return dummy.next;
    }
}