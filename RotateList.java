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
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null || head.next == null || n == 0)
            return head;
        ListNode result = head;
        int length = 1;
        while(result.next != null){
            result = result.next;
            length ++;
        }
        result.next = head;
        ListNode curr = result.next;
        for(int i = 1; i <= length - n % length; i ++){
            result = result.next;
            curr = curr.next;
        }
        
        result.next =null;
        return curr;
        
    }
}