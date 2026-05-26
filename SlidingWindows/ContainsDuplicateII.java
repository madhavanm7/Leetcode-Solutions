package SlidingWindows;

/*
Problem : Sliding Window
Problem Name : Contains Duplicate II
LEETCODE # : 219
Difficulty : Easy
Topic : Sliding Window | Hash Table

Approach : Checking Duplicates using HashSet  

Time Complexity  : O(n) 
Space Complexity : O(1) 

--------------------------------------------------------------------------------
*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove the element that is now outside the window
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            // Try to add the current element. If it fails, a duplicate exists.
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}
