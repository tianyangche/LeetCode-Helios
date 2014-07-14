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
        ListNode result = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            }else{
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            result.next = l1;
        }
        if(l2 != null){
            result.next = l2;
        }
        return dummy.next;
        
    }
}