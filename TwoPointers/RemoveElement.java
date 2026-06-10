package TwoPointers;
/*
Problem :Two pointers
Problem Name : Remove Element 
LEETCODE # : 27
Difficulty : Easy
Topic : Two pointers | Array

Time Complexity  : O(n)
Space Complexity : O(1) 
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = -1;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}