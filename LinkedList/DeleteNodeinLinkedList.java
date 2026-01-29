package LinkedList;

/*
Problem : 237. Delete Node in a Linked List
LEETCODE # : 237
Difficulty : Medium
Topic :LinkedList

Approach : Modifying the value in the likned list nodes

Time Complexity  : O(n)
Space Complexity : O(1)
*/
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next, prev = node;

        // if(nextNode.next == null){
        //     node.val = nextNode.val;
        //     node.next = null;
        //     return;
        // }

        while(node.next != null){
            node.val = nextNode.val;
            prev = node;
            node = node.next;
            nextNode = nextNode.next;
        }

        prev.next = null;

    }
}