/*
Problem : PREFIX SUM
LEETCODE # : 848
Difficulty : Medium
Topic : Array PrefixSum

Approach : Finding SuffixSum of the given array
            Shifting elements accordingly

Time Complexity  : O(n) [Traversing the string through characters for shifting]
Space Complexity : O(1)
*/
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        for(int i = n - 2; i >= 0; i--){
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
            //suffix sum and limiting by %26 of total alphabet length
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int originalPos = s.charAt(i) - 'a';     
            int newPos = (originalPos + shifts[i]) % 26;
            char newChar = (char)(newPos + 'a');   
            sb.append(newChar);
        }

        return sb.toString();
    }
   
}