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
        ListNode curr = head;
        while(curr.next != null){
            if(curr.val != curr.next.val){
                curr = curr.next;
            }else{
                curr.next = curr.next.next;
            }
        }
        return head;
        
    }
}