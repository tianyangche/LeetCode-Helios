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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = new ListNode(0);

        ListNode curr = head;
        prev.next = curr;     
        
        ListNode result = prev;
        ListNode temp = head;
        int count = 1;
        
        while(count != n){
            //curr = prev.next;
            //count ++;
            if(count >= m){
                temp = curr.next;
                curr.next = curr.next.next;
                temp.next = prev.next;
                prev.next = temp;
                count ++;
            }
            else{
                prev = curr;
                curr = curr.next;
                count ++;
            }
        }
    
        return result.next;        
        
        
        
    
    }
}