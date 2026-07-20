/**
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

/*
Problem : Depth-First Search
LEETCODE # : 104
Difficulty : Easy
Topic : Tree | Breadth-First Search | Depth-First Search | Binary Tree


Time Complexity  : O(n) 
Space Complexity : O(1)
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    
}
