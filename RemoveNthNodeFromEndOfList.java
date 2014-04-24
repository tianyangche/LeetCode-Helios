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
<<<<<<< HEAD
 
// don't forget when n == length. Use a dummy head node.
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        ListNode fast = head;
        for(int i = 1; i < n; i ++)
            fast = fast.next;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        while(fast.next != null){
=======
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        for(int i = 1; i <= n; i ++)
            fast = fast.next;
        ListNode slow = dummy;
        while(fast != null){
>>>>>>> ef048f36b791b6ac16f3f5ba423d60dbb51b041f
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}