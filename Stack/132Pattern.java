import java.util.Stack;
/*
Problem : Stack
Problem Name :  132 Pattern
LEETCODE # : 456
Difficulty : Medium
Topic : Principal | Array | Binary Search | Stack | Monotonic Stack | Ordered Set


Time Complexity  : O(n) (Traversing Array)
Space Complexity : O(n) (At worst case)
*/
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int third = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < third)
                return true;

            while(!stk.isEmpty() && stk.peek() < nums[i])
                third = stk.pop();
            
            stk.push(nums[i]);
        }

        return false;
    }
}