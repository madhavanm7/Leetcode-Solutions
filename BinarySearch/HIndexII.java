package BinarySearch;
/*

Problem : Binary Search
Problem Name : H-Index II
LEETCODE # : 275
Difficulty : Easy
Topic : Binary Search | Array

Approach : Calculating h-index linearly  

Time Complexity  : O(n) 
Space Complexity : O(1) 

--------------------------------------------------------------------------------
*/

class Solution {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length-1;

        while(low <= high){
            int diff = (high - low) + 1;

            if(citations[low] >= diff)
                return diff;
            else
                low++;

        }
        return 0;
    }
}