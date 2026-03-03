/*
Problem Statement:
Given an array of integers, count the frequency of each element 
and print how many times each number appears.

Approach:
Use a HashMap where:
- Key = array element
- Value = frequency count

Traverse the array once.
For each element:
    - If it already exists in map → increase count
    - If not → insert with count = 1
Use getOrDefault() to simplify the logic.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class HashingDemo1 {
    static void hashing(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
       int arr[] = new int[]{1,2,3,1,2,1,4,3,4};
       hashing(arr);
    }
    
}

