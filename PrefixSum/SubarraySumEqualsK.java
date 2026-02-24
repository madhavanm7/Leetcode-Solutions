/*
Problem : PREFIX SUM
Problem Name : Subarray Sum Equals K
LEETCODE # : 560
Difficulty : Medium
Topic : Array PrefixSum HashTable

Approach : Calculating all prefix sum and storing it in HashTable and retrieving
            at O(1) 

Time Complexity  : O(n)
Space Complexity : O(n) [For storing prefixsum elements in HashMap]
*/

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, sum = 0, count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        //Inserting Key 0 at initial which matches sum - k == 0
        map.put(0, 1);

        for(int i = 0; i < n; i++){
            //Calculating prefix sum 
            sum += nums[i];

            //Updating count with number of times the sum occured
            if(map.containsKey(sum - k))
                count += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
}