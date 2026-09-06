/*
Problem : Binary Search
Problem Name : Search a 2D Matrix
LEETCODE # : 153
Difficulty : Medium
Topic : Array | Binary Search | 

Approach : Calculating using Binary Search in Rotated Sorted Array

Time Complexity  : O(log n) 
Space Complexity : O(1) 

---------------------------------------------------------------------
*/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int low = 0, high = n - 1, mid;

        while(low <= high){
            mid = (low + high) / 2;

            if((nums[low] == nums[mid]) &&  (nums[mid] == nums[high]))
                break;
            

            if(nums[low] <= nums[mid]){
                if(nums[mid] <= nums[high])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            else{
                low++;
                high--;;
            }
        }
        return nums[low];  
    }
}