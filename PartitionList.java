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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode smallerHead = null, smallerTail = null;
        ListNode largerHead = null, largerTail = null;
        while(head != null){
            if(head.val < x){
                if(smallerHead == null){
                    smallerHead = smallerTail = head;
                }else{
                    smallerTail.next = head;
                    smallerTail = smallerTail.next;                    
                }
            }else{
                if(largerHead == null){
                    largerHead = largerTail = head;
                }else{
                    largerTail.next = head;
                    largerTail = largerTail.next;
                }
            }
            head = head.next;
        }
        if(smallerTail == null)
            return largerHead;
        if(smallerTail != null)
            smallerTail.next = largerHead;
        if(largerTail != null)
            largerTail.next = null;
        return smallerHead;
    }
}