/*
Problem Statement:
Given an array of integers, print all the leaders in the array.
An element is called a leader if it is greater than all the
elements to its right side.

Example:
Input:  {16,17,4,3,5,2}
Output: 17 5 2

Approach:
The last element is always a leader because there are no elements on its right.
Traverse the array from right to left.
Keep track of the maximum element seen so far.
If the current element is greater than maxRight, it is a leader.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo8 {

    static void findLeaders(int arr[]) {

        int maxRight = arr[arr.length - 1];

        System.out.print("Leaders : " + maxRight + " ");

        for(int i = arr.length - 2; i >= 0; i--) {

            if(arr[i] > maxRight) {

                maxRight = arr[i];

                System.out.print(maxRight + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {16,17,4,3,5,2};

        findLeaders(arr);
    }
}
