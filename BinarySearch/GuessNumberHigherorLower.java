/*

Problem : Binary Search
Problem Name : Guess Number Higher or Lower
LEETCODE # : 374
Difficulty : Easy
Topic : Binary Search | Array

Approach : Performing Binary search

Time Complexity  : O(log n) 
Space Complexity : O(1) 

--------------------------------------------------------------------------------
*/

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class GuessNumberHigherorLower extends GuessGame {
    public int guessNumber(int n) {
        int low  = 0, high = n, res = -1;

        while(low <= high){
            int mid = low + ((high - low) / 2);

            if(guess(mid) == 0){
                res = mid;
                break;
            }
                
            else if(guess(mid) == -1)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return res;
    }
}