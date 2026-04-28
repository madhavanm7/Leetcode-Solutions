/*
Problem : Stack
Problem Name : Evaluate Reverse Polish Notation
LEETCODE # : 150
Difficulty : Medium
Topic : Array | Math | Stack

Approach : Calculate the answer using Evaluating Postfix method 

Time Complexity  : O(n) n - no of elements in stack 
Space Complexity : O(n) [Stack]
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();        
    }
}
