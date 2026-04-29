package TwoPointers;
/*
Problem :Two pointers
Problem Name : Evaluate Reverse Polish Notation
LEETCODE # : 5
Difficulty : Medium
Topic : Two pointers | String | Dynamic Programming

Approach : Try all possible substrings from the given string and check
            whether it is Palindrome or not (Brute force approach)

Time Complexity  : O(n^3)
Space Complexity : O(n) 
*/

class Solution {
    public String longestPalindrome(String s) {
        int len1 = s.length();
        if(len1 == 0 || len1 == 1)
            return s;
        
        
        int i = 0; 
        int len = len1;
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder(String.valueOf(s.charAt(0)));

        

        while(i < len){
            while(i < len){
                if(isPalindrome(i, len - 1, s)){
                    if(s.substring(i, len).length() > sb.length()){
                        sb = new StringBuilder(s.substring(i, len));
                    }
                }
                len--;
            }

            i++;
            len = len1;
        }

        return sb.toString();



        
        
    }

    public static boolean isPalindrome(int x, int y, String str){

        while(x <= y){
            if(str.charAt(x) == str.charAt(y)){
                x++;
                y--;
            }

            else{
                return false;
            }
        }

        return true;
    }
}
