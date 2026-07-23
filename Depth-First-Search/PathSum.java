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
LEETCODE # : 112 Path Sum
Difficulty : Easy
Topic : Tree | Breadth-First Search | Depth-First Search | Binary Tree


Time Complexity  : O(n) 
Space Complexity : O(1)
*/
class Solution {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    private boolean helper(TreeNode root, int sum, int target){
        if(root == null)
            return false;
        sum += root.val;

        if(root.left == null && root.right == null){
            if(sum == target)
                return true;
            else
                return false;
        }
            
        return helper(root.left, sum, target) || helper(root.right, sum, target);
    }
}