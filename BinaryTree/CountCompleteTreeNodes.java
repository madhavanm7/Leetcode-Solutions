/*
Problem : Binary Tree
Problem Name : Count Complete Tree Nodes
LEETCODE # : 222
Difficulty : Easy
Topic : Binary Search | Bit Manipulation | Tree | Binary Tree

Approach : Calculating no of node using post order traversal 

Time Complexity  : O(n) Traversing all nodes
Space Complexity : O(n) Recursive calls [Stack]
*/
--------------------------------------------------------------------------------
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        int count = 0;
        return postOrder(root, count);
    }

    private static int postOrder(TreeNode root, int count){
        if(root != null){
            count++;
            count = postOrder(root.left, count);
            count = postOrder(root.right, count);
            
        }

        return count;
    }
}