/*
Problem : LinkedList
Problem Name : Rotate List
LEETCODE # : 61
Difficulty : Medium
Topic : Array | Math | Stack

Approach : Moving the pointer to that position 
        and rotating using Two pointers

Time Complexity  : O(n) 
Space Complexity : O(n) [Stack]
*/

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }

        
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        temp.next = head;

        k = k % count;
        k = count - k;

        if(k == 0)
            return head;

        int i = 1;
        temp = head;

        while(i < k){
            i++;
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
        
    }
}