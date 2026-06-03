/*
Problem : Stack
Problem Name :  Longest Valid Parentheses
LEETCODE # : 32
Difficulty : Hard
Topic : String | Dynamic Programming | Stack


Time Complexity  : O(n) 
Space Complexity : O(1)
*/

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
    
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(i);
            
            else{
                st.pop();
                if(st.isEmpty())
                        st.push(i);
                else
                    max = Math.max(max, i - st.peek());
            }
        }
        return max;
    }
}