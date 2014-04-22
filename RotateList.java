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
        ListNode second = head;
        int length = 0;
        while(second != null){
            second = second.next;
            length ++;
        }
        second = head;
        for(int i = 1; i <= n%length; i ++)
            second = second.next;
        ListNode first = head;
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = head;
        second = first.next;
        first.next = null;
        return second;
        
        
    }
}