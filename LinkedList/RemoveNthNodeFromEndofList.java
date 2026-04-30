package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;

        
        int size = 1;
        ListNode temp = head, prev = null, curr = head, next = curr.next;

        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        n = size - n + 1;

        if(n == 1){
            head = head.next;
            return head;
        }

        int count = 1;
        while(count != n){
            prev = curr;
            curr = curr.next;
            next = curr.next;
            count++;
        }

        prev.next = next;

        return head;
    }
}