/*
Problem Statement:
Find maximum sum of a contiguous subarray.

Example:
Input: [1,-2,3,5,-1,2]
Output: 9

Subarray:
[3,5,-1,2]

Approach:
Add elements to currentSum.
If currentSum becomes negative, reset it to 0
because negative sum will reduce future sums.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class CircularSubarray {

    static int kadane(int arr[]){

        int current = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            current = Math.max(arr[i], current+arr[i]);
            max = Math.max(max,current);
        }

        return max;
    }

    public static void main(String[] args){

        int arr[]={5,-3,5};

        System.out.println(kadane(arr));
    }

}
