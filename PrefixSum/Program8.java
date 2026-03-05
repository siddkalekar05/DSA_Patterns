/*
Problem Statement:
Given an array of integers, find the difference between
the maximum and minimum elements.

Example:
Input: {4,8,1,9}
Output: 8

Approach:
Initialize max and min with the first element of the array.
Traverse the array and update max if a larger element is found.
Update min if a smaller element is found.
Finally return max - min.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo9 {

    static void findDifference(int arr[]) {

        int max = arr[0];
        int min = arr[0];

        for(int num : arr) {

            if(num > max)
                max = num;

            if(num < min)
                min = num;
        }

        int diff = max - min;

        System.out.println("Difference : " + diff);
    }

    public static void main(String[] args) {

        int arr[] = {4,8,1,9};

        findDifference(arr);
    }
}
