package TwoPointers;
/*
Problem :Two pointers
Problem Name : 3 Sum
LEETCODE # : 15
Difficulty : Medium
Topic : Two pointers | Sorting | Array

Key Idea:
Sort the array and use a fixed pointer with two moving pointers 
        to find triplets summing to zero while skipping duplicates.
Time Complexity  : O(n^2)
Space Complexity : O(n) 
*/

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        

        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                
                
                int total = nums[i] + nums[j] + nums[k];
                if(total < 0)
                    j++;
                
                else if (total > 0)
                    k--;
                
                else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j + 1])
                        j++;
                    while(j < k && nums[k] == nums[k - 1])
                        k--;
                    j++;
                    k--;
                }
            }

        }

        return res;
    }
}
