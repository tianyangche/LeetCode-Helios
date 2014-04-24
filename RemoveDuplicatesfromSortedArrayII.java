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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(head.val - 1);
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        boolean flag = false;
        while(curr != null && curr.next != null){
            while(curr.next != null && prev.next.val == curr.next.val ){
                flag = true;
                curr = curr.next;
            }
            if(flag){
                prev.next = curr.next;
                flag = false;
                if(curr.next == null)
                    return dummy.next;
                curr = curr.next;
            }else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}