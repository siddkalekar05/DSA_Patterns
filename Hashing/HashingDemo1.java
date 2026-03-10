/*
Problem Statement:
Count frequency of each element in array.

Example:
Input: [1,2,2,3,3,3]

Output:
1 -> 1
2 -> 2
3 -> 3

Approach:
Use HashMap
Store element as key
Increase count when element repeats

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class FrequencyCount {

    static void count(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){

            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,2,3,3,3};

        count(arr);
    }

}
