/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return head;
        RandomListNode temp = head;
        while(temp != null){
            RandomListNode curr = new RandomListNode(temp.label);
            curr.next = temp.next;
            temp.next = curr;
            temp = temp.next.next;
        }
        
        temp = head;
        while(temp != null){
            if(temp.random != null)
            temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        
        RandomListNode dummy = new RandomListNode(-1);
        dummy.next = head.next;
        RandomListNode result = dummy;
        temp = head;
        while(temp != null){
            result.next = temp.next;
            temp.next = result.next.next;
            result = result.next;
            temp = temp.next;
        }
        return dummy.next;
        
    }
}