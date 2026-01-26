/*
Problem : PREFIX SUM
LEETCODE # : 1352
Difficulty : Medium
Topic : Array PrefixSum Math

Approach : Keep all prefix products of numbers in an array, 
            then calculate the product of last K elements in O(1) complexity.

Time Complexity  : O(1)
Space Complexity : O(n) [For storing prefixsum elements]
*/

import java.util.ArrayList;

class ProductOfNumbers {

    ArrayList<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        int n = list.size();
        if(n == 0 && num != 0)
            list.add(num);
        
        else{
            if(num == 0)
                list.clear();
            //Clearing PrefixSum list when 0 is encountered
            else
                list.add(list.get(n - 1) * num);
            //Adding prefix sum element
            
        }
    }
    
    public int getProduct(int k) {
        int n = list.size();
        if(k == n)
            return list.get(n - 1);
        else if(k > n)
            return 0;
        else{
            return (list.get(n - 1) / (list.get(n - 1 - k)));
        }
    }
}

/**
 * ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
