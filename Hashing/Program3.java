/*
Problem Statement:
Given an array of integers and a target value,
return the indices of two numbers such that 
their sum equals the target.

If no such pair exists, return [-1, -1].

Approach:
Use a HashMap to store:
- Key = number
- Value = index of that number

Traverse the array:
For each element:
    - Compute complement = target - current element
    - Check if complement exists in map
        → If yes, return stored index and current index
    - Else, store current element and its index in map

This avoids using nested loops.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class HashingDemo3 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1,14,8,6,9,4};
        int target = 13;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

}
