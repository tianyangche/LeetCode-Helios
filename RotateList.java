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
<<<<<<< HEAD
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
=======
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
        
>>>>>>> ef048f36b791b6ac16f3f5ba423d60dbb51b041f
        
    }
}