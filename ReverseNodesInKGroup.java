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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2)
            return head;
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length ++;
            temp = temp.next;
        }
        if(length < k)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy, curr = prev.next, next = curr.next;
        
        while(length >= k){
            curr = prev.next;
            next = curr.next;
            for(int i = 1; i <= k -1; i ++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            length -= k;
        }
        return dummy.next;
        
        
    }
}