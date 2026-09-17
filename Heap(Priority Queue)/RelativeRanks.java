/*
Problem : 506.Relative Ranks
LEETCODE # : 506
Difficulty : Easy 
Topic :Senior | Array | Sorting | Heap(Priority Queue)


Time Complexity  : O(nlogn)
Space Complexity : O(n)
*/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = score.length; 
        String[] res = new String[n];

        for(int i = 0; i < n; i++)
            map.put(score[i], i);

        Arrays.sort(score);

        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1)
                res[map.get(score[i])] = "Gold Medal";
        
            else if(i == n - 2)
                res[map.get(score[i])] = "Silver Medal";
            
            else if(i == n - 3)
                res[map.get(score[i])] = "Bronze Medal";
            
            else
                res[map.get(score[i])] = Integer.toString(n - i);
            
        }
        
        
    return res;

    }
}