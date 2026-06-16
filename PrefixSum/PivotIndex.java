/*
Problem :Prefix Sum
Problem Name : Find Pivot Index
LEETCODE # : 724
Difficulty : Easy
Topic : Prefix Sum | Array

Time Complexity  : O(n)
Space Complexity : O(1) 
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pf = 0;

        int[] suffixSum = new int[n];
        int sf = 0;

        for(int j = n - 1; j >= 0; j--){
            sf += nums[j];
            suffixSum[j] = sf;
        }

        for(int i = 0; i < n; i++){
            pf += nums[i];

            if(pf == suffixSum[i])
                return i;
            
        }

        return -1;
    }
}