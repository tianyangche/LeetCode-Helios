/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode first = head.next, second = head;
        while(first != null && first.next != null){
            first = first.next.next;
            second = second.next;
        }
        
        first = second;
        second = second.next;
        first.next = null;
        first = head;
        ListNode left = sortList(first);
        ListNode right = sortList(second);
        return mergeTwoLists(left, right);
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        if(l1 != null)
            curr.next = l1;
        if(l2 != null)
            curr.next = l2;
        return dummy.next;
    }

}