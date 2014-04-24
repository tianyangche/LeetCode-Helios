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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), temp = dummy;
        int carry = 0;
        if(l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
        while(l1 != null || l2 != null){
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            temp.next  = new ListNode((a + b + carry) %10);
            temp = temp.next;
            carry = (a + b + carry) / 10; 
        }
        if(carry == 1)
            temp.next = new ListNode(carry);
        return dummy.next;
        
        
    }
}