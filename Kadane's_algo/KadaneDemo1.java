/*
Problem Statement:
Given an integer array, find the maximum sum of a contiguous subarray.

Example:
Input  : [-2,1,-3,4,-1,2,1,-5,4]
Output : 6
Explanation:
The subarray [4,-1,2,1] gives the maximum sum = 6.

Approach:
Use Kadane's Algorithm.
Maintain two variables:
currentSum → sum of current subarray
maxSum → maximum sum found so far

At each element decide:
1) Start new subarray
2) Continue previous subarray

Formula:
currentSum = max(arr[i], currentSum + arr[i])

Time Complexity: O(n)
Space Complexity: O(1)
*/

class KadaneBasic {

    static void maxSubarray(int arr[]){

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length;i++){

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void main(String[] args){

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubarray(arr);
    }

}
