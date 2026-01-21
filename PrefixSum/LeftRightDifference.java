/*
Problem : PREFIX SUM
LEETCODE # : 2574
Difficulty : Easy
Topic : Array PrefixSum

Approach : Finding PrefixSum and SuffixSum of the given array
            Calculating differences of it

Time Complexity  : O(n) [Traversing the array for finding PrefixSum and SuffixSum]
Space Complexity : O(n) [For storing prefixsum elements]
*/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length, curr = 0;

    

        int[] ans = new int[n];

        ans[0] = 0;

        //PrefixSum 

        for(int i = 1; i < n; i++){
            curr += nums[i - 1];
            ans[i] = curr;
        }

        curr = 0;
        ans[n - 1] = abs(curr, ans[n - 1]);

        //SuffixSum and calculating differences from PrefixSum
        for(int i = n - 2; i >= 0; i--){
            curr += nums[i + 1];
            ans[i] = abs(ans[i], curr);
        }

        return ans;
    }

    private static int abs (int a,int b){
        return (a < b) ? (b - a) : (a - b);
    }
    
}