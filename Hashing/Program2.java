/*
Problem Statement:
Given an array of integers, check whether the array 
contains any duplicate element.

Return true if duplicate exists, otherwise return false.

Approach:
Use a HashSet to store elements while traversing the array.

For each element:
    - If element already exists in set → duplicate found → return true
    - Else → add element to set

Since HashSet does not allow duplicates, 
it helps detect repetition efficiently.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class HashingDemo2 {
    static boolean duplicate(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            if(hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
      int arr[] = new int[]{1,1,2,2,3,3,4,4,5};
      System.out.println(duplicate(arr));
    }
    
}

