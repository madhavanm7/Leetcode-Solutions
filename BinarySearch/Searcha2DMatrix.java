package BinarySearch;
/*
Problem : Binary Search
Problem Name : Search a 2D Matrix
LEETCODE # : 74
Difficulty : Medium
Topic : Array | Binary Search | Matrix

Approach : Calculating using Binary Search on sorted matrix

Time Complexity  : O(log n) 
Space Complexity : O(1) 

---------------------------------------------------------------------
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row  = 0, column = matrix[0].length - 1;

        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target)
                return true;
            else if (matrix[row][column] > target)
                column--;
            else
                row++;
        }
        return false;
    }
}