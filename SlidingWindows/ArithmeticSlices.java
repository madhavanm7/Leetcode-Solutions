package SlidingWindows;
/*
Problem : Sliding Window
Problem Name : Arithmetic Slices
LEETCODE # : 413C
Difficulty : Medium
Topic : Array Dynammic Programming Sliding Window

Approach : Calculating Difference between consecutive two elements of the array
            and checking whether it is an arithmetic subarrays 

Time Complexity  : O(n)
Space Complexity : O(1)
*/

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
    int curr = 0, sum = 0;
    for (int i=2; i<A.length; i++)
        if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
            curr += 1;
            sum += curr;
        } else {
            curr = 0;
        }
    return sum;
}
}