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
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        
        int carry = 0;

        while(l1 != null || l2 != null){
            int curr_l1 = l1 == null ? 0 : l1.val;
            int curr_l2 = l2 == null ? 0 : l2.val;
            curr.next = new ListNode( (curr_l1 + curr_l2 + carry)%10 );
            curr = curr.next;
            carry = (curr_l1+curr_l2 + carry)/10;
            l1 = l1 == null ? null: l1.next;
            l2 = l2 == null ? null: l2.next;
        }
        
        
        if(carry == 1)
            curr.next = new ListNode(1);
        return dummy.next;
        
        
        
    }
}