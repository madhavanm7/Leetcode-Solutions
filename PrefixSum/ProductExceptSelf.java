/*
Problem : PREFIX SUM
Problem Name : Product of Array Except Self
LEETCODE # : 238
Difficulty : Medium
Topic : Array PrefixSum Math

Approach : Calculating all prefix products and suffix products of numbers in an array, 
            calculating product of each element except self

Time Complexity  : O(n)
Space Complexity : O(n) [For storing prefixsum elements and result array]
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] res = new int[n];
        prefix[0] = 1;

        for(int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] * nums[i - 1];
        //Storing prefix sum of elements
        
        int curr = 1;
        res[n - 1] = prefix[n - 1];

        for(int j = n - 2; j >= 0; j--){
            curr = curr * nums[j + 1];
            //storing suffix elements and producting prefix elements and suffix elements
            res[j] = curr * prefix[j];
        }
        return res;
    }
}
