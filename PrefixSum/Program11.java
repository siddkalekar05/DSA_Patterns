/*
Problem Statement:
Given an array, convert it into a running sum array
where each element becomes the sum of all previous elements.

Example:
Input: {1,2,3,4}
Output: {1,3,6,10}

Approach:
Traverse the array starting from index 1.
Update arr[i] = arr[i] + arr[i-1].

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo12 {

    static void runningSum(int arr[]) {

        for(int i = 1; i < arr.length; i++)
            arr[i] = arr[i] + arr[i-1];

        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        runningSum(arr);
    }
}
