/*
Problem Statement:
Find a peak element in an array.
A peak element is greater than its neighbors.

Example:
Input: [1,2,3,1]
Output: 3

Approach:
Use Binary Search.
If middle element is greater than next element,
the peak lies in the left half.
Otherwise search right half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.*;
class SearchingDemo6 {

    static int findPeak(int arr[]){

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int mid = (left + right) / 2;

            if(arr[mid] > arr[mid + 1])
                right = mid;

            else
                left = mid + 1;
        }

        return arr[left];
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,1};

        System.out.println("Peak Element: " + findPeak(arr));
    }
}
